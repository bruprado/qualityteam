package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;

public class AceitarCookiesLGPDSteps {

	WebDriver driver;

	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\Drives\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Dado("que eu estou no site da accenture")
	public void que_eu_estou_no_site_da_accenture() {
		driver.get("https://www.accenture.com/br-pt");
	}

	@Dado("aceito os termos LGPD")
	public void aceito_os_termos_lgpd() {
		
		//Não é necessario clicar em nada para aceitar, segundo o site basta permanecer no site para aceitar os termos

	}

	@Então("deve fechar a caixa de informação")
	public void deve_fechar_a_caixa_de_informação() {

		// Clica no botão Fechar
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement btnFechar = wait
				.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("onetrust-close-btn-container"))));
		btnFechar.click();

		// Verifica se ainda existe na tela a caixa de informações e retorna um boolean (verdadeiro ou falso)
		Boolean caixaDeInformcoes = wait
				.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("onetrust-close-btn-container"))));

		// Verifica se o boolean retornou True, ou seja, que não existe o elemento mais na tela
		assertTrue(caixaDeInformcoes);

	}

	@Dado("clico em configurações de cookie")
	public void clico_em_configurações_de_cookie() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement btnConfiguracaoesDeCookie = wait
				.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("onetrust-pc-btn-handler"))));
		btnConfiguracaoesDeCookie.click();
	}

	@Então("devo ver o item de sua privacidade")
	public void devo_ver_o_item_de_sua_privacidade() {
		//Espero o elemento aparecer na tela
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement btnSuaPrivacidade = wait
				.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("privacy-text"))));
		
		//Gravo o texto no elemento em uma string
		String textoElement = driver.findElement(By.id("privacy-text")).getText();
		
		//Comparo o texto esperado com o salvo
        assertEquals("Sua privacidade", textoElement);

	}

	@Então("devo ver Cookies estritamente necessárias")
	public void devo_ver_cookies_estritamente_necessárias() {
		//Espero o elemento aparecer na tela
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement btnCookiesEstritamenteNecessarios = wait
				.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ot-header-id-1"))));
		
		//Gravo o texto no elemento em uma string
		String textoElement = driver.findElement(By.id("ot-header-id-1")).getText();
		
		//Comparo o texto esperado com o salvo
        assertEquals("Cookies estritamente necessárias", textoElement);

	}

	@Então("devo ver Cookies Analíticos de Primeira Parte")
	public void devo_ver_cookies_analíticos_de_primeira_parte() {
		//Espero o elemento aparecer na tela
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement btnCookiesAnaliticosDePrimeiraParte = wait
				.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ot-header-id-2"))));
		
		//Gravo o texto no elemento em uma string
		String textoElement = driver.findElement(By.id("ot-header-id-2")).getText();
		
		//Comparo o texto esperado com o salvo
        assertEquals("Cookies Analíticos de Primeira Parte", textoElement);
		
	}

	@Então("devo ver Cookies de Desempenho e Cookies Funcionais")
	public void devo_ver_cookies_de_desempenho_e_cookies_funcionais() {
		//Espero o elemento aparecer na tela
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement btnCookiesDeDesempenhoECookiesFuncionais = wait
				.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ot-header-id-3"))));
		
		//Gravo o texto no elemento em uma string
		String textoElement = driver.findElement(By.id("ot-header-id-3")).getText();
		
		//Comparo o texto esperado com o salvo
        assertEquals("Cookies de Desempenho e Cookies Funcionais", textoElement);

	}

	@Então("devo ver Cookies de Publicidade e Redes Sociais")
	public void devo_ver_cookies_de_publicidade_e_redes_sociais() {
		//Espero o elemento aparecer na tela
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement btnCookiesDePublicidadeERededSociais = wait
				.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ot-header-id-4"))));
		
		//Gravo o texto no elemento em uma string
		String textoElement = driver.findElement(By.id("ot-header-id-4")).getText();
		
		//Comparo o texto esperado com o salvo
        assertEquals("Cookies de Publicidade e Redes Sociais", textoElement);
	
	}
	

	@After
	public void dps() {
		driver.quit();
	}

}
