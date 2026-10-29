package de.tudresden.dpf.patterns.strategy;

public class PdfExportStrategy implements Exporter{
	// THE CONCRETE STRATEGY
    // There is no overarching skeleton from a base class. 
    // This class is completely responsible for every step of the export process.
    @Override
    public void export(String documentName) {
        System.out.println("--- Executing PDF Strategy ---");
        System.out.println("1. Extracting raw text from: " + documentName);
        System.out.println("2. Scanning for viruses...");
        System.out.println("3. Formatting as PDF (Applying styling and encryption)...");
        System.out.println("4. Writing PDF to disk.");
        System.out.println("Save complete.\n");
    }
}
