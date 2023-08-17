package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Добро пожаловать, уважаемый пользователь!");
		messages.add("Это стартовая страница");
		messages.add("В адресной строке браузера тебе нужно ввести: http://localhost:8080/cars?count=x ");
		messages.add("Где x - это колличество желаемых для отображения автомобилей ");
		model.addAttribute("messages", messages);
		return "index";
	}
	
}