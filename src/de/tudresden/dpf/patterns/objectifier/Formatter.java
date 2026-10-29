package de.tudresden.dpf.patterns.objectifier;

//THE OBJECTIFIER (The Reified Hook)
// We extracted the specific formatting behavior into its own standalone interface.
public interface Formatter {
	
	String format(String text);	

}
