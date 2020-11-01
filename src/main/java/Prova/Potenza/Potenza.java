package Prova.Potenza;

import java.util.ArrayList;

public class Potenza {

	public boolean potenzaGenerica(int numero, int n) {
		if(n==1)
			return true;
		int elevazione=numero;
		while(numero<=n) {
			if(numero==n)
				return true;
			else
				numero*=elevazione;
		}
		return false;
	}
	
	public ArrayList<Integer> potenzeDiDue(){
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i=0; i<20; i++)
			if(potenzaGenerica(2, i))
				l.add(i);
		return l;
	}
}
