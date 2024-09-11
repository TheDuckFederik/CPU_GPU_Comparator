#
from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.chrome.options import Options
#
service = Service(r"C:\Users\chromedriver.exe")  # Ensure this is the correct path to chromedriver.exe
#
chrome_options = Options()
#
chrome_options.add_argument(r"user-data-dir=C:\Users\ra4ch\AppData\Local\Google\Chrome\User Data")  # Use the correct path
chrome_options.add_argument(r"profile-directory=Default")  # Use the correct profile folder, usually "Default"
#
driver = webdriver.Chrome(service=service, options=chrome_options)
#
driver.get("https://pc-builds.com/fps-calculator/result/1nt1hl/4w/grand-theft-auto-v/2560x1440/")
print(driver.current_url)
#
