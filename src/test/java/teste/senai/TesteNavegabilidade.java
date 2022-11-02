package teste.senai;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteNavegabilidade {

	ChromeDriver driver; // driver do Google Chrome

	// pré-teste
	@Before
	public void PreTeste () {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver ();//abrir o navegador
		//maximizar o navegador
		driver.manage().window().maximize();
		
		//ir até o site do senai 
		driver.get("https://informatica.sp.senai.br/");
		
	}

	// teste
	@Test
	public void Teste() {
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("Excel");
		//driver.findElement(By.id("Busca1_btnBusca")).click();
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys(Keys.ENTER);
	}

	// pós-teste
	@After
	public void posTeste() {
		driver.quit();
	}
}
