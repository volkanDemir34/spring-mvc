package com.mvc.model;

import java.math.BigDecimal;

public class Foo {
	
	private int id;
	private String name;
	private BigDecimal targetCost;
	private BigDecimal actualCost;
	
	
	public Foo(int id, String name, int targetCost ,int actualCost) {
		this.id=id;
		this.name=name;
		this.targetCost= BigDecimal.valueOf(targetCost);
		this.actualCost=BigDecimal.valueOf(actualCost);
				
	}
	
	public Foo(int id, String name, BigDecimal targetCost ,BigDecimal actualCost) {
		this.id=id;
		this.name=name;
		this.targetCost= targetCost;
		this.actualCost=actualCost;
				
	}
	
	public int getId() {
		return id;
		
		
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getTargetCost() {
		return targetCost;
	}
	public void setTargetCost(BigDecimal targetCost) {
		this.targetCost = targetCost;
	}
	public BigDecimal getActualCost() {
		return actualCost;
	}
	public void setActualCost(BigDecimal actualCost) {
		this.actualCost = actualCost;
	}
	
	

}
