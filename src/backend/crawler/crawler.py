import requests
from bs4 import BeautifulSoup


def main():
    s = "taipei 32!"
    url="https://www.cwb.gov.tw/V8/C/W/Town/Town.html?TID=6300100"
    r = urllib.request.urlopen(url)
    text = r.text
    print(text)
    soup = BeautifulSoup(text, 'html.parser')
    content = soup.find(id="TableId3hr")
    print(content)
    return text
main()