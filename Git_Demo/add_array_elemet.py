import numpy as np

lst = []
n = int(input("Enter number of elements you want to add in array: "))

for i in range(n):
    lst.append(int(input("Enter element: ")))

arr = np.array(lst)
print(arr)
