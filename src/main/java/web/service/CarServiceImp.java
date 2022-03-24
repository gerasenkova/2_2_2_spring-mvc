package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImp implements CarService {
    @Override
    public List<Car> getCount(List<Car> carsList, int count) {
        if (count == 0 || count >= 5) return carsList;
        return carsList.stream().limit(count).collect(Collectors.toList());
    }
}
