package de.tudresden.dpf.patterns.strategy;

//THE STRATEGY
//This encapsulates the entire algorithm, not just a single hook step.
public interface Exporter {
	
	void export(String documentName);
}
