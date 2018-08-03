
package com.opcoach.agricola.ui.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.equinox.log.Logger;
import org.eclipse.swt.widgets.Composite;

import com.bistiboy.agricola.Agricola;
import com.bistiboy.agricola.AgricolaFactory;
import com.bistiboy.agricola.simu.AgricolaBox;

public class AgricolaPart {
	

	private Agricola a;

	@Inject
	public AgricolaPart() {
		a = AgricolaFactory.eINSTANCE.createAgricola();

		AgricolaBox box = new AgricolaBox();
		box.init(a);

		a.addGamer("Olivier");
		a.addGamer("Tom");

		a.play(a.getGamers().get(0));
		a.play(a.getGamers().get(1));
	}

	@PostConstruct
	public void postConstruct(Composite parent) {

		try {
			ECPSWTViewRenderer.INSTANCE.render(parent, a);
		} catch (ECPRendererException e) {
			e.printStackTrace();
		}

	}

}