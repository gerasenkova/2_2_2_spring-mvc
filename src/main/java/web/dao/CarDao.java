package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    public List<Car> getCount(List<Car> carsList, int count);
}
