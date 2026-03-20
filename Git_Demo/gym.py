# Q1: Gym Membership Problem Statement
# The gym offers membership plans for specific durations. The cost of each plan is as follows:
# 1-month membership → ₹2000
# 3-month membership → ₹5000
# 6-month membership → ₹9000
# 9-month membership → ₹12000
# 12-month membership → ₹15000
# Write a program that:
# Takes the membership duration (in months) as input.
# Displays the corresponding membership cost.
# If the user enters a duration other than the specified plans, the program should display an error message:"Invalid Input"

def gym(month):
    if month==1:
        print("Cost of 1 month is 2000")
    elif month==3:
        print("Cost of 3 month is 5000")
    elif month==6:
        print("Cost of 6 month is 9000")
    elif month==9:
        print("Cost of 9 month is 12000")
    elif month==12:
        print("Cost of 12 month is 15000")
    else:
        print("Invalid input,please check the plan again")


month=int(input("Enter a month: "))
gym(month)
