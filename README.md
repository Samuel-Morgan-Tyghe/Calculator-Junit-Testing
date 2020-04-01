# Calculator-Junit-Testing
I take a look at Unit Testing a calculator.

## What i learnt
* Junit can be used to test parts of code,
I'ts a Robust and cleaner version of System.out.Println(what happened now to that variable?).

* Multiple tests should be avoided ,
Eclipse results show either pass/fail/error , mulitple test would mean you don't know which one failed.

* This is good practice for large projects where methodology can be forgotten .


* Define type ...................test.constructor (Passing type).

* Even though the output could be a different type.
In this, the calculator required a String input, with a Double Output.

Output .toString to compare two variables are equal.*

## Update/To ammend :
- [ ] Remove this step and just use Output as a Double type.*
error : ( The method assertEquals(double, double) from the type Assert is deprecated) 
can potentially be resolved be replacing 
"org.junit.Assert.assertEquals;" to
"org.junit.Assertion.assertEquals;"

> not all .assertEquals are equal.  :nerd_face:
