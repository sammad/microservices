package com.ms.restful.microservices.currencyexchangeservice.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currency-exchange")
public class CurrencyExchangeController {

	@GetMapping("/{from}/to/{to}")
	public ExchangeRate getExchangeRate(@PathVariable String from,@PathVariable String to,@RequestParam String source) {
		System.out.println(source);
		return new ExchangeRate(from,to,BigDecimal.valueOf(1000.0d));
	}
}
