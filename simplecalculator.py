
# Online Python - IDE, Editor, Compiler, Interpreter

a=float(input("enter the number"))
b=float(input("enter the number"))
print("1.add\n 2.subtraction\n 3.multiplication\n 4.division)\n")
choice=int(input("enter the choice:"))
if choice==1:
    print("sum of two numbers",a+b)
elif choice==2:
    print("subtraction of two numbers",a-b)
elif choice==3:
    print("multiplication of two numbers",a*b)
elif choice==4:
    print("divsion of two numbers",a/b)
else:
    print("invalid choice")