package es.upm.miw.iwvg_devops.rest.code;

import es.upm.miw.iwvg_devops.code.Fraction;
import es.upm.miw.iwvg_devops.code.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    User user;
    List<Fraction> fractions;

    @BeforeEach
    void execute(){
        fractions = new ArrayList<>();
        user = new User("1", "Juan", "Gonzalez", fractions);
    }

    @Test
    void testGetId() {
        assertEquals("1", user.getId());
    }

    @Test
    void testGetName() {
        assertEquals("Juan", user.getName());
    }

    @Test
    void testSetName() {
        user.setName("Pepe");
        assertEquals("Pepe", user.getName());
    }

    @Test
    void testGetFamilyName() {
        assertEquals("Gonzalez", user.getFamilyName());
    }

    @Test
    void testSetFamilyName() {
        user.setFamilyName("Pepeto");
        assertEquals("Pepeto", user.getFamilyName());
    }

    @Test
    void testGetFractions() {
        assertEquals(fractions.toString(), user.getFractions().toString());
    }

    @Test
    void testSetFractions() {
        List<Fraction> fractions2 = new ArrayList<>(2);
        Fraction f1 = new Fraction(3, 2);
        Fraction f2 = new Fraction(3, 3);
        fractions2.add(f1);
        fractions2.add(f2);
        user.setFractions(fractions2);
        assertEquals(fractions2.toString(), user.getFractions().toString());
    }

    @Test
    void testAddFraction() {
        Fraction f1 = new Fraction(3, 2);
        user.addFraction(f1);
        assertEquals(fractions, user.getFractions());
    }

    @Test
    void testFullName() {
        assertEquals("Juan Gonzalez", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("J.", user.initials());
    }

    @Test
    void testToString() {
        assertEquals("User{" +
                        "id='" + "1" + '\'' +
                        ", name='" + "Juan" + '\'' +
                        ", familyName='" + "Gonzalez" + '\'' +
                        ", fractions=" + fractions +
                        '}',
                "User{" +
                        "id='" + user.getId() + '\'' +
                        ", name='" + user.getName() + '\'' +
                        ", familyName='" + user.getFamilyName() + '\'' +
                        ", fractions=" + user.getFractions() +
                        '}');
    }
}
