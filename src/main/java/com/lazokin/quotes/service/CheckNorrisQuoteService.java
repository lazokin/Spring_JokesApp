package com.lazokin.quotes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class CheckNorrisQuoteService implements QuoteService {
	
	private ChuckNorrisQuotes chuckNorrisQuotes;
	
	@Autowired
	public CheckNorrisQuoteService(ChuckNorrisQuotes chuckNorrisQuotes) {
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}

	@Override
	public String getQuote() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
