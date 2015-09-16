package br.edu.univas.si.lab6.bmi.service;

public class BMIService {
	private BMIService() {
		// TODO Auto-generated constructor stub
	}
	
	public static Float getIndex(Float weight, Float height) {
		return weight / (height * height);
	}

	public static String getDescription(Float bmiIndex) {
		// TODO
		return "";
	}

}
