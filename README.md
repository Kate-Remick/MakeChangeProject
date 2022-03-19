## Make Change Project

### Week 1 Homework for Skill Distillery

## Overview

Cash register simulator.

This simple program takes two inputs from the user: a price and amount tendered. With this information, it will determine the amount of change required as well as the number of bills and coins to be returned to the customer, using the least amount of each type. If the amount paid is less than the price, it will display as such. If the amount is exact (no change), the program will display a message and forgo change. 

## Technologies/Skills Used

* Java
* Eclipse
* Google

## Lessons Learned

*  0 % (any_number) = 0. Thanks to the way I wrote my for loops in the program, this meant that if adding a nickel brought the difference to zero, the program would remain in that loop, adding nickels infinitely instead of stopping and exiting the loop. I did not understand why MakeChange was infinitely adding to the change amount until I did some investigation of the % operator, using System.out.println() to see what was happening with each computation. I corrected the error in my program by adding a condition that required the difference to be greater than or equal to the monetary denomination amount, and greater than zero.

* 	Math can be inaccurate when doing computations in 64 bits. Thanks to limitations of the double data type, I need to utilize methods like Math.round() to accurately output and carry forward values during computation. Small differences in value due to these computation limitations can mean failure of a program to accurately determine the conditions necessary to initiate a loop, therefore preventing the program to execute as desired.
	I found this out while confused as to why my MakeChange program was failing to add the correct amount of nickels and pennies, in spite of all of the math appearing to be correct. I used System.out.println(), to investigate where the errors were occurring and made corrections using Math.round.(). After applying Math.round() after every computational loop, my MakeChange program worked as intended.  
