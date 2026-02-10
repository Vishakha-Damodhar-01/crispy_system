#String operations

def string(str1,str2):
    print("Length of string: ",len(str1))
    print("Convert string into uppercase: ",str1.upper())
    print("Convert string into lowercase: ",str1.lower())
    concatenated_string = str1 + str2
    print("Concatenate 2 strings: ", concatenated_string)
    
str1=input("Enter a string 1: ")
str2=input("Enter string 2: ")
string(str1,str2)
