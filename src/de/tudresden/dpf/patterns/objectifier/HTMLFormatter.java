package de.tudresden.dpf.patterns.objectifier;

public class HTMLFormatter implements Formatter{

	@Override
	public String format(String text) {
		return text + ".html (Apply HTML styling via Delegate Object)";
	}

}
