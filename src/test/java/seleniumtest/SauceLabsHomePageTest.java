package seleniumtest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef.HWND;

public class SauceLabsHomePageTest {

  private static final String DANIEL = "Daniel";
  private static final String CORTES = "Cortés";
  private static final String GARCIA = "García";

  private WebDriver browser;

  @BeforeEach
  public void init() {
    // System.setProperty("webdriver.chrome.driver","c:\\selenium\\webdriver\\chromedriver.exe");
    // browser = new ChromeDriver();

//    System.setProperty("webdriver.ie.driver", "c:\\selenium\\webdriver\\IEDriverServer.exe");
//    browser = new InternetExplorerDriver();
  }

  @Test
  @Disabled
  public void site_header_is_on_home_page() {
    browser.get("https://www.saucelabs.com");
    WebElement href = browser.findElement(By.xpath("//a[@href='/beta/login']"));
    assertTrue((href.isDisplayed()));
    browser.close();
  }

  @Test
  void listTest() throws Exception {
    browser.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    browser.navigate().to("https://amazon.in");
    browser.manage().window().maximize();
    String title = browser.getTitle();

    System.out.println(title);
  }

  @Test
  public void pruebaWindow() throws Exception {

//    browser.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//    browser.navigate().to("https://amazon.in");
//    browser.manage().window().maximize();
//    String title = browser.getTitle();
//
//    System.out.println(title + "\n\n\n\n");

//    HWND hwnd = User32.INSTANCE.FindWindow("ApplicationFrameWindow", null); // window title
    HWND hwnd = User32.INSTANCE.FindWindow(null, "Calculadora"); // window title
    if (hwnd == null) {
      System.out.println("Excel is not running");
    } else {
      User32.INSTANCE.ShowWindow(hwnd, 9); // SW_RESTORE
      User32.INSTANCE.SetForegroundWindow(hwnd); // bring to front
    }

    /*
     * try { String line; Process p = Runtime.getRuntime().exec(System.getenv("windir")
     * +"\\system32\\"+"tasklist.exe"); BufferedReader input = new BufferedReader(new
     * InputStreamReader(p.getInputStream())); while ((line = input.readLine()) != null) {
     * System.out.println(line); // <-- Parse data here. } input.close(); } catch (Exception err) {
     * err.printStackTrace(); }
     * 
     */
  }
}
