# How to take user input in the list
n=int(input("Enter the number of elements need to add: "))
l=[]
print("enter",n," elements in l:")
for i in range(n):
    x=int(input())
    l.append(x)
    
print(l)
