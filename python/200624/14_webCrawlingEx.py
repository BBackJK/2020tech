# 웹 크롤링 기초

import urllib.request

from bs4 import BeautifulSoup

data = urllib.request.urlopen('https://comic.naver.com/webtoon/weekdayList.nhn?week=sat')       # 크롤링 하고 싶은 사이트 url 입력

soup = BeautifulSoup(data, 'html.parser')       # 데이터를 html.parser로 추출 준비

cartoons = soup.find_all('div', class_='thumb')     # 모든 'div'태그를 찾는데 class가 thumb으로 되어있는 클래스를 추출
print(cartoons)

txt = cartoons[0].find('a').text
tit = cartoons[0].find('a')['title']
lnk = cartoons[0].find('a')['href']
print(tit, lnk)


# 반복문으로 크롤링

# for item in cartoons:
#     title = item.find('a')['title']
#     print(title)