package alv;

import java.time.Duration;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositiveTestCases {
    // Sets Driver variable
    private static WebDriver driver;

    // Sets up Chrome Driver before each test
    @BeforeClass
    public static void setup() {
        System.setProperty("WebDriver.chrome.driver", "/src/chromedriver.exe");
        driver = new ChromeDriver();

    }

    // First Test Case
    @Test
    @Ignore
    public void testGoogleSearch() {

        // Navigates to Website
        driver.get("https://www.google.com");

        // Get Element for Search Bar
        WebElement searchBox = driver.findElement(By.className("gLFyf"));

        // Inputting Text
        searchBox.sendKeys("Selenium WebDriver");

        // Submitting the Search query
        searchBox.submit();

        // Waiting for Results to load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Gets the element for first Selenium file
        String pageTitle = driver.findElement(By.className("VuuXrf")).getText();

        // Validation
        Assert.assertEquals("Selenium", pageTitle);
    }

    // Getting all options from drop down
    @Test
    public void getAllOptions() {
        driver.get("https://omayo.blogspot.com/");

        // Retrieves all Options from drop down
        // WebElement dropdownElement = driver.findElement(By.id("drop1"));
        // dropdownElement.getText();

        String[] expectedOptions = { "Older Newsletters", "doc 1", "doc 2", "doc 3", "doc 4" };

        for (int i = 0; i < 5; i++) {
            String idOfOption = "ironman" + String.valueOf(i + 1);
            WebElement dropdownOption = driver.findElement(By.id(idOfOption));
            Assert.assertEquals(expectedOptions[i], dropdownOption.getText());
        }
    }

    @AfterClass
    public static void teardown() {
        if (driver != null) {
            driver.close();
        }
    }

}
