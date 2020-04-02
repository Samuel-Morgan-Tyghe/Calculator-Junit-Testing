# Calculator-Junit-Testing
I take a look at Unit Testing a calculator.
[With String to Equation Solver Code made by Maksim Dmitriev](https://codereview.stackexchange.com/users/23821/maksim-dmitriev)


## What i learnt
* Junit can be used to test parts of code,

I'ts a Robust and cleaner version of System.out.Println(what happened now to that variable?).

* Multiple tests should be avoided 

* Eclipse results show either pass/fail/error , to conclude implimenting mulitple tests would mean you don't know which one failed.

* This is good practice for large projects where methodology can be forgotten .


* Define **type** ___________________test.constructor (Passing **type**).

* The constructor output type can be different type to the input.
 In this example, the calculator required a String input, with a Double Output.


## Update/To ammend :

The test requires the Output converted .toString to compare the two variables are equal.*

- [ ] Remove this step and just use Output as a Double type.*

This does cause an Error.

 error : ( The method assertEquals(double, double) from the type Assert is deprecated)

Which can potentially be resolved be replacing 

_"org.junit.**Assert**.assertEquals;"_ to _"org.junit.**Assertion**.assertEquals;"_

> not all _.assertEquals_ are equal.  :nerd_face:

## Preview Images : 
![alt text](https://github.com/Samuel-Morgan-Tyghe/Calculator-Junit-Testing/blob/master/Screen%20Shot%202020-04-02%20at%2010.04.20.png " Code to junit test")
![alt text](https://github.com/Samuel-Morgan-Tyghe/Calculator-Junit-Testing/blob/master/Screen%20Shot%202020-04-02%20at%2010.04.25.png " Complex Code test" )
![alt text](https://github.com/Samuel-Morgan-Tyghe/Calculator-Junit-Testing/blob/master/Screen%20Shot%202020-04-02%20at%2010.04.29.png " Simple Division Code test" )
