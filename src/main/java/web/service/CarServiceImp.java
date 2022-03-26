package web.service;

import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImp implements CarService {
    private CarDao carDao=new CarDaoImpl();

    @Override
    public List<Car> getCount(List<Car> carsList, int count) {
        return carDao.getCount(carsList, count);
    }
}
