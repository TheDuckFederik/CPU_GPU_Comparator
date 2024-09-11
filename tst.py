from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.chrome.options import Options

# Set up the path to the ChromeDriver executable
service = Service(r"C:\Users\chromedriver.exe")  # Ensure this is the correct path to chromedriver.exe

# Set up Chrome options to use an existing profile
chrome_options = Options()
# Adjust the path below to point to your actual user data directory
chrome_options.add_argument(r"user-data-dir=C:\Users\ra4ch\AppData\Local\Google\Chrome\User Data")  # Use the correct path
chrome_options.add_argument(r"profile-directory=Default")  # Use the correct profile folder, usually "Default"

# Initialize the Chrome driver with service and options
driver = webdriver.Chrome(service=service, options=chrome_options)

# Open a webpage to test the setup
driver.get("https://pc-builds.com/fps-calculator/result/1nt1hl/4w/grand-theft-auto-v/2560x1440/")
print(driver.current_url)
