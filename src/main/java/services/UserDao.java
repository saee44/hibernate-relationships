package services;

import entities.User;

public interface UserDao {
         void addUser(User user);
         User getUser(int id);
         void updateUser(int id,String name);
         void deleteUser(int id);
}
