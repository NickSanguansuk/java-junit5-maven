package die_test_demo;

import die_demo.Die;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstructorTest {

    // template method
    private void test(Integer expectedNumberOfFaces) {
        Integer expectedFaceValue = null;

        // when
        Die die = new Die(expectedNumberOfFaces);
        Integer actualFaceValue = die.getCurrentFaceValue();
        Integer actualNumberOfFaces = die.getNumberOffFaces();

        // then
        assertEquals(expectedFaceValue, actualFaceValue);
        assertEquals(expectedNumberOfFaces, actualNumberOfFaces);
    }

    @Test
    public void test0() {
        test(3);
    }

    @Test
    public void test1() {
        test(4);
    }

    @Test
    public void test2() {
        test(6);
    }

}
