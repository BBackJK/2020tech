# 교재 p.122 영화 조조 할인 판정 

from time import localtime

hour = localtime().tm_hour
mnt = localtime().tm_min

if hour < 10:
    print("현재 시각: %d시 %d분, 조조 할인 가능합니다." %(hour, mnt))
else:
    print("현재 시각: %d시 %d분, 조조 할인 불가능합니다." %(hour, mnt))