package racingcar;

import java.util.List;

public class CarRacing {

    private Count count;
    private final Cars cars;

    public CarRacing(Count count, Cars cars) {
        this.count = count;
        this.cars = cars;
    }

    public void startRacing() {
        while (count.isPlaying()) {
            cars.moveCars();
            System.out.println();
            count = count.minus();
        }
    }

    public int positionCheck(Cars cars) {
        int maxPosition = 0;
        maxPosition = cars.findMaxPosition();
        return maxPosition;
    }

    public List<String> winner(Cars cars) {
        int max = positionCheck(cars);
        List<String> winner = cars.findWinners(max);
        return winner;
    }
}
