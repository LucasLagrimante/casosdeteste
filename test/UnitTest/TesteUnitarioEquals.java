package UnitTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import model.Automovel;
import model.Peca;
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
public class TesteUnitarioEquals {

    public TesteUnitarioEquals() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    Automovel automovel;
    Peca peca;

    @Before
    public void setUp() {
        automovel = new Automovel();
        peca = new Peca();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testEquals1() {
        boolean expResult = false;
        boolean result = automovel.equals(peca);
        assertEquals(expResult, result);
    }

    @Test
    public void testEquals2() {
        Automovel other = new Automovel();
        other.setIdAutomovel(1);
        boolean expResult = false;
        boolean result = automovel.equals(other);
        assertEquals(expResult, result);
    }

    @Test
    public void testEquals3() {
        boolean expResult = true;
        boolean result = automovel.equals(automovel);
        assertEquals(expResult, result);
    }

}
