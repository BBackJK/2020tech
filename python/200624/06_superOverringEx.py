class Singer:
    def __init__(self, name, debut):
        self.name = name
        self.debut = debut

    def introduce(self):
        print('안녕하세요! 가수 %s 입니다.' %self.name)

    def age(self):
        print('데뷔한지 %d 년이 됐네요.' %(2020-self.debut+1))

class KPopGroup(Singer):
    def __init__(self, name, debut, cnt):
        super().__init__(name, debut)
        self.cnt = cnt

    def introduce(self):
        super().introduce()
        print('우린 KPop 그룹으로 %d 명 입니다.' %self.cnt)

bts = KPopGroup('BTS', 2013, 7)         # 안녕하세요! 가수 BTS 입니다.
bts.introduce()                         # 우린 KPop 그룹으로 7 명 입니다.
bts.age()                               # 데뷔한지 8 년이 됐네요.

    