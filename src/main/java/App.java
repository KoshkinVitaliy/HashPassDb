public class App {
    public static void main(String[] args) {
        DbConnectionImpl connection = new DbConnectionImpl();

        connection.insert(new User("user1", "123456780"));
        connection.insert(new User("user2", "qwertyqwerty"));
        connection.insert(new User("user3", "0987654321"));
        connection.select();

    }
}
