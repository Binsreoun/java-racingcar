package racingcar;

public class Car {
    private final String carName;
    private int position;
    private final int MOVE_NUMBER = 4;

    public Car(String carName) {
        CheckName(carName);

        this.carName = carName;
        this.position = 0;
    }

    private void CheckName(String carName) {
        if (carName.length() > 5) {
            throw new IllegalArgumentException("자동차 이름이 5자 이상입니다");
        }
    }

    public void moveOrNot(int move) {
        if (move >= MOVE_NUMBER) {
            this.position++;
        }
    }

    public int getPosition() {
        return position;
    }

    public String getCarName() {
        return carName;
    }

    public int maxPosition(int maxPosition) {
        if (this.position > maxPosition) {
            return this.position;
        }
        return maxPosition;
    }

    public boolean maxCheck(int maxPosition) {
        return this.position == maxPosition;
    }
}
