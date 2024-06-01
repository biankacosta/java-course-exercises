package exercicioCambio;

public class Cambio {
	
	public static double valueDollar;

	public static double amountToBePay(double valueToBeConverted){
		double finalAmount = valueToBeConverted * valueDollar;
		finalAmount += finalAmount * 0.06;
		return finalAmount;
	}
	

}
