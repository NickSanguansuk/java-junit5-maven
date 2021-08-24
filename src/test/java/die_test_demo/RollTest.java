package die_test_demo;

import die_demo.Die;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RollTest {

    // template method
    private void test(Integer numberOfFaces) {
        // given
        Integer unexpected = null;
        Die die = new Die(numberOfFaces);

        // when
        die.roll();
        Integer actual = die.getCurrentFaceValue();

        // then
        assertNotEquals(unexpected, actual);
    }

    @Test
    public void test0() {
        test(2);
    }

    @Test
    public void test1() {
        test(3);
    }

    //@Test(expected=NullPointerException.class)
    @Test
    public void test2() {

        assertThrows(NullPointerException.class, () -> test(null));
    }

    @Test
    public void test3() {

        assertThrows(IllegalArgumentException.class, () -> test(-2));
    }

}
