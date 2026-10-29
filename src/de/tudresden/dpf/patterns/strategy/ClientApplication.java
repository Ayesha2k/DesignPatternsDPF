package de.tudresden.dpf.patterns.strategy;

public class ClientApplication {

	public static void main(String[] args) {
		// 1. The client instantiates the specific strategies
        Exporter pdfStrategy = new PdfExportStrategy();
        Exporter htmlStrategy = new HTMLExportStrategy();
        
        // 2. The client hands over the entire job. 
        // It does not call a skeleton 'save()' method. It just calls the strategy.
        pdfStrategy.export("Annual_Report_2026");
        
        htmlStrategy.export("Annual_Report_2026");

	}

}
