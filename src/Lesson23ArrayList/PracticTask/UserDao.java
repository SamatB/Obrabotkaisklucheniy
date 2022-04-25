package Lesson23ArrayList.PracticTask;

import java.util.ArrayList;

public class UserDao {
    private ArrayList<User> users = new ArrayList<>();
    public void addUser (User user) {
        users.add(user);
    }
    public  User getById (long id) {
        User reUser = new User();

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id) {
                reUser = users.get(i);
            }else {
                System.out.println("User with this " + id + " not found.");
            }
        } return reUser;
    }

//        users.add(new User(1, "Sam", 26));
//        users.add(new User(2, "Maga", 25));
//        users.add(new User(3, "Asel", 25));

}
