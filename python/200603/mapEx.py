def add1(x):
    return x+1

nums = [2, 6, 7, 13, 3, 21]
mapped = list(map(add1, nums))
print(mapped)


mapset = set(map(lambda num: num % 2, nums))

print(mapset)