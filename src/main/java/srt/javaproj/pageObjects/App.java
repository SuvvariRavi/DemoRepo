package srt.javaproj.pageObjects;

/**
 * Hello world!
 *
 */
public class App 
{
	static String ravitej = "Bheemla Nayak";

    public static void main( String[] args )
    {
    	//String ravitej = "vakeel saab";
        //System.out.println( "Hello World!" );
        //System.out.println(ravitej);
        App.m1(ravitej);
    }
    public static void m1(String ravitej) {
    	
       int i=1;
       while(i<=5)
       {
       System.out.println(ravitej);
       i++;
       }
       
    }
}
