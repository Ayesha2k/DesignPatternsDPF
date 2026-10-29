package de.tudresden.dpf.patterns.strategy;

public class HTMLExportStrategy implements Exporter {
	
	// A completely independent algorithmic strategy.
    @Override
    public void export(String documentName) {
        System.out.println("--- Executing HTML Strategy ---");
        System.out.println("1. Extracting raw text from: " + documentName);
        System.out.println("2. Skipping virus scan for web output...");
        System.out.println("3. Wrapping text in HTML tags...");
        System.out.println("4. Writing HTML file to disk.");
        System.out.println("Save complete.\n");
    }
}
