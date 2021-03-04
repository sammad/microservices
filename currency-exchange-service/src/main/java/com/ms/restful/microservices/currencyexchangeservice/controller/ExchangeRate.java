package com.ms.restful.microservices.currencyexchangeservice.controller;

import java.math.BigDecimal;

public class ExchangeRate {

	private String from;
	private String to;
	private BigDecimal rate;

	public ExchangeRate(String from, String to, BigDecimal rate) {
		super();
		this.from = from;
		this.to = to;
		this.rate=rate;
	}

    public ExchangeRate() {}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

}
