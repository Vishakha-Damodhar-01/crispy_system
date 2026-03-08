#List in ascending order...

def acending(l):
  l.sort()
  print("Array elements in ascending order: ",l)

def decending(l):
  l.sort(reverse=true)
  print("array elements in decending order: ",l)
    
n=int(input("enter number of elemets added in the list: "))
l=[]
print("enter ",n, " elements in list")
for i in range(n):
  x=int(input())
  l.append(x)

print("Original List: ",l)
acending(l)
decending(l)
