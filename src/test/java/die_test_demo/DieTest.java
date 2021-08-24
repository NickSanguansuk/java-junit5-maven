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

    // manual way (not a good way)
    @Test
    void testRollException() {
        // given
        Boolean expectedException = true;
        Integer numberOfFaces = -3;
        Boolean actualException = false;

        // when
        try {
            Die die = new Die(numberOfFaces);
            die.roll();
        } catch (Exception e) {
            System.out.println(e);
            actualException = true;
        } finally {
            // then
            assertEquals(expectedException, actualException);
        }
    }

}