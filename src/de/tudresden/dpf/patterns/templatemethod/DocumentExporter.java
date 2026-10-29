package de.tudresden.dpf.patterns.templatemethod;

public abstract class DocumentExporter {
	
	//TEMPLATE METHOD : concrete and fixed algorithm skeleton
	// Marked final so subclasses cannot override the overarching control flow
	public final void save(String documentName) {
		System.out.println("1. Extracting raw text from: " + documentName);
		System.out.println("2. Scanning for viruses...");
		
		//Calling HOOK METHOD
		String formattedOutput = format(documentName);
		
		System.out.println("3. Writing to disk " + formattedOutput);
		System.out.println("2. Save complete.\n");		
	}
	//HOOK METHOD : for specific variants
	// Subclasses implement this to define how the text is formatted.
	protected abstract String format(String text);
}
