package die_demo;

public enum CommonDieFaces {

    SIX_SIDED_DIE(6),
    TEN_SIDED_DIE(10),
    TWENTY_SIDED_DIE(20);

    private final int value;

    CommonDieFaces(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
