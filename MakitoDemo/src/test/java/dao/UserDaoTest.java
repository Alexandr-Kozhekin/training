package dao;

import bean.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoTest {

    public UserDao dao;

    @Before
    public void setUp() throws Exception{

        this.dao = new UserDaoImpl();

    }

    @Test
    public void getUserByUsername_Should_Return_True() throws Exception{

        User lam = dao.getUserByUsername("Max");

        assertEquals(lam.getName(), "Max");
        assertNotNull(lam);

    }

    @Test
    public void getUserByUsername_Should_Return_False() throws Exception{

        User lam = dao.getUserByUsername("Alan");

        assertNull(lam);

    }

}