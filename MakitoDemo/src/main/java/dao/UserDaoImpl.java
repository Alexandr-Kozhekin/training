package dao;

import bean.User;

import java.util.Arrays;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private List<User> users;

    public UserDaoImpl() {

        this.users = Arrays.asList(new User("Alex"),
                new User ("Max"),
                new User("Kelli"));

        }

    @Override
    public User getUserByUsername(String name) throws Exception {
         return users.stream().
                 filter(o -> o.getName().equals(name)).
                 findAny().
                 orElse(null);
    }

}
