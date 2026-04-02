import numpy as np

lst = []
n = int(input("How many elements? "))

for i in range(n):
    lst.append(int(input("Enter element: ")))

arr = np.array(lst)
print(arr)
