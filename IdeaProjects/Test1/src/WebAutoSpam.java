import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAutoSpam {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chromedriver", "C:\\Users\\Marek Vu\\Desktop\\cviceni sql\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cspujcky.cz/pujcka?utm_source=usetrno&utm_medium=tlacitko&utm_campaign=usetreno_pujcky&utm_content=pujcky");
        driver.manage().window().maximize();


//        Random random = new Random();
//        NameGenerator nameGenerator = new NameGenerator();
//        for (int i = 0; i < 5; i++) {
//            Person person = nameGenerator.getRandomPerson();
//            System.out.format("random %d | %s , %s, %s, %s \n", i, person.getName_(), person.getSurname_(), person.getEmail_(), person.getPhone_number_());
//        }
//
//        System.exit(0);

        NameGenerator nameGenerator = new NameGenerator();
        String previous_mail = "";
        for (int i = 1; i < 9999; i++) {
            Person person = nameGenerator.getRandomPerson();

            for (int j = 0; j <= 9; j++) {
                driver.findElement(By.xpath("//*[@id=\"entry_form_phone\"]")).sendKeys(Keys.BACK_SPACE);
            }

            driver.findElement(By.xpath("//*[@id=\"entry_form_phone\"]")).sendKeys(Keys.DELETE);
            driver.findElement(By.xpath("//*[@id=\"entry_form_phone\"]")).sendKeys(person.getPhone_number_());

            for (int j = 0; j < previous_mail.length(); j++) {
                driver.findElement(By.xpath("//*[@id=\"entry_form_email\"]")).sendKeys(Keys.BACK_SPACE);
            }
            driver.findElement(By.xpath("//*[@id=\"entry_form_email\"]")).sendKeys(Keys.DELETE);

            driver.findElement(By.xpath("//*[@id=\"entry_form_email\"]")).sendKeys(person.getEmail_());
            previous_mail = person.getEmail_();

            driver.findElement(By.xpath("//*[@id=\"entry_form_submit\"]")).click();
            driver.navigate().refresh();
            Thread.sleep(61000);
            driver.navigate().back();

        }


//        for (int i = 0; i < 4; i++) {
//            driver.get("https://www.usetreno.cz/objednavka/bezny-ucet-1252/");
//            driver.findElement((By.id("web_calculator_generic_shortLeadOrderForm_name"))).sendKeys("Shrek");
//            driver.findElement((By.id("web_calculator_generic_shortLeadOrderForm_surname"))).sendKeys("Brmzouza");
//
//            int cislo1 = random.nextInt(100, 999);
//            int a = 777969;
//            String cislo2 = String.valueOf(a) + String.valueOf(cislo1);
//            System.out.println(cislo2);
//
//            driver.findElement((By.id("web_calculator_generic_shortLeadOrderForm_phone"))).sendKeys(cislo2);
//
//            driver.findElement((By.id("web_calculator_generic_shortLeadOrderForm_email"))).sendKeys(Keys.DELETE);
//            driver.findElement((By.id("web_calculator_generic_shortLeadOrderForm_email"))).sendKeys(Keys.BACK_SPACE);
//            driver.findElement((By.id("web_calculator_generic_shortLeadOrderForm_email"))).sendKeys("novak@seznam.cz");
//            driver.findElement((By.id("web_calculator_generic_shortLeadOrderForm_submit"))).click();
//            driver.navigate().refresh();
//            driver.get("https://www.usetreno.cz/objednavka/bezny-ucet-1252/");
//
//        }
    }
}

