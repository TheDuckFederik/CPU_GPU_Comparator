//
package web;
//
// import java.security.Key;
// import java.time.LocalDate;
// import org.openqa.selenium.JavascriptExecutor;
// import org.testng.Assert;
// import org.openqa.selenium.chrome.ChromeOptions;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
// import java.util.Scanner;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.Keys;

//
public class Prueba extends Main {
    //
    @Test(description = "Getting the information for the database.")
    @Story("Game1")
    @Description("Gather performance from game 1")
    //
    public void GPU1_Game1() throws InterruptedException, IOException {
        testId = "GPU1_Game1";
        //
        try{
            // This is suposedly the Java version of the Python "input".
            // Scanner myObj = new Scanner(System.in);
            // System.out.println("Please enter the 1st GPU:");
            // String gpu1 = myObj.nextLine();
            // System.out.println("The first GPU is: " + gpu1);
            //
            driver.get("https://pc-builds.com/fps-calculator");
            //
            By cookies_accept = By.xpath("(//p[normalize-space()='Consent'])[1]");
            WebDriverWait wait = new WebDriverWait(driver, 1);
            wait.until(ExpectedConditions.elementToBeClickable(cookies_accept)).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(cookies_accept));
            Thread.sleep(500);
            //
            WebElement cpu = driver.findElement(By.xpath("//*[@id=\'card_cpu\']/div/div[2]/div[2]/span/span[1]/span/span[2]"));
            cpu.click();
            Thread.sleep(500);
            WebElement type_cpu = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
            type_cpu.sendKeys("7800X3d");
            Thread.sleep(500);
            WebElement select_cpu = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
            select_cpu.sendKeys(Keys.ENTER);
            Thread.sleep(500);
            //
            WebElement gpu = driver.findElement(By.xpath("//*[@id=\"card_gpu\"]/div/div[1]/div[2]/span/span[1]/span/span[2]"));
            gpu.click();
            Thread.sleep(500);
            WebElement type_gpu = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
            type_gpu.sendKeys("7700 XT");
            Thread.sleep(500);
            WebElement select_gpu = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
            select_gpu.sendKeys(Keys.ENTER);
            Thread.sleep(500);
            //
            WebElement game = driver.findElement(By.xpath("(//div[@class='card-body py-3'])[4]"));
            game.click();
            Thread.sleep(500);
            WebElement type_game = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
            type_game.sendKeys("Batman Arkham Knight");
            Thread.sleep(500);
            WebElement select_game = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
            select_game.sendKeys(Keys.ENTER);
            Thread.sleep(500);
            //
            WebElement res = driver.findElement(By.xpath("(//div[@class='card-body py-3'])[5]"));
            res.click();
            Thread.sleep(500);
            WebElement type_res = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
            type_res.sendKeys("QHD");
            Thread.sleep(500);
            WebElement select_res = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
            select_res.sendKeys(Keys.ENTER);
            Thread.sleep(500);
            //
            WebElement proceed = driver.findElement(By.xpath("(//button[@class='btn btn-primary btn-block mt-md-3 mt-2'])[1]"));
            proceed.click();
            Thread.sleep(3000);
            //
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
    //
    @Test(description = "Getting the information for the database.")
    @Story("Game1")
    @Description("Gather performance from game 1")
    //
    public void GPU2_Game1() throws InterruptedException, IOException {
        testId = "GPU2_Game1";//
        try{
            driver.get("https://pc-builds.com/fps-calculator");
            //
            By cookies_accept = By.xpath("(//p[normalize-space()='Consent'])[1]");
            WebDriverWait wait = new WebDriverWait(driver, 1);
            wait.until(ExpectedConditions.elementToBeClickable(cookies_accept)).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(cookies_accept));
            Thread.sleep(500);
            //
            WebElement cpu = driver.findElement(By.xpath("//*[@id=\'card_cpu\']/div/div[2]/div[2]/span/span[1]/span/span[2]"));
            cpu.click();
            Thread.sleep(500);
            WebElement type_cpu = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
            type_cpu.sendKeys("7800X3d");
            Thread.sleep(500);
            WebElement select_cpu = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
            select_cpu.sendKeys(Keys.ENTER);
            Thread.sleep(500);
            //
            WebElement gpu = driver.findElement(By.xpath("//*[@id=\"card_gpu\"]/div/div[1]/div[2]/span/span[1]/span/span[2]"));
            gpu.click();
            Thread.sleep(500);
            WebElement type_gpu = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
            type_gpu.sendKeys("7800 XT");
            Thread.sleep(500);
            WebElement select_gpu = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
            select_gpu.sendKeys(Keys.ENTER);
            Thread.sleep(500);
            //
            WebElement game = driver.findElement(By.xpath("(//div[@class='card-body py-3'])[4]"));
            game.click();
            Thread.sleep(500);
            WebElement type_game = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
            type_game.sendKeys("Batman Arkham Knight");
            Thread.sleep(500);
            WebElement select_game = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
            select_game.sendKeys(Keys.ENTER);
            Thread.sleep(500);
            //
            WebElement res = driver.findElement(By.xpath("(//div[@class='card-body py-3'])[5]"));
            res.click();
            Thread.sleep(500);
            WebElement type_res = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
            type_res.sendKeys("QHD");
            Thread.sleep(500);
            WebElement select_res = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
            select_res.sendKeys(Keys.ENTER);
            Thread.sleep(500);
            //
            WebElement proceed = driver.findElement(By.xpath("(//button[@class='btn btn-primary btn-block mt-md-3 mt-2'])[1]"));
            proceed.click();
            Thread.sleep(3000);
            //
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            driver.quit();
        }
    }
}
//
