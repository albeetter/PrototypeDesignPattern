public class DocumentRegistry {
    private PdfDocument pdfPrototype;
    private TextDocument textDocumentPrototype;
    private SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        System.out.println("Creating a PDF Document prototype.");
        pdfPrototype = new PdfDocument("annual_report_2024.pdf", "Acme Corp", 150, "Annual Report");

        System.out.println("Creating a Text Document prototype.");
        textDocumentPrototype = new TextDocument("meeting_notes.txt", "UTF-8", 250);

        System.out.println("Creating a Spreadsheet Document prototype.");
        spreadsheetPrototype = new SpreadsheetDocument("sales_data_q1.xlsx", 1000, 20);
    }

    public PdfDocument createPdfDocument() {
        return (PdfDocument) pdfPrototype.clone();
    }

    public TextDocument createTextDocument() {
        return (TextDocument) textDocumentPrototype.clone();
    }

    public SpreadsheetDocument createSpreadsheetDocument() {
        return (SpreadsheetDocument) spreadsheetPrototype.clone();
    }
}