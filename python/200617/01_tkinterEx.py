from tkinter import *

win = Tk()

win.title("레이블의 다양한 모습")

rtype = ["flat", "groove", "raised", "ridge", "solid", "sunken"]

for t in rtype:
    lb = Label(win, text=t, relief=t)
    lb.pack()

win.mainloop()