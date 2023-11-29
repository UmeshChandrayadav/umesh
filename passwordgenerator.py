import random
lower='abcdefghijklmnopqrstuvwxyz'
upper='ABCDEFGHIKLMNOPQRSTUVWXYZ'
symbols='()[]{};_#*._'
numbers='0123456789'
password=''
l=int(input("enter the number of lower letters:"))
le=int(input("enter the number of upper letters:"))
s=int(input("enter the number of symbols:"))
n=int(input("enter the number of numbers:"))
for i in range(1,l+1):
    char=random.choice(lower)
    password+=char
for i in range(1,le+1):
    char=random.choice(upper)
    password+=char
for i in range(1,s+1):
    char=random.choice(numbers)
    password+=char
for i in range(1,n+1):
    char=random.choice(symbols)
    password+=char
print(password)

    
