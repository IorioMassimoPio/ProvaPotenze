package Prova.Potenza;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Potenza p = new Potenza();
    	/*if(p.potenzaGenerica(3, 9))
    		System.out.println("potenza di 3");
    	if(p.potenzaGenerica(2, 64))
    		System.out.println("potenza di 2");
    	if(p.potenzaGenerica(5, 625))
    		System.out.println("potenza di 5");*/
    	
    	ArrayList<Integer> list = p.potenzeDiDue();
    	System.out.println(list);
    }
}
