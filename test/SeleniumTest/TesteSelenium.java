package SeleniumTest;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class TesteSelenium {

    private WebDriver driver = new ChromeDriver();
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testeArquitetura() throws Exception {
        driver.get("http://localhost:8080/casosdeteste/ManterArquiteturaController?acao=prepararOperacao&operacao=Incluir");
        driver.findElement(By.xpath("//ul[@id='select-options-2cf02295-3899-8039-7342-8bae5ec10293']/li[2]/span")).click();
        driver.findElement(By.id("id")).click();
        driver.findElement(By.id("id")).clear();
        driver.findElement(By.id("id")).sendKeys("1");
        driver.findElement(By.id("imagem")).click();
        driver.findElement(By.id("imagem")).clear();
        driver.findElement(By.id("imagem")).sendKeys("image/imagearquitetura.jpg");
        driver.findElement(By.xpath("//div[3]/div")).click();
        driver.findElement(By.id("imagem")).clear();
        driver.findElement(By.id("imagem")).sendKeys("/image/imagearquitetura.jpg");
        driver.findElement(By.xpath("//button[@value='Confirmar']")).click();
        assertEquals("Pesquisa de Arquitetura", driver.findElement(By.xpath("//h3")).getText());

    }

    @Test
    public void testeAvaliacao() throws Exception {
        driver.get("http://localhost:8080/casosdeteste/ManterAvaliacaoController?acao=prepararOperacao&operacao=Incluir");
        driver.findElement(By.id("id")).click();
        driver.findElement(By.id("id")).clear();
        driver.findElement(By.id("id")).sendKeys("1");
        driver.findElement(By.id("frequencia")).clear();
        driver.findElement(By.id("frequencia")).sendKeys("81");
        driver.findElement(By.id("frequencia")).click();
        driver.findElement(By.xpath("//ul[@id='select-options-ac7c4b9b-2dad-d0ad-b8b3-80670b6d4aca']/li[3]/span")).click();
        driver.findElement(By.xpath("//table[@id='data_table']/tbody/tr[2]/td[3]/div")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        driver.findElement(By.xpath("//input[@value=' Delfino ']")).click();
        driver.findElement(By.xpath("//ul[@id='select-options-cb90912b-f14b-9392-7b9d-f435db38027f']/li[8]/span")).click();
        driver.findElement(By.xpath("//button[@value='Confirmar']")).click();
        assertEquals("Pesquisa de Avaliação", driver.findElement(By.xpath("//h3")).getText());
    }

    @Test
    public void testeCompeticao() throws Exception {
        driver.get("http://localhost:8080/casosdeteste/ManterCompeticaoController?acao=prepararOperacao&operacao=Incluir");
        driver.findElement(By.name("txtIdCompeticao")).click();
        driver.findElement(By.name("txtIdCompeticao")).clear();
        driver.findElement(By.name("txtIdCompeticao")).sendKeys("1");
        driver.findElement(By.id("nome")).click();
        driver.findElement(By.id("nome")).clear();
        driver.findElement(By.id("nome")).sendKeys("Competicao 1");
        driver.findElement(By.xpath("//table[@id='data_table']/tbody/tr/td[3]")).click();
        driver.findElement(By.xpath("//table[@id='data_table']/tbody/tr[2]/td[3]/div")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        driver.findElement(By.id("hora")).click();
        driver.findElement(By.id("hora")).clear();
        driver.findElement(By.id("hora")).sendKeys("11:11");
        driver.findElement(By.id("local")).click();
        driver.findElement(By.id("local")).clear();
        driver.findElement(By.id("local")).sendKeys("local teste");
        driver.findElement(By.xpath("//input[@value=' Pista de Terra ']")).click();
        driver.findElement(By.xpath("//ul[@id='select-options-70dd5044-c5f9-b553-cf70-e124eb7d1c57']/li[10]/span")).click();
        driver.findElement(By.xpath("//button[@value='Confirmar']")).click();
        assertEquals("Pesquisa de Competição", driver.findElement(By.xpath("//h3")).getText());

    }

    @Test
    public void testeDesempenho() throws Exception {
        driver.get("http://localhost:8080/casosdeteste/ManterDesempenhoController?acao=prepararOperacao&operacao=Incluir");
        driver.findElement(By.xpath("//ul[@id='select-options-2ba8cbf4-9f88-63d4-b52d-b53df85f740d']/li[2]/span")).click();
        driver.findElement(By.xpath("//ul[@id='select-options-61b10de1-890f-b846-dec8-2b651a4a4465']/li[4]/span")).click();
        driver.findElement(By.xpath("//ul[@id='select-options-7dcd619c-76f7-bc5f-d2a5-af05e0894d6c']/li[5]/span")).click();
        driver.findElement(By.id("id")).click();
        driver.findElement(By.id("id")).clear();
        driver.findElement(By.id("id")).sendKeys("1");
        driver.findElement(By.xpath("//div[5]/div/label")).click();
        driver.findElement(By.id("desempenhoNome")).clear();
        driver.findElement(By.id("desempenhoNome")).sendKeys("Desempenho 1");
        driver.findElement(By.xpath("//table[@id='data_table']/tbody/tr[2]/td[4]/div")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        driver.findElement(By.id("hora")).click();
        driver.findElement(By.id("hora")).clear();
        driver.findElement(By.id("hora")).sendKeys("11:11");
        driver.findElement(By.id("aceleracaoMedia")).click();
        driver.findElement(By.id("aceleracaoMedia")).clear();
        driver.findElement(By.id("aceleracaoMedia")).sendKeys("123");
        driver.findElement(By.id("velocidadeMedia")).click();
        driver.findElement(By.id("velocidadeMedia")).clear();
        driver.findElement(By.id("velocidadeMedia")).sendKeys("124");
        driver.findElement(By.id("tempoPista")).click();
        driver.findElement(By.id("tempoPista")).clear();
        driver.findElement(By.id("tempoPista")).sendKeys("154");
        driver.findElement(By.id("frenagem")).click();
        driver.findElement(By.id("tempoPista")).click();
        driver.findElement(By.id("tempoPista")).clear();
        driver.findElement(By.id("tempoPista")).sendKeys("15:00");
        driver.findElement(By.id("frenagem")).click();
        driver.findElement(By.id("frenagem")).clear();
        driver.findElement(By.id("frenagem")).sendKeys("154");
        driver.findElement(By.xpath("//button[@value='Confirmar']")).click();
        assertEquals("Pesquisa de Desempenho", driver.findElement(By.xpath("//h3")).getText());

    }

    @Test
    public void testeDesign() throws Exception {
        driver.get("http://localhost:8080/casosdeteste/ManterDesignController?acao=prepararOperacao&operacao=Incluir");
        driver.findElement(By.xpath("//ul[@id='select-options-eecaa014-9a57-84d9-c870-12d96faa2668']/li[5]/span")).click();
        driver.findElement(By.id("id")).click();
        driver.findElement(By.id("id")).clear();
        driver.findElement(By.id("id")).sendKeys("1");
        driver.findElement(By.xpath("//div[3]/div/label")).click();
        driver.findElement(By.id("caminhoImagem")).clear();
        driver.findElement(By.id("caminhoImagem")).sendKeys("/imagem/imagemDesign.jpg");
        driver.findElement(By.xpath("//button[@value='Confirmar']")).click();
        assertEquals("Pesquisa de Deseign", driver.findElement(By.xpath("//h3")).getText());

    }
}
