package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;


import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String carsList(@RequestParam(value = "count", required = false, defaultValue = "5") int count, ModelMap model) {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("Audi", "A8", "black"));
        carsList.add(new Car("BMW", "5", "white"));
        carsList.add(new Car("Nissan", "Tilda", "blue"));
        carsList.add(new Car("Lada", "Kalina", "red"));
        carsList.add(new Car("Hundai", "Salaris", "gold"));
        carsList = carService.getCount(carsList, count);
        model.addAttribute("carsList", carsList);
        return "/cars";
    }
}
