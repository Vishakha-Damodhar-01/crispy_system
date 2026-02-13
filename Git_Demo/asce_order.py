#List in ascending order...

def list(l):
  l.sort()
  print("Array elements in ascending order: ",l)
    
n=int(input("enter number of elemets added in the list: "))
l=[]
print("enter ",n, " elements in list")
for i in range(n):
  x=int(input())
  l.append(x)

print("Original List: ",l)
list(l)
