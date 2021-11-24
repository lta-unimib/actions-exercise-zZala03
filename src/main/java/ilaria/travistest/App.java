package ilaria.travistest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	if(args.length != 0) {
    		System.out.println( "Hello " + args[0] ); 		
    	} else {
    		System.out.println( "What's your name????");
    		System.out.println( "I would love to see travis working...");
    		
    	}
    }
}
