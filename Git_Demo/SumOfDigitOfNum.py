
def Sumofdigitofnum(n):
    sum=0
    while n>0:
        p=n%10
        sum=sum+p
        n=n//10
    print("Sum of digit of anumber: ",sum)

n=int(input("Enter a number: "))
Sumofdigitofnum(n)
