package h1;

public class H1_main {

	public static void main(String[] args) {
		
		int zone = 5;
		double price = 2.00;
		
		
		switch (zone) {
		    case 5:
		    	price += 0.70;
		    case 4:
		    case 3:
		    	price += 0.50;
		    case 2:
		    	price += 0.35;
		    	break;
		    	
		    default:
		    	if (zone >= 6) {
		    	price = 4.00;
		    	}
		    	break;
		}
        
		System.out.println(" Anzahl befahrener Zonen: " + zone + " Gesamter Preis: " + price + "€");
	}

}
