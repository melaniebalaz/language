This project started out as a very short project for University, where the goal was to implement a language parser
using ANTLR for a simple calculator. I have been working on further extending the language since then.

My goals for this language:

* Functional (no classes so far, immutable variables, very little state)
* Easy to use for beginners
* Sound similar to english, while at the same time not being too verbose
* Personally learn about concepts like stacks and variable scope

## General

After each statement there needs to be a newline. The value of whatever is the last statement of 
a program/function is returned<br>
Variables can only be assigned once, at.balaz.lang.operations on this variable (such as appending values to a list) 
always return a new datacontainer, which needs to be saved.

**Comments** <br>
Single-line comments <br>
`//This is a comment`


## Datatypes
The language is dynamically typed, so you do not need to declare variable types.

## Primitives
**Numbers** (stored as Java BigDecimals) <br>
`15` <br>
`15.38` <br>
**Strings** are declared with double quotes "" <br>
`"string"` <br>
**Lists** are declared with <br>
`list(1,2,3)` <br>
**Dictionaries** are declared with <br>
`(x:1,y:2,z:3)` <br>
**Variables** can be assigned any of the above at.balaz.lang.primitives, as well as at.balaz.lang.functions and are declared with <br>
`var = "content""`

## Functions

**Function Declaration**  <br>
Functions are declared with 
```
(a,b):
a+b.
```
The final statement of a function declaration must end with a `.`<br> 
Function parameters go in the brackets. 
They can be any of the at.balaz.lang.primitives or a function declaration/call stored in a variable.
In order to use the declared function, it needs to be stored inside a variable.
```
add = (a,b):
a+b.
``` 
 
**Function Call**  <br>

Functions can be called with
```
add = (a,b):
a+b.
add(2,3)
```
## Basic Operations
**Numbers** can be added, subtracted, multiplied and divided with `+ - * /` <br>

**Strings** can be appended with the + operator <br>
```
"hello " + "world"
//returns: "hello world"
```

**Lists** can be appended with the + operator <br>
```
hello = list("hel","lo")
world = list("wor","ld")
hello + world
//returns: list("hel","lo","wor","ld")
```

```
hello = list("hel","lo")
var = list(1,2)
hello + var
//returns: list("hel","lo",1,2)
```

```
hello = list("hel","lo")
var = 3
hello + var
//returns: list("hel","lo",3)
```

## Language Constructs:

*printing* <br>
`out: var`

### Loops
**Foreach Loop** <br>
`foreach x in var do x+1` <br>
Where var is a list on each of which elements x an operation (for example x+1) is performed

## Built in Functions:
*reverse* <br>
```
reverse("String")
//returns: "gnirtS"
```
```
reverse(list(1,2,3))
//returns: list(3,2,1)
```