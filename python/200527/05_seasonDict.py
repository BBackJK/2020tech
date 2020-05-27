# 교재 p.217 예제

season = { '봄': 'spring',  '여름':'summer', '가을':'autumn', '겨울': 'winter' }

print(season.keys())        # dict_keys(['봄', '여름', '가을', '겨울'])
print(season.items())       # dict_items([('봄', 'spring'), ('여름', 'summer'), ('가을', 'autumn'), ('겨울', 'winter')])
print(season.values())      # dict_values(['spring', 'summer', 'autumn', 'winter'])

for key in season.keys():
    print('%s %s ' % (key, season[key]))
print()

for item in season.items():
    print("{} {} ".format(item[0], item[1]), end= " ")
print()

for item in season.items():
    print('{} {} '.format(*item), end=" ")
print()
