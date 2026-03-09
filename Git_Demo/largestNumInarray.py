#1. Largest Number from array;:

def largestNum(l):
  largest=l[0]
  for i in l:
    if i>largest:
      largest=i
  print("Largest number from array: ",largest)

def smallestNum(l):
  smallest=l[0]
  for i in l:
    if i<smallest:
      smallest=i
    print("smallest number from array: ",smallest)

try:
    n = int(input("Enter the number of elements added in the list: "))
    l = []
    print("Enter", n, "values in array")
    for i in range(n):
        x = int(input(f"Value {i+1}: "))
        l.append(x)
    
    print("Original List:", l)
    # Call function
    largestNum(l)
    smallestNum(l)

except ValueError:
    print("Invalid input. Please enter only integers.")
