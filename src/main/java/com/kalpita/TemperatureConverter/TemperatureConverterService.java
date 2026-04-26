package com.kalpita.TemperatureConverter;

import org.springframework.stereotype.Service;

@Service
public class TemperatureConverterService
{
	public String celToFah(double c)
	{
		double f = (c * 9 / 5) + 32;
		return "Celsius = " + c + " -> Fahrenheit = " + String.format("%.2f", f);
	}

	public String fahToCel(double f)
	{
		double c = (f - 32) * 5 / 9;
		return "Fahrenheit = " + f + " -> Celsius = " + String.format("%.2f", c);
	}
}