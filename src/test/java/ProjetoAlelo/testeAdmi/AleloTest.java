package ProjetoAlelo.testeAdmi;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*Teste Analista Eduardo Barbosa 
 * Agradeço prontamente a oportunidade concedida!!!
 */

public class AleloTest {

	@Test
//Método Correspondente ao primeiro teste
	public void abriLinkCepTestUm() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.correios.com.br/");
		driver.findElement(By.id("acesso-busca")).sendKeys("09912090");
		driver.findElement(By.xpath("/html/body/main/div[2]/div/main/div/div[2]/div/form[2]/div[2]/button/i")).click();
		driver.navigate();
		driver.quit();

	}

//Método Conrrespondente ao Segundo teste
	@Test
	public void testLogradouroTestdois() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.buscacep.correios.com.br/sistemas/buscacep/");
		driver.findElement(By.name("relaxation")).sendKeys("av brigadeiro luiz antonio");
		driver.findElement(
				By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/form/div/div/div[6]/input"))
				.click(); 

		driver.navigate();
		driver.quit();
	}
}
