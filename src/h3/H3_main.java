package h3;

public class H3_main {

	public static void main(String[] args) {
		float celsiusFloat = 14.2f;
		float fahrenheitFloat = celsiusFloat * 9 / 5 + 32;
		
		double celsiusDouble = 14.2;
		double fahrenheitDouble = celsiusDouble * 9 / 5 + 32;
		
		System.out.println("Float-Berechnung:");
		System.out.println(celsiusFloat + " °C = " + fahrenheitFloat + " °F");
		System.out.println("\nDouble-Berechnung:");
		System.out.println(celsiusDouble + " °C = " + fahrenheitDouble + " °F");
	}

}
