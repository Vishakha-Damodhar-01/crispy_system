The fibonacci series logic -->next=First+sec, first-sec, sec=next
same logic just syntax change

def fibonacci(n,first,sec):
    print("The Fibonacci series is:")
    for i in range(n):
        print("first",end=" ")
        next=first+sec
        first=sec
        sec=next

n=int(input("Enter the number till you want fibonacci series: ")) 
first=0
sec=1
fibonacci(n,first,sec)



//output:
Enter the number till you want fibonacci series: 20
The Fibonacci series is:
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181
