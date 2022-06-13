

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import java.util.concurrent.TimeUnit;


public class SeleniumTest {

    public static void main() throws InterruptedException {

        addDuplicateApplicationWithGroups();

        System.out.println("Finished UI Task for duplicate applications with groups ");
    }

    public static void addDuplicateApplicationWithGroups() throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver5 = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        Set<Cookie> allCookies = driver5.manage().getCookies();
        String storeUrL = "https://apistore-dev-dev-a878-14-ams10-nonp.cloud.random.com/store/";

        // launch Chrome and direct it to the Base URL
        driver5.get(storeUrL);
        Thread.sleep(3000);
        driver5.findElement(By.id("btn-login")).click();
        // click on SSO
        Thread.sleep(3000);
        driver5.findElement(By.xpath("//*[@id=\"icon-2\"]/img")).click();
        Thread.sleep(5000);
        // end user name
        driver5.findElement(By.name("loginfmt")).sendKeys("user@random.com");
        Thread.sleep(2000);
        // click next
        driver5.findElement(By.id("idSIButton9")).click();
        Thread.sleep(5000);
        // enter password
        driver5.findElement(By.id("passwordInput")).sendKeys("test");
        Thread.sleep(2000);
        // click submit
        driver5.findElement(By.id("submitButton")).click();
        Thread.sleep(5000);
        String parentWindowHandler = driver5.getWindowHandle(); // Store your parent window
        String subWindowHandler = null;
        Set<String> handles = driver5.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()) {
            subWindowHandler = iterator.next();
        }
        driver5.switchTo().window(subWindowHandler); // switch to popup window
        driver5.findElement(By.id("idSIButton9")).click();
        driver5.switchTo().window(parentWindowHandler); // switch back to parent window
        Thread.sleep(10000);

        driver5.findElement(By.xpath("//*[@id=\"left-sidebar\"]/nav/ul/li[2]/a/span")).click();
        Thread.sleep(3000);
        driver5.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li/a")).click();
        Thread.sleep(3000);
        driver5.findElement(By.id("application-name")).sendKeys("A4");
        WebElement element = driver5.findElement(By.xpath("//*[@id=\"appAddForm\"]/div[2]/div/div"));
        Actions Action = new Actions(driver5);
        Action.moveToElement(element);
        Action.click();
        Action.sendKeys("DevTeamBeta");
        Action.sendKeys(Keys.ENTER);
        Action.build().perform();
        Thread.sleep(5000);
        driver5.findElement(By.id("application-add-button")).click();
        Thread.sleep(3000);

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver6 = new ChromeDriver();
        ChromeOptions options2 = new ChromeOptions();
        options2.addArguments("--incognito");
        DesiredCapabilities capabilities2 = DesiredCapabilities.chrome();
        capabilities2.setCapability(ChromeOptions.CAPABILITY, options);
        Set<Cookie> allCookies2 = driver6.manage().getCookies();

        String storeUrL2 = "https://apistore-dev-dev-a878-14-ams10-nonp.cloud.random.com/store/";

        // launch Chrome and direct it to the Base URL
        driver6.get(storeUrL2);
        Thread.sleep(3000);
        driver6.findElement(By.id("btn-login")).click();
        // click on SSO
        Thread.sleep(3000);
        driver6.findElement(By.xpath("//*[@id=\"icon-2\"]/img")).click();
        Thread.sleep(5000);
        // end user name
        driver6.findElement(By.name("loginfmt")).sendKeys("user2@random.com");
        Thread.sleep(2000);
        // click next
        driver6.findElement(By.id("idSIButton9")).click();
        Thread.sleep(5000);
        // enter password
        driver6.findElement(By.id("passwordInput")).sendKeys("test");
        Thread.sleep(2000);
//click submit
        driver6.findElement(By.id("submitButton")).click();
        Thread.sleep(5000);
        String parentWindowHandler6 = driver6.getWindowHandle(); // Store your parent window
        String subWindowHandler6 = null;
        Set<String> handles6 = driver6.getWindowHandles(); // get all window handles
        Iterator<String> iterator6 = handles6.iterator();
        while (iterator6.hasNext()) {
            subWindowHandler6 = iterator6.next();
        }
        driver6.switchTo().window(subWindowHandler6); // switch to popup window
        driver6.findElement(By.id("idSIButton9")).click();
        driver6.switchTo().window(parentWindowHandler6); // switch back to parent window
        Thread.sleep(10000);
        driver6.findElement(By.xpath("//*[@id=\"left-sidebar\"]/nav/ul/li[2]/a/span")).click();
        Thread.sleep(3000);
        driver6.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li/a")).click();
        Thread.sleep(3000);
        driver6.findElement(By.id("application-name")).sendKeys("A4");
        WebElement element1 = driver6.findElement(By.xpath("//*[@id=\"appAddForm\"]/div[2]/div/div"));
        Actions Action1 = new Actions(driver6);
        Action1.moveToElement(element1);
        Action1.click();
        Action1.sendKeys("DevTeamAlpha");
        Action1.sendKeys(Keys.ENTER);
        Action1.build().perform();
        Thread.sleep(5000);
        driver6.findElement(By.id("application-add-button")).click();
        Thread.sleep(3000);


        for (Cookie cookie : allCookies) {
            driver5.manage().addCookie(cookie);
        }
        String storeUrL3 = "https://apistore-dev-dev-a878-14-ams10-nonp.cloud.random.com/store/";
        // launch Chrome and direct it to the Base URL
        driver5.get(storeUrL3);
        Thread.sleep(3000);

        driver5.findElement(By.xpath("//*[@id=\"left-sidebar\"]/nav/ul/li[2]/a/span")).click();
        Thread.sleep(4000);
        driver5.findElement(By.xpath("//*[@id=\"application-table\"]/tbody/tr[1]/td[5]/a[3]/span[2]")).click();

        while (iterator.hasNext()) {
            subWindowHandler = iterator.next();
        }
        driver5.switchTo().window(subWindowHandler); // switch to popup window
        driver5.findElement(By.xpath("//*[@id=\"btn-primary\"]")).click();
        driver5.switchTo().window(parentWindowHandler); // switch back to parent window
        Thread.sleep(5000);

        for (Cookie cookie : allCookies2) {
            driver6.manage().addCookie(cookie);
        }
        String storeUrL4 = "https://apistore-dev-dev-a878-14-ams10-nonp.cloud.random.com/store/";
        // launch Chrome and direct it to the Base URL
        driver6.get(storeUrL4);
        Thread.sleep(5000);

        driver6.findElement(By.xpath("//*[@id=\"left-sidebar\"]/nav/ul/li[2]/a/span")).click();
        Thread.sleep(5000);
        driver5.close();
        driver6.close();
    }

}
