package es.upm.miw.iwvg.forge.junit;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class UserTest {

    private User user;

    @BeforeEach
    void before() {
        user = new User(1, "Alexandra", "Cabrera");
    }

    @Test
    void testFullName() {
        assertEquals("Alexandra Cabrera", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("A.", user.initials());
    }

}