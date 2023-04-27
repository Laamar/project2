package edu.guilford;

/**
 * Hello world!
 *
 */
public class Driver 
{
    public static void main( String[] args )
    {
        //Test the Constructor and toString method method
        Rational r = new Rational();
        System.out.println(r);

        //Test the second Constructor and toString method
        Rational r2 = new Rational(3, 4);
        System.out.println(r2);
        //Test the negate method
        r2.negate();
        System.out.println(r2);
        //Test the invert method
        r2.invert();
        System.out.println(r2);
        //Test the toDouble method
        System.out.println(r2.toDouble());
        //Test the reduce method
       // r2.reduce();
        //System.out.println(r2);
        //Test the add method
        r2.add(r2);
        System.out.println(r2);


    }
}
