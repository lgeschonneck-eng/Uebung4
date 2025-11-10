package h2;

public class H2_main {

	public static void main(String[] args) {
		int input = 11;
		boolean x,y,a,b,c;
		
		switch (input) {
		    case 10:
		    case 11:
		    	x = true;
		    	break;
		    default:
		    	x = false;	
		}
		
		switch (input) {
		    case 1:
		    case 11:
		    	y = true;
		    	break;
		    default:
		    	y = false;
		}
        boolean E1 = x;
        boolean E2 = y;
        boolean E3 = (x != y);
        
        a = (E1 && E2);
        b = (E1 || E3);
        c = !y;
        
        System.out.println( "input = " + input);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " +c);
	}

}
