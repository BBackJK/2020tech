import random

def nrandom(start, end, n, duplicated = False):
    lst = []
    if duplicated:
        for _ in range(n):
            lst.append(random.randint(start, end))
    else:
        lst = list(random.sample(range(start, end+1), n))
    
    return sorted(lst)

