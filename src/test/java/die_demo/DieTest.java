package die_demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {

    @Test
    public void testConstructor() {
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
    public void getNumberOffFaces() {
    }

    @Test
    public void getCurrentFaceValue() {
    }

    @Test
    public void roll() {
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
    public void testRollException() {
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

        // when2
        assertThrows(IllegalArgumentException.class, () -> {
            Die die = new Die(numberOfFaces);
            die.roll();
        });

        //assertThrows(NullPointerException.class, () -> {
        //    Die die = new Die(numberOfFaces);
        //    die.roll();
        //});
    }

    @ParameterizedTest
    @ValueSource(ints = {6, 20, 5000})
    public void testRollWithValueSource(int dieFace) {

        Die die = new Die(dieFace);
        die.roll();

        Integer actualFaceValue = die.getCurrentFaceValue();

        System.out.println("Running the test for dieFace = " + dieFace + " Rolled value = " + actualFaceValue);

        if (actualFaceValue < 1 || actualFaceValue > dieFace) {
            Assertions.fail("Die roll out of range");
        }
    }

    @ParameterizedTest
    @EnumSource(CommonDieFaces.class)
    public void testRollWithEnumSource(CommonDieFaces dieFace) {

        Die die = new Die(dieFace.getValue());
        die.roll();

        Integer actualFaceValue = die.getCurrentFaceValue();

        System.out.println("Running the test for dieFace = " + dieFace.getValue() + " Rolled value = " + actualFaceValue);

        if (actualFaceValue < 1 || actualFaceValue > dieFace.getValue()) {
            Assertions.fail("Die roll out of range");
        }
    }

    @ParameterizedTest
    @CsvSource({"1,1,2,true","1,1,3,false"})
    public void testJUnit5CsvParameters(int num1, int num2, int expectedAnswer, boolean veracity) {

        if(veracity) {
            assertTrue(Math.addExact(num1, num2) == expectedAnswer);
            System.out.println(num1 + " plus " + num2 + " equals " + expectedAnswer);
        } else {
            assertFalse(Math.addExact(num1, num2) == expectedAnswer);
            System.out.println(num1 + " plus " + num2 + " does not equal " + expectedAnswer);
        }
    }

}