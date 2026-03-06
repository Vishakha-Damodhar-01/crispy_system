# TCS question
def task(n,r):
    sum=0
    while n>0:
        p=n%10
        sum=sum+p
        n=n//10

    print("Sum of digit of number:",sum)
    add=r*sum
    rev=0
    while add>0:
        x=add%10
        rev=rev+x
        add=add//10
    print("we get the value after multiplying the addition of a number with",r," i.e :",rev)

    if r==rev:
        print("We got the correct output")
    else:
        print("We didnt get the correct output")


n=int(input("Enter a number: "))
r=int(input("Enter a num between (0-2): "))
task(n,r)





# Problem Statement
An intelligence agency has received reports about some threats. The reports consist of numbers in a mysterious method. There is a number “N” and another number “R”. These numbers
are studied thoroughly and it is concluded that all digits of the number N are summed up and this action is performed R number of times. The resultant is also a single digit that is yet to be deciphered.
The task here is to find the single-digit sum of the given number N by repeating the action R number of times.
If the value of R is 0, print the output as 0.

Example 1
Input
99  -> Value of N
3   -> Value of R
Output
9 -> Possible ways to fill the cistern.
Explanation

Here, the number N = 99

Sum of the digits of N:
9 + 9 = 18

Repeat step 2 R times (3 times)
(9+9) + (9+9) + (9+9)
= 18 + 18 + 18
= 54

Add digits of 54 as we need a single digit
5 + 4 = 9

Hence, the output is 9.

Example 2
Input
1234 -> Value of N
2    -> Value of R
Output
2 -> Possible ways to fill the cistern
Explanation

Here, the number N = 1234

Sum of digits of N
1 + 2 + 3 + 4 = 10

Repeat step 2 R times (2 times)
(1+2+3+4) + (1+2+3+4)
= 10 + 10
= 20

Add digits of 20 to get a single digit
2 + 0 = 2

Hence, the output is 2.

Constraints
0 < N <= 1000
0 <= R <= 50
Input Format

The candidate has to write code to accept 2 inputs.

First input: Accept value for N (positive integer number)

Second input: Accept value for R (positive integer number)







