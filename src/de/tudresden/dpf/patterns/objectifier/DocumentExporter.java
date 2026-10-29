package de.tudresden.dpf.patterns.objectifier;

public class DocumentExporter {
	// THE DELEGATE (The "Has-a" relationship)
    // Instead of an abstract method, we hold a reference to our helper object.
    private Formatter formatter;
    
    // We inject the initial formatter when we create the exporter.
    public DocumentExporter(Formatter formatter) {
        this.formatter = formatter;
    }
    
    // DYNAMIC BINDING: This setter is the magic of the Objectifier. 
    // It allows the client to swap the formatting behavior while the program is running!
    public void setFormatter(Formatter formatter) {
        this.formatter = formatter;
    }
    
    // TEMPLATE METHOD: The overarching algorithm remains exactly the same.
    public final void save(String documentName) {
        System.out.println("1. Extracting raw text from: " + documentName);
        System.out.println("2. Scanning for viruses...");
        
        // DELEGATION: We pass the specific work off to our helper object.
        String formattedOutput = formatter.format(documentName);
        
        System.out.println("3. Writing to disk: " + formattedOutput);
        System.out.println("4. Save complete.\n");
    }
}
