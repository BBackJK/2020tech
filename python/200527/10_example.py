def reverse(data):
    for idx in range(len(data)-1,-1,-1):
        yield data[idx]
    

for char in reverse('gold'):
    print(char)