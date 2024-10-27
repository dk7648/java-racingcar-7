package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class CarManager {
    private static CarManager instance;
    private List<Car> cars;
    private int remainingAttempts;

    private CarManager() {
        cars = new ArrayList<>();
        remainingAttempts = 0;
    }

    public static CarManager getInstance() {
        if(instance == null) {
            instance = new CarManager();
        }
        return instance;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

}