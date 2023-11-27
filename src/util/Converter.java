package util;

public class Converter {
	public static final double iof = 6.0;
	public double dollar;
	public double price;
	
	
	public double result_dolar() {
		return dollar * price;
	}
	
	public double result() {
		return result_dolar() * iof / 100.0 + result_dolar();
	}
	
}
