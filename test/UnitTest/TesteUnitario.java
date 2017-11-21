package UnitTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import model.Automovel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluno
 */
public class TesteUnitario {

    public TesteUnitario() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    Automovel automovel;

    @Before
    public void setUp() {
        automovel = new Automovel();
    }

    @After
    public void tearDown() {
    }

    //CARROÇA  
    @Test
    public void testCategoria_CarrocaAmador() {
        automovel.setPesoCarro(100);
        automovel.setCustoTotal(50);
        String expResult = "Carroça - Amador";
        String result = automovel.getCategoria();
        assertEquals(expResult, result);
    }

    @Test
    public void testCategoria_CarrocaIntermediario() {
        automovel.setPesoCarro(100);
        automovel.setCustoTotal(99);
        String expResult = "Carroça - Intermediário";
        String result = automovel.getCategoria();
        assertEquals(expResult, result);
    }

    @Test
    public void testCategoria_CarrocaProfissional() {
        automovel.setPesoCarro(100);
        automovel.setCustoTotal(150);
        String expResult = "Carroça - Profissional";
        String result = automovel.getCategoria();
        assertEquals(expResult, result);
    }

    //BAJA
    @Test
    public void testCategoria_BajaAmador() {
        automovel.setPesoCarro(299);
        automovel.setCustoTotal(50);
        String expResult = "Baja - Amador";
        String result = automovel.getCategoria();
        assertEquals(expResult, result);
    }

    @Test
    public void testCategoria_BajaIntermediario() {
        automovel.setPesoCarro(299);
        automovel.setCustoTotal(99);
        String expResult = "Baja - Intermediário";
        String result = automovel.getCategoria();
        assertEquals(expResult, result);
    }

    @Test
    public void testCategoria_BajaProfissional() {
        automovel.setPesoCarro(299);
        automovel.setCustoTotal(150);
        String expResult = "Baja - Profissional";
        String result = automovel.getCategoria();
        assertEquals(expResult, result);
    }

    //Bugre
    @Test
    public void testCategoria_BugreAmador() {
        automovel.setPesoCarro(500);
        automovel.setCustoTotal(50);
        String expResult = "Bugre - Amador";
        String result = automovel.getCategoria();
        assertEquals(expResult, result);
    }

    @Test
    public void testCategoria_BugreIntermediario() {
        automovel.setPesoCarro(500);
        automovel.setCustoTotal(99);
        String expResult = "Bugre - Intermediário";
        String result = automovel.getCategoria();
        assertEquals(expResult, result);
    }

    @Test
    public void testCategoria_BugreProfissional() {
        automovel.setPesoCarro(500);
        automovel.setCustoTotal(150);
        String expResult = "Bugre - Profissional";
        String result = automovel.getCategoria();
        assertEquals(expResult, result);
    }

    //SEM CATEGORIA
    @Test
    public void testCategoria_SemCategoria() {
        automovel.setPesoCarro(501);
        automovel.setCustoTotal(150);
        String expResult = "Sem Categoria";
        String result = automovel.getCategoria();
        assertEquals(expResult, result);
    }
}
