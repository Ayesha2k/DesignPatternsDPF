package de.tudresden.dpf.patterns.templatemethod;

public class HTMLExporter extends DocumentExporter {
	
	// BINDING THE HOOK
	@Override
	protected String format(String text) {
		return text + ".html (Apply HTML Styling)";
	}	

}
