package other_demo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyClassTest {

    private final MyClass myClass = new MyClass();

    //@BeforeAll is interchangeable with JUnit 4’s @BeforeClass

    @BeforeAll
    public static void beforeAll() {
        System.out.println("beforeAll/beforeClass Finished ");
    }

    @Test
    public void additionTest() {
        assertEquals(2, myClass.add(1, 1));
        System.out.println("additionTest Finished ");
    }

}
