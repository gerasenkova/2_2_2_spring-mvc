package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService {

    @Override
    public List<Car> getCars(int count) {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("Audi", "A8", "black"));
        carsList.add(new Car("BMW", "5", "white"));
        carsList.add(new Car("Nissan", "Tilda", "blue"));
        carsList.add(new Car("Lada", "Kalina", "red"));
        carsList.add(new Car("Hundai", "Salaris", "gold"));
        if (count != 0 && count <= carsList.size() && count >= 0)
            return carsList.stream().limit(count).collect(Collectors.toList());
        return carsList;
    }
}
