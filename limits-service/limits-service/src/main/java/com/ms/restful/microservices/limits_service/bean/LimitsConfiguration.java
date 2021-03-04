package com.ms.restful.microservices.limits_service.bean;

public class LimitsConfiguration {

	private Integer maximum;
	private Integer minimum;

	protected LimitsConfiguration() {}
	public LimitsConfiguration(Integer maximum, Integer minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	public Integer getMaximum() {
		return maximum;
	}
	public void setMaximum(Integer maximum) {
		this.maximum = maximum;
	}
	public Integer getMinimum() {
		return minimum;
	}
	public void setMinimum(Integer minimum) {
		this.minimum = minimum;
	}


}
