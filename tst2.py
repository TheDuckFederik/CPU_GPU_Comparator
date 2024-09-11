#
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.chrome.service import Service
#
service = Service(r"C:\Users\chromedriver.exe")  # Use the correct path
driver = webdriver.Chrome(service=service)
#
driver.get("https://pc-builds.com/fps-calculator/result/1nt1hl/4w/grand-theft-auto-v/2560x1440/")
print(driver.current_url)
#
