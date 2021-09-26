package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Form;

@Controller
@RequestMapping("/")
public class OrgController {


	@ModelAttribute
	Form form() {
		return new Form();
	}

	@GetMapping("/")
     public String index(@ModelAttribute("Form") Form form,Model model) {
        return "index";
    }
/*
	@RequestMapping(value="/result", method = RequestMethod.POST)
	  public String result(@ModelAttribute Form form, Model model){
	    form.sumTotal();
	    model.addAttribute("form", form);
	    return "result";
	}
	*/

}
