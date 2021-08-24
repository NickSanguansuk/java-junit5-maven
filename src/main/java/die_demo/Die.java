package die_demo;

import java.util.concurrent.ThreadLocalRandom;

public class Die {
    // Data
    private Integer numberOffFaces;
    private Integer currentFaceValue;

    // Constructors
    public Die(Integer numberOffFaces) {
        this.numberOffFaces = numberOffFaces;
    }

    // Getters and Setters
    public Integer getNumberOffFaces() {
        return numberOffFaces;
    }

    public Integer getCurrentFaceValue() {
        return currentFaceValue;
    }

    // Methods
    public void roll() {
        ThreadLocalRandom randomNumberGenerator = ThreadLocalRandom.current();
        Integer randomFaceValue = randomNumberGenerator.nextInt(1, numberOffFaces);
        this.currentFaceValue = randomFaceValue;
    }

}
