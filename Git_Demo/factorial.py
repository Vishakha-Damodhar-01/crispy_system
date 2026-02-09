#Factorial of a number whose input is taken from the user
def factorial(n):
  f=1
  for i in range(1,n+1):
    f=f*i
  print("Factorial of ",n,"is ",f)

n=int(input("Enter a number: "))
factorial(n)



