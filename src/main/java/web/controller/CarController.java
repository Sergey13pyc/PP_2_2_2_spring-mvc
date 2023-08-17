package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String showCar(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        if ((count < 1) || (count > 5)) {
            count = 5;
        }
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }

}