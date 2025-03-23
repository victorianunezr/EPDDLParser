Owner Predicate Implementation
In our domain, we use an owner predicate to specify which agents are permitted to execute a given action. This approach decouples the action schemas from hard-coded agent names, keeping the domain generic while allowing the problem definition to determine ownership. Here’s an overview of how it works:

Domain Definition:

We define a new type (e.g., action) and declare action constants:
lisp
Copy
(:types position agent action)
(:constants move-left move-right - action)
The owner predicate is defined to relate an agent to an action:
lisp
Copy
(:predicates
    (owner ?agent - agent ?action - action)
    (at ?pos - position)
    (adjacent ?pos0 - position ?pos1 - position)
    (leftmost ?pos - position)
    (rightmost ?pos - position)
    (turn ?agent - agent)
    (nextturn ?agent - agent)
    (goal ?pos - position)
)
In action schemas, rather than hardcoding owners, a precondition is included that checks ownership. For example, for a move-left action:
lisp
Copy
(:action move-left
    :parameters (?agent - agent ?next-agent - agent ?pos - position ?next-pos - position)
    :precondition (and 
                    (at ?pos)
                    (not (leftmost ?pos))
                    (adjacent ?next-pos ?pos)
                    (turn ?agent)
                    (nextturn ?next-agent)
                    (owner ?agent move-left)
                   )
    :effect (and
                (at ?next-pos)
                (not (at ?pos))
                (not (turn ?agent))
                (turn ?next-agent)
                (nextturn ?agent)
             )
    :accessibility ()
)
Problem Specification:

In the problem file, agents are declared along with the initial state. The owner facts are provided to indicate which agents are authorized for each action:
lisp
Copy
(:objects
    Alice Bob - agent
    pos0 pos1 pos2 pos3 pos4 - position
)
(:init
    (owner Alice move-left)
    (owner Bob move-left)
    ;; Further facts such as (turn Alice) and (nextturn Bob) are also specified.
)
This setup makes the domain independent of specific agents while allowing each problem instance to define who “owns” each action.
Implementation in Code:

When an action is instantiated, the variable assignment (e.g., mapping ?agent to a specific agent object) is checked against the owner predicate. This ensures that only an authorized agent can execute the action.
The planning system uses this ownership check as part of the precondition evaluation, enforcing the turn-based behavior in a flexible and reusable manner.
Using the owner predicate allows for clear, modular domain definitions that can be adapted to various problem instances without modifying the action schemas. It ensures that the allowed agents are determined by the problem definition while the domain remains generic and declarative.

