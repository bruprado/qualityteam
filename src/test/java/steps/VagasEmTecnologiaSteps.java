package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VagasEmTecnologiaSteps {

	    WebDriver driver;
	    WebDriverWait wait;

	    @Before
	    public void setup() {
	        System.setProperty("webdriver.chrome.driver", "/Users/brunaprado/Desktop/chromedriver");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();

	    }

	    @Dado("que o usuário está na tela inicial")
	    public void que_o_usuário_está_na_tela_inicial() {
	        driver.get("https://www.accenture.com/br-pt");
	    }

	    @Quando("clica no menu carreiras")
	    public void clica_no_menu_carreiras() {
	        driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/nav/div/div[1]/div[3]/div[1]/div[4]/div[1]/span")).click();
	        wait = new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Vagas em tecnologia")));
	    }

	    @Quando("clica no submenu vagas em tecnologia")
	    public void clica_no_submenu_vagas_em_tecnologia() {
	        driver.findElement(By.linkText("Vagas em tecnologia")).click();
	    }

	    @Então("deve acessar a página de vagas em tecnologia")
	    public void deve_acessar_a_página_de_vagas_em_tecnologia() {
	        String msgDeValidacao = driver.findElement(By.tagName("h1")).getText();
	        Assert.assertEquals("Carreiras em tecnologia", msgDeValidacao);
	    }

	    @After
		public void dps() {
			driver.quit();
		}

}

//By Bruna Prado