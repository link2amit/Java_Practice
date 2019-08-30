package com.amit.test;

public class Passenger implements Comparable<Passenger> {

	private String name;
	private int passengerLevel;
	private int daysAtLevel;

	public Passenger(String name, int passengerLevel, int daysAtLevel) {
		this.name = name;
		this.passengerLevel = passengerLevel;
		this.daysAtLevel = daysAtLevel;
	}

	@Override
	public int compareTo(Passenger p) {
		if (passengerLevel > p.passengerLevel)
			return -1;
		else if (passengerLevel < p.passengerLevel)
			return 1;
		else
			return p.daysAtLevel - daysAtLevel;

	}
	
	@Override
	public String toString() {
		return this.name;
	}

}
