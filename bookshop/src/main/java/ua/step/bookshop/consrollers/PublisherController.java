package ua.step.bookshop.consrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ua.step.bookshop.reprositories.GenreReprository;

@Controller
public class PublisherController {
	
	@Autowired
	private GenreReprository repo;

	@GetMapping("/publishers")
	public String getGenres(Model model) {
		model.addAttribute("publishers", repo.findAll());
		return "publishers";
	}
	
}
