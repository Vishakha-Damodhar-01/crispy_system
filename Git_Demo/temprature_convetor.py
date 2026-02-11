#Temprature converter in python function
def temp(F,C):
  celius=(F-32)*5/9
  fahrenheit=C*9/5+32
  print("Temprature convert from fahrenheit to celcius: ",celius)
  print("Temprature convert from celcius to fahrenheit: ",fahrenheit)
 
F=float(input("Enter temprature in Fahrenheit: "))
C=float(input("Enter temprature i degree: "))
temp(F,C)

 
