from tkinter import *

def add():
    n = int(count.get())
    n += 1
    count.set(n)

def sub():
    n = int(count.get())
    n -= 1
    count.set(n)

str=["더하기", "빼기"]
win = Tk()

count = StringVar(value = "0")

data = Label(win, width=20, textvariable = count)
data.grid(row=1, column=0, columnspan=2)

badd = Button(win, text = str[0], command = add)
badd.grid(row = 1, column = 0)
bsub = Button(win, text = str[1], command=sub)
bsub.grid(row=1, column =1)

win.mainloop()