package other_demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyClassTest2 {

    private final MyClass calculator = new MyClass();

    @Test
    void additionTest() {
        System.out.println("Test started");
        //assertEquals(57, calculator.add(1, 1));
        assertEquals(2, calculator.add(1, 1));
        System.out.println("Test Finished");
    }
}
