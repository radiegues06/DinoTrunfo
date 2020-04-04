package com.dino.model;

public class Card {
	
	private String name;
	private int number;
	private String letter;
	private String eatingStrategy;
	private String period;
	private float height;
	private float length;
	private float weight;
	private int yearsAgo;
	private boolean superTrunfo;
	
	public Card(String line) {
		
		String[] data = line.split(",");
		
		name = data[0];
		number = Integer.parseInt(data[1]);
		letter = data[2];
		eatingStrategy = data[3];
		period = data[4];
		height = Float.parseFloat(data[5]);
		length = Float.parseFloat(data[6]);
		weight = Float.parseFloat(data[7]);
		yearsAgo = Integer.parseInt(data[8]);
		superTrunfo = data[9].equals("1")? true :false;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumber() {
		return number;
	}

	public String getLetter() {
		return letter;
	}

	public String getEatingStrategy() {
		return eatingStrategy;
	}

	public String getPeriod() {
		return period;
	}
	
	public float getHeight() {
		return height;
	}
	
	public float getLength() {
		return length;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public int getYearsAgo() {
		return yearsAgo;
	}
	
	public boolean isSuperTrunfo() {
		return superTrunfo;
	}
	
}
