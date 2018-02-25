This project started out as a very short project for University, where the goal was to implement a language parser
using ANTLR for a simple calculator. I have been working on further extending the language since then.

My goals for this language:

* Functional (no classes so far, immutable variables, very little state)
* Easy to use for beginners
* Sound similar to english, while at the same time not being too verbose
* Personally learn about concepts like stacks and variable scope

#### Implemented functionality:

After each statement there needs to be a newline. The value of whatever is the last statement of 
a program/function is returned<br>

###### Datatypes
The language is dynamically typed, so you do not need to declare variable types.

###### Primitives
**Numbers** (stored as Java BigDecimals) <br>
`15` <br>
`15.38` <br>
**Strings** are declared with double quotes "" <br>
`"string"` <br>
**Lists** are declared with <br>
`list(1,2,3)` <br>
**Dictionaries** are declared with <br>
`(x:1,y:2,z:3)`

###### Basic Operations
**Strings** can be appended with the + operator <br>
```
"hello " + "world"
@returns: "hello world"
```

**Lists** can be appended with the + operator <br>
```
var hello = list("hel","lo")
var world = list("wor","ld")
hello + world
@returns: list("hel","lo","wor","ld")
```

###### Language Constructs:

*printing* <br>
`out: var`

*loops* <br>
`foreach x in var do x+1`

###### Built in Functions:
*reverse* <br>
```
reverse("String")
@returns: "gnirtS"
```
```
reverse(list(1,2,3))
@returns: list(3,2,1)
```