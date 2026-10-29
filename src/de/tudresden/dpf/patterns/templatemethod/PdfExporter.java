package de.tudresden.dpf.patterns.templatemethod;

public class PdfExporter extends DocumentExporter {
	
	// BINDING THE HOOK
    // We provide the specific implementation that the template method requires.
	@Override
	protected String format(String text) {
		return text + ".pdf (Apply PDF styling and 128-bit encryption)";
	}

}
