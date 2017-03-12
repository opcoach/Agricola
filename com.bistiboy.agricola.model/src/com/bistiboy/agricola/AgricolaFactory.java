package com.bistiboy.agricola;

import com.bistiboy.agricola.impl.AgricolaFactoryImpl;

/** This factory  overrides the generated factory and returns the new generated interfaces */
public interface AgricolaFactory extends MAgricolaFactory 
{
	
	/** Specialize the eINSTANCE initialization with the new interface type 
	  * (overridden in the override_factory extension)
	*/
	AgricolaFactory eINSTANCE = AgricolaFactoryImpl.init();
				
	public GamerBoard createGamerBoard();
	public Parcel createParcel();
}
