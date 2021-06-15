package racingcar;

public class Count {
    private final int tryNumber;

    public Count(int Number) {
        this.tryNumber = Number;
    }

    public int getTryNumber() {
        return tryNumber;
    }

    public boolean isPlaying() {
        return tryNumber > 0;
    }

    public Count minus() {
        return new Count(tryNumber - 1);
    }
}
