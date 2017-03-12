package com.bistiboy.agricola.simu;

import com.bistiboy.agricola.Agricola;
import com.bistiboy.agricola.AgricolaFactory;

public class AgricolaSimu {
	
	public static void main(String[] args) {
		
		AgricolaFactory f = AgricolaFactory.eINSTANCE;
		
		Agricola a = f.createAgricola();
		a.start();
		
		a.addGamer("Nico");
		a.addGamer("Chloe");
		
		a.play(a.getGamers().get(0));
		a.play(a.getGamers().get(1));
		
		
		
	}

}
