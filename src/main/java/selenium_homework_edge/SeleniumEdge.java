package selenium_homework_edge;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumEdge {
    public static void main(String[] args) {
        // Use WebDriverManager to automatically set up the EdgeDriver, ensuring compatibility with the browser version
        WebDriverManager.edgedriver().setup();

        // Create a new instance of the Edge browser
      WebDriver driver=new EdgeDriver();

        // Navigate to Walmart's homepage
      driver.get("https://www.walmart.com/");
    }
}
