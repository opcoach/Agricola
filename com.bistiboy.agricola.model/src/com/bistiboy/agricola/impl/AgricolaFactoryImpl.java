package com.bistiboy.agricola.impl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.bistiboy.agricola.GamerBoard;
import com.bistiboy.agricola.Parcel;
import com.bistiboy.agricola.AgricolaFactory;


// This factory  overrides the generated factory and returns the new generated interfaces
public class AgricolaFactoryImpl extends MAgricolaFactoryImpl implements AgricolaFactory
{
	
	public static AgricolaFactory init() {
		
		try {
			Object fact = MAgricolaFactoryImpl.init();
			if ((fact != null) && (fact instanceof AgricolaFactory))
					return (AgricolaFactory) fact;
			}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AgricolaFactoryImpl(); 
		 }
	
	public GamerBoard createGamerBoard()
	{
		GamerBoard result = new GamerBoardImpl();
		return result;
	}
	public Parcel createParcel()
	{
		Parcel result = new ParcelImpl();
		return result;
	}
}
