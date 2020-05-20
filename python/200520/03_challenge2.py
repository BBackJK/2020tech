#  교재 p.115 5번 문제

time = input("시각 정보(16:30:15) 입력 >> ")
print("입력 시각 정보: ", time)

hours, mine, secs = time.split(":")

print(hours+'시 '+mine+'분 '+secs+'초 ')
