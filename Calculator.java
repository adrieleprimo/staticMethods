package util;

public class Calculator {
	public static final double IOF = 0.06;
	public static double value (double dollar, double bought) {
		return (dollar*bought)*IOF + dollar*bought;
	}
	
}
