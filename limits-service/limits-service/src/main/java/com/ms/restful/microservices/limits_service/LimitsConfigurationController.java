package com.ms.restful.microservices.limits_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.restful.microservices.limits_service.bean.LimitsConfiguration;
import com.ms.restful.microservices.limits_service.component.Configuration;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration config;
	@GetMapping("/limits")
	public LimitsConfiguration fetchConfiguration() {
		return new LimitsConfiguration(config.getMaximum(), config.getMinimum());
	}
}
