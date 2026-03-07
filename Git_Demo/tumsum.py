# Input: nums = [2,7,11,15], target = 9
# Output: [0,1]
# Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]

def task(l,target):
    for i in range(len(l)):
        for j in range(i+1,len(l)):
           if l[i]+l[j]==target:
               print("Indices: ",[i,j])


n=int(input("Enter the number of elements dhould add: "))
l=[]
for i in range(n):
    x=int(input())
    l.append(x)

print("array: ",l)
target=int(input("Enter target value: "))
task(l,target)

