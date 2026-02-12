def even(l):
  print("even numbers in list: ")
  for i in l:
    if i%2==0:
      print(i," ")
def odd(l):
  print("odd numbers from the list: ")
  for i in l:
    if i%2==1:
      print(i)
n=int(input("enter number of elemets added in the list: "))
l=[]
print("enter ",n, " elements in list")
for i in range(n):
  x=int(input())
  l.append(x)

print("Original List: ")
even(l)
odd(l)
