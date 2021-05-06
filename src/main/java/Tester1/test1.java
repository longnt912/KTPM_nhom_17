package Tester1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1{
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","P:\\Eclipes workspace\\TesterKT\\ChormeDV\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//
        String baseUrl = "https://vuighe.net/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle;

        driver.get(baseUrl);

        actualTitle = driver.getTitle();


        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        driver.close();

    }

}