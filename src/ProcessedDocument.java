public class ProcessedDocument {
    public static void main(String[] args) {
        // Ensure you don't have any rogue System.out.println() statements before this line!
        DocumentRegistry registry = new DocumentRegistry();
        
        System.out.println(); 

        // 1. Clone and open PDF Prototype
        PdfDocument pdf1 = registry.createPdfDocument();
        pdf1.open();
        System.out.println("Type: " + pdf1.getType() + ", File: " + pdf1.getFileName() + 
                           ", Author: " + pdf1.getAuthor() + ", Pages: " + pdf1.getPageCount());
                           
        System.out.println();

        // 2. Clone and open Text Prototype
        TextDocument text1 = registry.createTextDocument();
        text1.open();
        System.out.println("Type: " + text1.getType() + ", Path: " + text1.getFilePath() + 
                           ", Encoding: " + text1.getEncoding() + ", Words: " + text1.getWordCount());
                           
        System.out.println();

        // 3. Clone and open Spreadsheet Prototype
        SpreadsheetDocument sheet1 = registry.createSpreadsheetDocument();
        sheet1.open();
        System.out.println("Type: " + sheet1.getType() + ", Name: " + sheet1.getSpreadsheetName() + 
                           ", Rows: " + sheet1.getRowCount() + ", Columns: " + sheet1.getColumnCount());
                           
        System.out.println();

        // 4. Clone PDF Prototype and modify attributes
        PdfDocument pdf2 = registry.createPdfDocument();
        pdf2.setFileName("summary_report.pdf");
        pdf2.setPageCount(30);
        pdf2.open();
    }
}