
package com.opcoach.agricola.ui.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.swt.widgets.Composite;

public class AgricolaFormPart
{
	public static final String FORM_PART_EDITOR_PARAM = "com.opcoach.agricola.ui.parts.AgricolaFormPart.Selection" ;

	private EObject o;

	@Inject
	public AgricolaFormPart(@Optional @Named(FORM_PART_EDITOR_PARAM)EObject selected) {
		System.out.println("Selection recue : " + selected);
		o = selected;
	}

	@PostConstruct
	public void postConstruct(Composite parent) {

		try {
			ECPSWTViewRenderer.INSTANCE.render(parent, o);
		} catch (ECPRendererException e) {
			e.printStackTrace();
		}

	}

}