package service;

import bean.User;
import dao.UserDao;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.any;

public class UserServiceTest {

    @Mock
    private UserDao dao;
    private UserService userService;

    public UserServiceTest() {

        MockitoAnnotations.initMocks(this);
        this.userService = new UserService(dao);

    }

    @Test
    public void chekUsersPresence_True() throws Exception{

        given(dao.getUserByUsername("Alex")).willReturn(new User("Alex"));

        boolean userExists = userService.chekUsersPresence(new User("Alex"));

        assertTrue(userExists);

    }

    @Test
    public void chekUsersPresence_False() throws Exception{

        given(dao.getUserByUsername("Alex")).willReturn(null);

        boolean userExists = userService.chekUsersPresence(new User("Alex"));

        assertFalse(userExists);

    }

    @Test(expected = Exception.class)
    public void chekUsersPresence_Exception() throws Exception{

        given(dao.getUserByUsername(any(String.class))).willThrow(Exception.class);

        userService.chekUsersPresence(new User("Alex"));

    }

}