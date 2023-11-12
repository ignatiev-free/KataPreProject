package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        UserService uService = new UserServiceImpl();

        uService.createUsersTable();

        uService.saveUser("Аркадий", "Сентябрьский", (byte) 20);
        uService.saveUser("Евдотий", "Октябрьский", (byte) 25);
        uService.saveUser("Ефрем", "Ноябрьский", (byte) 31);
        uService.saveUser("Юзер", "Декабрьский", (byte) 38);

        //uService.removeUserById(1);
        uService.getAllUsers();
        uService.cleanUsersTable();
        uService.dropUsersTable();

    }
}
