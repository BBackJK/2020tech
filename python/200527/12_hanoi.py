def hanoi(nplate, sPeg=1, ePeg=3):
    if nplate != 0:
        hanoi(nplate-1, sPeg, 6-sPeg-ePeg)
        print(sPeg,"번 기둥의", nplate,"번 접시를", ePeg,"번 기둥에 옮긴다.")
        hanoi(nplate-1, 6-sPeg-ePeg, ePeg)

np = int(input("접시의 수는? "))
hanoi(np)