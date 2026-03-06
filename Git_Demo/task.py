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



