package die_test_demo;

import die_demo.Die;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {

    @Test
    void testConstructor() {
        // given
        Integer expectedFaceValue = null;
        Integer expectedNumberOfFaces = null;

        // when
        Die die = new Die(expectedNumberOfFaces);
        Integer actualFaceValue = die.getCurrentFaceValue();
        Integer actualNumberOfFaces = die.getNumberOffFaces();

        // then
        assertEquals(expectedFaceValue, actualFaceValue);
        assertEquals(expectedNumberOfFaces, actualNumberOfFaces);
    }

    @Test
    void getNumberOffFaces() {
    }

    @Test
    void getCurrentFaceValue() {
    }

    @Test
    void roll() {
        // given
        Integer numberOfFaces = 2;
        Integer unexpected = null;
        Die die = new Die(numberOfFaces);

        // when
        die.roll();
        Integer actual = die.getCurrentFaceValue();

        // then
        assertNotEquals(unexpected, actual);
    }

}