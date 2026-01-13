package hibernate_relationships;

import entities.Profile;
import entities.User;
import serviceimpl.UserDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
        UserDaoImpl operation=new UserDaoImpl();
        
        Profile profile1=new Profile(1,"welcome",null);
        User user1=new User(1,"saee",profile1);
        profile1.setUser(user1);
        operation.addUser(user1);
        
        
    }
}
