#1. In increasing order
for i in range(1,5):
  for j in range(1,i+1):
    print("*",end=" ")
  print()
  
#2. ALl with same rows and columns
for i in range(5, 0, -1):
  for j in range(5, 0, -1):
    print("*", end=" ")
  print()
