def mySort(list):
    lists = []
    for i in list:
        lists.append(i[len(i)-1:len(i)])
    lists.sort()
    print(lists)                                # ['d', 'e', 'k', 'n']

def teacherSort(x):
    return x[-1]

colors = ["red", "green", "black", "white"]
mySort(colors)
teacherSort(colors)
print(colors)                                   # ['red', 'green', 'black', 'white']
