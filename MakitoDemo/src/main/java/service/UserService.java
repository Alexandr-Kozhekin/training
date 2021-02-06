package service;

import bean.User;
import dao.UserDao;

public class UserService {

    private UserDao dao;

    public UserService(UserDao dao) {
        this.dao = dao;
    }

    public Boolean chekUsersPresence(User user) throws Exception{

        User u = dao.getUserByUsername(user.getName());

        return u != null;
    }

}
