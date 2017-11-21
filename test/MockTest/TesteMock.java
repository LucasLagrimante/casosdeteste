package MockTest;

import dao.AutomovelDAO;
import dao.DAO;
import junit.framework.TestCase;
import model.Automovel;
import junit.framework.TestCase;
import static org.easymock.EasyMock.*;

public class TesteMock extends TestCase {

    public void testSalvarAutomovelDAO() {
        Automovel automovel = new Automovel();
        DAO automovelDAO = AutomovelDAO.getInstance();

        assertTrue(automovel.salvar(automovelDAO));
    }

    public void testSalvarAutomovelDAOMock() {
        Automovel automovel = new Automovel();
        DAO automovelDAOMock = createMock(DAO.class);
        expect(automovelDAOMock.salvar(automovel)).andReturn(true);
        replay(automovelDAOMock);

        assertTrue(automovel.salvar(automovelDAOMock));
    }
}
