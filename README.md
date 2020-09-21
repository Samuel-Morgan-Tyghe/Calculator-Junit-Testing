# Calculator-Junit-Testing
I take a look at Unit Testing a calculator.
[With String to Equation Solver Code made by Maksim Dmitriev](https://codereview.stackexchange.com/users/23821/maksim-dmitriev).


## What I learnt
* Junit can be used to test parts of code.

It's a Robust and cleaner version of System.out.Println(what happened now to that variable?).

* Multiple tests should be avoided. 

* Eclipse results show either pass/fail/error. In conclusion, implementing multiple tests would mean you don't know which one would pass/fail/error.

* This is good practice for large projects where the method can be forgotten.


* Define **type** ___________________test.constructor (Passing **type**).

* The constructor output type can be a different type to the input.
 In this example, the calculator required a String input, with a Double Output.


## Update/To amend :

The test requires the Output converted .toString to compare the two variables are equal.*

- [ ] Remove this step and just use Output as a Double type.*

This causes an Error.

 "Error : ( The method assertEquals(double, double) from the type Assert is deprecated)"

Which can potentially be resolved be replacing 

_"org.junit.**Assert**.assertEquals;"_ to _"org.junit.**Assertion**.assertEquals;"_

> not all _.assertEquals_ are equal.  :nerd_face:

## Preview Images : 
![alt text](https://github.com/Samuel-Morgan-Tyghe/Calculator-Junit-Testing/blob/master/Screen%20Shot%202020-04-02%20at%2010.04.20.png " Code to junit test")
![alt text](https://github.com/Samuel-Morgan-Tyghe/Calculator-Junit-Testing/blob/master/Screen%20Shot%202020-04-02%20at%2010.04.25.png " Complex Code test" )
![alt text](https://github.com/Samuel-Morgan-Tyghe/Calculator-Junit-Testing/blob/master/Screen%20Shot%202020-04-02%20at%2010.04.29.png " Simple Division Code test" )
