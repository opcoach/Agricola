package com.bistiboy.agricola.simu;

import com.bistiboy.agricola.Agricola;
import com.bistiboy.agricola.AgricolaFactory;
import com.bistiboy.agricola.Creation;
import com.bistiboy.agricola.CreationCard;
import com.bistiboy.agricola.MainBoard;
import com.bistiboy.agricola.Resource;
import com.bistiboy.agricola.SupplierCard;

public class AgricolaBox {
	private AgricolaFactory f = AgricolaFactory.eINSTANCE;
	
	public void init(Agricola agricolaImpl) {
		
		Agricola a = f.createAgricola();
		createSupplierCard(a);
		createCreationCard(a);

		fillMainBoard(a);

		
	} 

	private void createCreationCard(Agricola a) {
		//
		CreationCard c = f.createCreationCard();
		c.setName("Construcion d'une pi�ce");
		c.setUnique(true);

		Creation c1 = f.createCreation();
		c1.setName("Cabane en bois");
		c1.getCost().add(f.createSupply(5, Resource.WOOD));
		c1.getCost().add(f.createSupply(2, Resource.REED));

		Creation c2 = f.createCreation();
		c2.setName("Cabane en argile");
		c2.getCost().add(f.createSupply(5, Resource.CLAY));
		c2.getCost().add(f.createSupply(2, Resource.REED));

		Creation c3 = f.createCreation("Maison en pierre", f.createSupply(5, Resource.STONE),
				f.createSupply(2, Resource.REED));
		
		c.getCreations().add(c1);
		c.getCreations().add(c2);
		c.getCreations().add(c3);
		
		a.getCards().add(c);
	}

	private void createSupplierCard(Agricola a) {
		// Create
		SupplierCard c = f.createSupplierCard();
		c.setName("1 roseau");
		c.setSupply(f.createSupply(1, Resource.REED));
		c.getBankSupply().add(f.createSupply(1, Resource.WOOD));
		c.getBankSupply().add(f.createSupply(1, Resource.STONE));

		a.getCards().add(c);

	}

	private void fillMainBoard(Agricola a) {
		MainBoard mb = f.createMainBoard();

		mb.getRounds().add(f.createRound("Tour 1"));
		mb.getRounds().add(f.createRound("Tour 2"));
		mb.getRounds().add(f.createRound("Tour 3"));
		mb.getRounds().add(f.createRound("Tour 4"));
		mb.getRounds().add(f.createRound("Tour 5"));

		a.setMainboard(mb);
	}



}
