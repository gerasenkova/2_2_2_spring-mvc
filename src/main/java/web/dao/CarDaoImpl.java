package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarDaoImpl implements CarDao{

    @Override
    public List<Car> getCount(List<Car> carsList, int count) {
        if (count==0 || count>=5) return carsList;
        return carsList.stream().limit(count).collect(Collectors.toList());
    }
}
