/*******************************************************************************
 * Copyright (c) 2013 AKSW Xturtle Project, itemis AG (http://www.itemis.eu).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package de.itemis.tooling.xturtle.ui.preferences;

import javax.inject.Inject;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * Class used to initialize default preference values.
 */
public class TurtlePreferenceInitializer extends AbstractPreferenceInitializer {

	@Inject
	IPreferenceStore store;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#
	 * initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		//label preferences
		store.setDefault(TurtlePreferenceConstants.LABEL_PREFERENCE_KEY, getDefaultLabelUris());

		//description preferences
		store.setDefault(TurtlePreferenceConstants.DESCRIPTION_PREFERENCE_KEY, getDefaultDescriptionUris());
		store.setDefault(TurtlePreferenceConstants.USE_NOLANGUAGE_PREFERENCE_KEY, true);
		store.setDefault(TurtlePreferenceConstants.USE_DEFAULT_LANGUAGE_PREFERENCE_KEY, true);
		store.setDefault(TurtlePreferenceConstants.LANGUAGES_PREFERENCE_KEY, "");

		//folding preferences
		store.setDefault(TurtlePreferenceConstants.FOLD_DIRECTIVES_KEY, true);
		store.setDefault(TurtlePreferenceConstants.FOLD_STRINGS_KEY, true);
		store.setDefault(TurtlePreferenceConstants.FOLD_TRIPLES_KEY, false);
		store.setDefault(TurtlePreferenceConstants.FOLD_BLANK_COLL, true);
		store.setDefault(TurtlePreferenceConstants.FOLD_BLANK_OBJ, true);

		//validation
		store.setDefault(TurtlePreferenceConstants.VALIDATION_NS_MISMATCH_KEY, "warn");
		store.setDefault(TurtlePreferenceConstants.VALIDATION_PREFIX_MISMATCH_KEY, "warn");
		store.setDefault(TurtlePreferenceConstants.VALIDATION_UNRESOLVED_QNAME_KEY, "error");
		store.setDefault(TurtlePreferenceConstants.VALIDATION_UNRESOLVED_URI_KEY, "null");
		store.setDefault(TurtlePreferenceConstants.VALIDATION_UNUSED_PREFIX_KEY, "info");
		store.setDefault(TurtlePreferenceConstants.VALIDATION_XSD_TYPE_KEY, "info");
		store.setDefault(TurtlePreferenceConstants.VALIDATION_DUPLICATE_SUBJECT_KEY, "info");

		//content assist
		store.setDefault(TurtlePreferenceConstants.CA_LANGUAGES_KEY, "en,,zh,,hi,,es,,fr,,ar,,ru,,pt,,bn,,de,,ja,,ko");
	}

	private String getDefaultDescriptionUris() {
		StringBuilder b = new StringBuilder();
		b.append("http://www.w3.org/2004/02/skos/core#definition");
		b.append("\n");
		b.append("http://www.w3.org/2000/01/rdf-schema#comment");
		b.append("\n");
		b.append("http://purl.org/dc/terms/description");
		b.append("\n");
		b.append("http://purl.org/dc/elements/1.1/description");
		b.append("\n");
		b.append("http://www.w3.org/2004/02/skos/core#note");
		b.append("\n");
		b.append("http://www.w3.org/2004/02/skos/core#editorialNote");
		b.append("\n");
		return b.toString();
	}

	private String getDefaultLabelUris() {
		StringBuilder b = new StringBuilder();
		b.append("http://www.w3.org/2004/02/skos/core#prefLabel");
		b.append("\n");
		b.append("http://purl.org/dc/elements/1.1/title");
		b.append("\n");
		b.append("http://purl.org/dc/terms/title");
		b.append("\n");
		b.append("http://swrc.ontoware.org/ontology#title");
		b.append("\n");
		b.append("http://xmlns.com/foaf/0.1/name");
		b.append("\n");
		b.append("http://usefulinc.com/ns/doap#name");
		b.append("\n");
		b.append("http://rdfs.org/sioc/ns#name");
		b.append("\n");
		b.append("http://www.holygoat.co.uk/owl/redwood/0.1/tags/name");
		b.append("\n");
		b.append("http://linkedgeodata.org/vocabulary#name");
		b.append("\n");
		b.append("http://www.geonames.org/ontology#name");
		b.append("\n");
		b.append("http://www.geneontology.org/dtds/go.dtd#name");
		b.append("\n");
		b.append("http://www.w3.org/2000/01/rdf-schema#label");
		b.append("\n");
		b.append("http://xmlns.com/foaf/0.1/accountName");
		b.append("\n");
		b.append("http://xmlns.com/foaf/0.1/nick");
		b.append("\n");
		b.append("http://xmlns.com/foaf/0.1/surname");
		b.append("\n");
		b.append("http://www.w3.org/2004/02/skos/core#altLabel");
		b.append("\n");
		return b.toString();
	}

}
