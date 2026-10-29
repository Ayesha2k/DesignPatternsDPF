package de.tudresden.dpf.patterns.objectifier;

public class ClientApplication {

	public static void main(String[] args) {
		// 1. Create the helper objects
        Formatter pdfHelper = new PdfFormatter();
        Formatter htmlHelper = new HTMLFormatter();
        
        // 2. CONSTRUCTOR: We create ONE exporter and inject the PDF helper.
        DocumentExporter exporter = new DocumentExporter(pdfHelper);
        
        System.out.println("--- Exporting as PDF ---");
        exporter.save("Annual_Report_2026");
        
        // 3. SETTER: We dynamically swap the helper at runtime! 
        // We didn't create a new DocumentExporter, we just changed its behavior.
        exporter.setFormatter(htmlHelper);
        
        System.out.println("--- Exporting as HTML ---");
        exporter.save("Annual_Report_2026");

	}

}
