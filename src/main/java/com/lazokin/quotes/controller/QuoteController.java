package com.lazokin.quotes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lazokin.quotes.service.QuoteService;

@Controller
public class QuoteController {
	
	private QuoteService quoteService;

	@Autowired
	public QuoteController(QuoteService quoteService) {
		this.quoteService = quoteService;
	}

	@RequestMapping({"/", ""})
	public String getJokes(Model model) {
		model.addAttribute("quote", quoteService.getQuote());
		return "quote";
	}

}
