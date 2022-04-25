package Lesson23ArrayList.PracticTask;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User user1 = new User(1, "Sam", 26);
        User user2 = new User(2,"Maga", 25);
        User user3 = new User(3, "Bayo", 27);
        userDao.addUser(user1);
        userDao.addUser(user2);
        userDao.addUser(user3);

        System.out.println(userDao.getById(4));
    }
}
