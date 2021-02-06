package dao;

import bean.User;

public interface UserDao {

    User getUserByUsername(String name) throws Exception;

}
