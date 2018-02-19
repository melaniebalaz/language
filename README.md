This project started out as a very short project for University, where the goal was to implement a language parser
using ANTLR for a simple calculator. I have been working on further extending the language since then.

My goals for this language:

* Functional (no classes so far, immutable variables, very little state)
* Easy to use for beginners
* Sound similar to english, while at the same time not being too verbose
* Personally learn about concepts like stacks and variable scope

#### Implemented functionality:

###### Datatypes
The language is dynamically typed, so you do not need to declare variable types.
**Strings** are defined with double quotes ""

###### Basics:

*printing* <br>
out: var

*loops* <br>
foreach x in var do x+1