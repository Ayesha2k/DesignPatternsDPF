package de.tudresden.dpf.patterns.templatemethod;

import java.util.Scanner;

public class ClientApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose format to save the document \nPress 1 for to generate PDF \nPress 2 to gnerate HTML \n");
		int option = sc.nextInt();
		DocumentExporter exporter = null;
		
		// 1. Instantiation (Static Binding)
		if(option == 1) {
	        // We lock in the PDF behavior by choosing the specific subclass.
	        exporter = new PdfExporter();
		}else if(option == 2) {
			// We lock in the HTML behavior by choosing the specific subclass.
	        exporter = new HTMLExporter();	
		}
        
        System.out.println("--- Starting Export Process ---");
        
        // 2. Execution
        // The client only calls the Template Method. It is completely unaware 
        // of the protected 'format' hook method happening behind the scenes.
    
        exporter.save("Annual_Report_2026");
        sc.close();
	}

}
