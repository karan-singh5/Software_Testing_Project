import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class test1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/projects/ecommerce/zdemo/home.php");
        // this is to make a wait of the web page
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60))
        driver.findElement(By.xpath("//a[@href='login.php']//button")).click();
    }

    // test case for login with email password and correct email
    @Test
    public void logintest() {
        //signup buttom click
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://localhost/projects/ecommerce/zdemo/home.php");
        driver.findElement(By.xpath("//a[@href='login.php']//button")).click();
        driver.findElement(By.xpath("//input[@placeholder='enter email']")).sendKeys("g@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='enter password']")).sendKeys("122");
        driver.findElement(By.xpath("//input[@name='submit']")).click();

        String pageTitle = driver.getTitle();
        if (pageTitle.equals("shopping cart")) {
            System.out.println("login succcessfull");
        } else {
            System.out.println("login fail");
        }

    }

    @Test
    public void title() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/projects/ecommerce/zdemo/home.php");
        String pageTitle = driver.getTitle();
        if (pageTitle.equals("drinks")) {
            System.out.println("login succcessfull");
        } else {
            System.out.println("login fail");
        }
    }

    // test case for login with wrong password and correct email
    @Test
    public void loginwrongpassword() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://localhost/projects/ecommerce/zdemo/home.php");
        driver.findElement(By.xpath("//a[@href='login.php']//button")).click();
        driver.findElement(By.xpath("//input[@placeholder='enter email']")).sendKeys("g@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='enter password']")).sendKeys("145");
        driver.findElement(By.xpath("//input[@name='submit']")).click();

        String pageTitle = driver.getTitle();
        if (pageTitle.equals("shopping cart")) {
            System.out.println("login succcessfull");
        } else {
            System.out.println("login fail");
        }
    }


    // test case for login with correct password and wrong email
    @Test
    public void loginwrongemail() {
        //signup buttom click
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://localhost/projects/ecommerce/zdemo/home.php");
        driver.findElement(By.xpath("//a[@href='login.php']//button")).click();
        driver.findElement(By.xpath("//input[@placeholder='enter email']")).sendKeys("g2@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='enter password']")).sendKeys("12");
        driver.findElement(By.xpath("//input[@name='submit']")).click();

        String pageTitle = driver.getTitle();
        if (pageTitle.equals("shopping cart")) {
            System.out.println("login succcessfull");
        } else {
            System.out.println("login fail");
        }
    }
    @Test
    public void addcart() {
        //signup buttom click
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://localhost/projects/ecommerce/zdemo/home.php");
        driver.findElement(By.xpath("//a[@href='login.php']//button")).click();
        driver.findElement(By.xpath("//input[@placeholder='enter email']")).sendKeys("g@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='enter password']")).sendKeys("12");
        driver.findElement(By.xpath("//input[@name='submit']")).click();

        driver.findElement(By.xpath("(//input[@name='add_to_cart'])[1]")).click();
    }


    }

