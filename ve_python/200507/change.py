# 환전 프로그램

def main():
    print("Change Counter")
    print()
    print("Please enter count of each coin type.")
    quarters = eval(input("Quarters: "))
    dimes = eval(input("Dimes: "))
    nickels = eval(input("Nickels: "))
    pennies = eval(input("Pennies: "))
    total = quarters * 0.25 + dimes * 0.10 + nickels * 0.05 + pennies * 0.01
    print()
    print("The total value of your change is ", total)


main()