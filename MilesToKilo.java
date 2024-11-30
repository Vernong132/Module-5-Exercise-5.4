public class MilesToKilo {
    public static void main(String[] args) {  
       final double Kilospermile = 1.609;
        
       //Mile & Kilo
        System.out.println("Miles               Kilometers");
       
       for (int i = 1; i <= 10; i++) {
    
        System.out.printf("%-20d%-2.3f\n", i, (i * Kilospermile ));
        }
    }
}

// START
    // DEFINE constant Kilospermile as 1.609
    
    // PRINT "Miles               Kilometers"

    // FOR each number i from 1 to 10
        // CALCULATE kilometers by multiplying i by Kilospermile
        // PRINT i and the calculated kilometers (3 decimal places)
    // END FOR
// END