package de.tudresden.dpf.patterns.objectifier;

//THE CONCRETE HOOK VALUE
//This is just a helper object. It knows nothing about the overarching algorithm.
public class PdfFormatter implements Formatter {

	@Override
	public String format(String text) {
		return text + ".pdf (Apply PDF styling via Delegate Object)";
	}

}
