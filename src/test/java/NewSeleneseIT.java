
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author VladimirP11
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NewSeleneseIT {

    private static WebDriver driver = null;

    public NewSeleneseIT() {
    }

    @BeforeClass
    public static void inicializarDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Archivos\\com470\\examenFinal\\calculadora-spring\\Drivers\\chromedriver.exe");
        //System.setProperty("", "C:\Archivos\com470\Selenium\domina-ci\bankOfFunctionalTests\Drivers");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/calculadora");
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void liquidarDriver() {
        driver.quit();
    }

    @Test
    public void test1Add() {
        pausa(2);
        // click en id=a  
        driver.findElement(By.id("a")).click();
        driver.findElement(By.id("a")).clear();
        pausa(1);
        // manda 5 - id=a 
        driver.findElement(By.id("a")).sendKeys("5");
        pausa(1);
        // click en id=b 
        driver.findElement(By.id("b")).click();
        driver.findElement(By.id("b")).clear();
        pausa(1);
        // manda 8 - id=b 
        driver.findElement(By.id("b")).sendKeys("8");
        pausa(1);
        // click en name=add
        driver.findElement(By.name("add")).click();
        pausa(1);
        //verificacion
        String r=driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText();
        assertEquals(r,"Resultado: 13");
    }
    
    @Test
    public void test2Subtract(){
        pausa(1);
        // click en id=a 
        driver.findElement(By.id("a")).click();
        driver.findElement(By.id("a")).clear();
        pausa(1);
        // manda 10 -id=a 
        driver.findElement(By.id("a")).sendKeys("10");
        // click en id=b 
        driver.findElement(By.id("b")).click();
        driver.findElement(By.id("b")).clear();
        pausa(1);
        // manda 11 - id=b 
        driver.findElement(By.id("b")).sendKeys("11");
        pausa(1);
        // click en name=subtract 
        driver.findElement(By.name("subtract")).click();
        pausa(1);
        //verificacion
        String r=driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText();
        assertEquals(r,"Resultado: -1");
    }
    
    @Test
    public void test3Multiply(){
        pausa(1);
        // click en id=a
        driver.findElement(By.id("a")).click();
        driver.findElement(By.id("a")).clear();
        pausa(1);
        // manda 5 - id=a 
        driver.findElement(By.id("a")).sendKeys("5");
        pausa(1);
        // click en id=b  
        driver.findElement(By.id("b")).click();
        driver.findElement(By.id("b")).clear();
        pausa(1);
        // manda 8 - id=b 
        driver.findElement(By.id("b")).sendKeys("8");
        pausa(1);
        // click en name=multiply 
        driver.findElement(By.name("multiply")).click();
        pausa(1);
        //verificacion
        String r=driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText();
        assertEquals(r,"Resultado: 40");
    }
    
    @Test
    public void test4Divide(){
        pausa(1);
        // click en id=a 
        driver.findElement(By.id("a")).click();
        driver.findElement(By.id("a")).clear();
        pausa(1);
        // manda 79 - id=a 
        driver.findElement(By.id("a")).sendKeys("79");
        pausa(1);
        // click en id=b 
        driver.findElement(By.id("b")).click();
        driver.findElement(By.id("b")).clear();
        pausa(1);
        // manda 12 - id=b | 12
        driver.findElement(By.id("b")).sendKeys("12");
        pausa(1);
        // click en name=divide  
        driver.findElement(By.name("divide")).click();
        pausa(1);
        //verificacion
        String r=driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText();
        assertEquals(r,"Resultado: 6.583333333333333");
    }
    
    @Test
    public void test5ClearSimple(){
        pausa(1);
        // click en name=clearSimple 
        driver.findElement(By.name("clearSimple")).click();
        pausa(1);
        //verificacion
        String r=driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText();
        assertEquals(r,"Resultado: 0");
    }
    
    @Test
    public void test6Fibonacci(){
        pausa(1);
        // click en id=c | 
        driver.findElement(By.id("c")).click();
        driver.findElement(By.id("c")).clear();
        pausa(1);
        // manda 12 id=c 
        driver.findElement(By.id("c")).sendKeys("12");
        pausa(1);
        // click en name=fibonacci 
        driver.findElement(By.name("fibonacci")).click();
        pausa(1);
        //verificacion
        String r=driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText();
        assertEquals(r,"Resultado: 144");
    }
    
    @Test
    public void test7Factorial(){
        pausa(1);
        // click en id=c 
        driver.findElement(By.id("c")).click();
        driver.findElement(By.id("c")).clear();
        pausa(1);
        // manda id=c 
        driver.findElement(By.id("c")).sendKeys("5");
        pausa(1);
        // click en name=factorial 
        driver.findElement(By.name("factorial")).click();
        pausa(1);
        //verificacion
        String r=driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText();
        assertEquals(r,"Resultado: 120");
    }
    
    @Test
    public void test8Sqrt(){
        pausa(1);
        // click en id=c 
        driver.findElement(By.id("c")).click();
        driver.findElement(By.id("c")).clear();
        pausa(1);
        // manda 36 id=c 
        driver.findElement(By.id("c")).sendKeys("36");
        pausa(1);
        // click en name=sqrt  
        driver.findElement(By.name("sqrt")).click();
        pausa(1);
        //verificacion
        String r=driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText();
        assertEquals(r,"Resultado: 6.0");
    }
    
    @Test
    public void test90Power(){
        pausa(1);
        // click en id=c  
        driver.findElement(By.id("c")).click();
        driver.findElement(By.id("c")).clear();
        pausa(1);
        // manda 13 id=c 
        driver.findElement(By.id("c")).sendKeys("13");
        pausa(1);
        // click en name=power 
        driver.findElement(By.name("power")).click();
        pausa(1);
        //verificacion
        String r=driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText();
        assertEquals(r,"Resultado: 169");
    }
    
    @Test
    public void test91ClearAdvanced(){
        pausa(1);
        // click en name=clearAdvanced 
        driver.findElement(By.name("clearAdvanced")).click();
        pausa(1);
        //verificacion
        String r=driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText();
        assertEquals(r,"Resultado: 0");
    }
    
    
    
    private void pausa(long time) {
        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {

        }
    }
}
