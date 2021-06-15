package racingcar;

public class Car {
    private final String name;
    private int position;
    private final int MOVE_NUMBER = 4;

    public Car(String carName) {
        nameCheck(carName);

        this.name = carName;
        this.position = 0;
    }

    private void nameCheck(String carName) {
        if (carName.length() > 5) {
            throw new IllegalArgumentException("자동차 이름이 5자 이상입니다");
        }
    }

    public void moveOrNot(int condition) {
        if (condition >= MOVE_NUMBER) {
            this.position++;
        }
    }

    public int getPosition() {
        return position;
    }

    public String getCarName() {
        return name;
    }

    public int extractBiggestPosition(int position) {
        if (this.position > position) {
            return this.position;
        }
        return position;
    }

    public boolean equalToPosition(int position) {
        return this.position == position;
    }
}
