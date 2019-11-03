package es.upm.miw.iwvg.ecosystem.practicas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    private User user;

    @BeforeEach
    void before() {
        user = new User(1,"pablo","perez");
    }

    @Test
    void testUserIntStringString() {
        assertEquals("Perez",user.getFamilyName());
        assertEquals("Pablo",user.getName());
        assertEquals(1,user.getNumber());
    }

    @Test
    void testUserFullName() {
        assertEquals("Pablo Perez", user.fullName());
    }

    @Test
    void testUserInitials() {
        assertEquals("P.", user.initials());
    }
}
