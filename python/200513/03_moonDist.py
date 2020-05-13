# 교재 p.53 예제

distance = 384400
unit = 10000
manUnit, remainder = divmod(distance, unit)
print('지구에서 달 까지의 거리: ', manUnit, '만', remainder, '킬로미터')