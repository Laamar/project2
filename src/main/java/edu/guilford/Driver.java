package edu.guilford;


public class Driver {
    public static void main( String[] args ){
        //tests the constructor and toString method.
        //this test the default constructor.
        System.out.println("Testing the default constructor.");
        Rational r1 = new Rational();
        System.out.println("The rational number is "+ r1 +"\n");

        //tests the getters and setters
        System.out.println("Testing the getters and setters."+ "\n");
        Rational r2 = new Rational();
        //print out the values of r2
        System.out.println("The rational number is "+ r2);
        //print out the values of the getters
        System.out.println("The numerator is:"+ r2.getNumerator());
        System.out.println("The denominator is:"+ r2.getDenominator()+"\n");
        //print out the values of the setters
        System.out.println("Testing the second constructor.");
        Rational r3 = new Rational();
        System.out.println("The rational number is "+ r3);
        //print out the negate method.
        System.out.println("Testing the negate method.");
        r3.negate();
        System.out.println("The negate rational number of is "+ r3);
        //print out the invert method. 
        System.out.println("Testing the invert method.");
        r3.invert();
        System.out.println("The invert rational number is "+ r3 +"\n");
        //Write an instance method called toDouble that converts the rational number to a double (floating-point number) and returns the result.
        System.out.println("Testing the toDouble method."+ "\n");
        System.out.println("The double of the rational number is "+ r3.toDouble()+"\n");
         // use the constructor to create a new rational number
        Rational r4 = new Rational(1, 2);
        //use the method add to this class to add r3 to r2
        System.out.println("Here goes a new random generated rational number. "+ r4+"\n");
        r3.add(r4);
        //print out the inputs
        System.out.println("The inputs "+ r3 +" and "+ r4);
        //print out the result
        System.out.println("The sum of the rationals numbers, "+ r3 +" and "+ r4 +" is "+ r3.add(r4));
        //Add code that prints out a warning if the constructor with parameter attempts to generate a Rational number with a 0 denominator.
        if (r3.add(r4).getDenominator() == 0)
        {
            System.out.println("Warning: The denominator is 0."+ "\n");
        }
        else
        {
            System.out.println("The denominator is not 0."+ "\n");
        }


    
    
    }


}
    
