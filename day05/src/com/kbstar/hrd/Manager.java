package com.kbstar.hrd;

public class Manager {

	private String id;
	private String name;
	private int salary;
	private double bonus;
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public int getSalary() {
		return salary;
	}


	public double getBonus() {
		
		return bonus;
	}

	
	
	public double getAnnSalary() {
		
		double result =0; //local variable
		return result = (this.salary + this.bonus) * 12;
	}
	
	
	
	
	public double getTax() {
		double result =0;
		result = (this.salary +this.bonus) *0.17;
		return result;
	}
	
	
	
	public double getAnnTax() {
		double result =0;
		result = this.getAnnSalary() * 0.17;
		return result;
	}
	

	
	public Manager(String id, String name, int salary, int bonus) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
	}

	

	@Override
	public String toString() {
		return "manager [id=" + id + ", name=" + name + ", salary=" + salary + ", bonus=" + bonus + "]";
	}
	
	
	
}
