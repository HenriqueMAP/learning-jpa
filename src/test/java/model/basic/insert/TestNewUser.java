package model.basic.insert;

import junit.framework.TestCase;
import model.basic.User;
import model.database.jpa.PersistenceEntityManager;

public class TestNewUser extends TestCase {

    private static boolean isSuccessInsertNewUser = false;

    public static void main(String[] args) {

        startTest();

    }

    private static void startTest() {
        System.out.println("TestNewUser: BEGIN");
        try {
            PersistenceEntityManager createEntityConnection = new PersistenceEntityManager();
            createEntityConnection.createConnection();

            User newUser = new User("VICTOR Otogami", "h-otogami@icloud.com");
            newUser.setId(2L);

            createEntityConnection.getConnectionDatabase().getTransaction().begin();
            createEntityConnection.getConnectionDatabase().persist(newUser);
            createEntityConnection.getConnectionDatabase().getTransaction().commit();

            System.out.println("TestNewUser - New User ID: " + newUser.getId());
            createEntityConnection.closeConnection();

            isSuccessInsertNewUser = true;

        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            assertTrue(isSuccessInsertNewUser);
            System.out.println("TestNewUser: Insertion of a new user performed successfully.");
            System.out.println("TestNewUser: END");
        }
    }
}
