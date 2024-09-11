from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.common.by import By
import time  # Optional: Only if you need a delay for loading elements

# Set up the service for chromedriver
service = Service(r"C:\Users\chromedriver.exe")  # Ensure this is the correct path to chromedriver.exe

# Set up Chrome options
chrome_options = Options()
chrome_options.add_argument(r"user-data-dir=C:\Users\ra4ch\AppData\Local\Google\Chrome\User Data")  # Use the correct path
chrome_options.add_argument(r"profile-directory=Default")  # Use the correct profile folder, usually "Default"

# Initialize the WebDriver
driver = webdriver.Chrome(service=service, options=chrome_options)

# Navigate to the target URL
driver.get("https://pc-builds.com/fps-calculator/result/1nt1hl/4w/grand-theft-auto-v/2560x1440/")
print(driver.current_url)

# Optional: Wait for the page to load completely
time.sleep(5)  # Adjust time if necessary

# Locate the element using the provided XPath
xpath = '//*[@id="result"]/div[1]/div[2]/ul/li[1]/b[1]'  # Replace with the actual XPath of the element you want to copy
element = driver.find_element(By.XPATH, xpath)

# Extract and print the text of the element
text_to_copy = element.text
print(f"Copied Text: {text_to_copy}")
