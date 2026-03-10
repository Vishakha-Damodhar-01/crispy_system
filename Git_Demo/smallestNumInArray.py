#Find the smallest element in list or array 
def smallestNum(l):
  for i in l:
    l.sort()
    print("Smallest element in array is : "+ l[0])

try:
  n=int(input("Enter a number of elements add in the list: "))
  l=[]
  for in range(n):
    x=int(input())
    l.append(x)
  print("Array is : ",l)
  smallestNum(l)

catch:
     print("Please enter a valid input ")
