def prime(l):
  print("prime numbers: ")
  for i in l:
    c=0
    for n in range(2,i):
        if i%n==0:
            c=1
            break
    if c==0:
        print(i)  

n=int(input("Enter the number of elements added in the list: ")) 
l=[]
print("Enter ",n,"values in array")
for z in range(n):
  x=int(input())
  l.append(x)

print("Original List:",l)
#Call function
prime(l)
