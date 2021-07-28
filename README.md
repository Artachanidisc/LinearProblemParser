# LinearProblemParser
---------------------------------------------------------------------------------------------
A program that parses a linear problem, in the form of input.txt and creates 
the following matrices:

Α: Dimensions mxn. Contains the factors of the technological constraints. 
 
b: Dimensions mx1. Contains the right side of the technological constraints.
 
c: Dimensions 1xn. Contains the factors of of the objective function.
 
Eqin: Dimensions mx1. Contains the category of each constraint. 
if Eqin(i)= –1  , then we are reffering to this one ≤
else if Eqin(i)= 1, then we are reffering to this one ≥ 
else if Eqin(i)= 0, then we are reffering to this one =                                                                                                                        

MinMax: Dimensions 1x1. Specifies the type of our problem. 
if MinMax=-1, our linear problem is minimization
else if MinMax = 1, the problem is maximization.
