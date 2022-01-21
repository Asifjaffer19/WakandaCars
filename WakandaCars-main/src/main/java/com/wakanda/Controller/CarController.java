package com.wakanda.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.wakanda.entity.Car;
import com.wakanda.service.CarService;

@Controller
public class CarController {
	
	@Autowired
	private CarService service; 
	
	@GetMapping("/")
	public String home(Model m)
	{
	
		List<Car> car = service.getAllCars();
		m.addAttribute("car", car );
		return "index";
	}
	
	
	
	@GetMapping("/addcar")
	public String addCarForm()
	{
		return "add_car";
	}
	
	@PostMapping("/register")
	public String carRegister(@ModelAttribute Car c , HttpSession session)
	{
		System.out.println(c);
		session.setAttribute("msg", "Car Details Added Sucessfully");
		
		service.addCar(c);
		return "redirect:/";
	}
	
	@GetMapping("/edit/{carid}")
	public String edit (@PathVariable int carid , Model m)
	{
		Car c = service.getCarById(carid);
		m.addAttribute("car" , c);
		return "edit";
	}
	
	@PostMapping("/update")
	public String updateCar(@ModelAttribute Car c , HttpSession session)
	{
		System.out.println(c);
		session.setAttribute("msg", "Car Data Update Sucessfully");
		
		service.addCar(c);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{carid}")
	public String deleteCar (@PathVariable int carid , HttpSession session)
	{
		service.deleteCar(carid);
        session.setAttribute("msg", "Car Data Deleted Sucessfully");
        
		return "redirect:/";
	}
		

}
