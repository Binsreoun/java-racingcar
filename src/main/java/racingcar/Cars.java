package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private static final int MAX_CONDITION = 10;
    private static final int MIN_CONDITION = 1;
    private final List<Car> cars;

    public int createRandomNumber() {
        return (int) (MIN_CONDITION + Math.random() * MAX_CONDITION);
    }

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public String move(int position) {
        String bar = "";
        for (int i = 0; i < position; i++) {
            bar = bar.concat("-");
        }
        return bar;
    }

    public void moveCars() {
        for (Car car : cars) {
            int number = createRandomNumber();
            car.moveOrNot(number);
            System.out.println(car.getCarName() + " : " + this.move(car.getPosition()));
        }
    }

    public int findMaxPosition() {
        int maxPosition = 0;
        for (Car car : cars) {
            maxPosition = car.extractBiggestPosition(maxPosition);
        }
        return maxPosition;
    }

    public List<String> findWinners(int maxPosition) {
        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.equalToPosition(maxPosition)) {
                winners.add(car.getCarName());
            }
        }
        return winners;
    }
}
