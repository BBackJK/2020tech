# 교재 p.156 문제 4번

h = int(input("당신의 키(cm)는 몇 cm인가요 >> "))
w = int(input("당신의 몸무게(kg)는 몇 kg인가요 >> "))

print("키: %d(cm), 몸무게: %d(kg)" % (h, w))

bmi = w / (h /100)**2
status = ""

if bmi >= 40:
    status = "고도 비만"
elif 39.9 >= bmi >= 35:
    status = "중등도 비만"
elif 34.9 >= bmi >= 30:
    status = "비만"
elif 29.9 >= bmi >= 25:
    status = "과체중"
elif 24.9 >= bmi >= 18.5:
    status = "정상"
else:
    status = "저체중"

print("BMI: %.1f %s" %(bmi, status))