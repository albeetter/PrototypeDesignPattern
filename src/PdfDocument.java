public class PdfDocument implements Document {
    private String fileName;
    private String author;
    private int pageCount;
    private String name;

    public PdfDocument(String fileName, String author, int pageCount, String name) {
        this.fileName = fileName;
        this.author = author;
        this.pageCount = pageCount;
        this.name = name;
    }

    public String getFileName() { 
        return fileName; 
    }
    public void setFileName(String fileName) { 
        this.fileName = fileName; 
    }
    public String getAuthor() { 
        return author; 
    }
    public int getPageCount() { 
        return pageCount; 
    }
    public void setPageCount(int pageCount) { 
        this.pageCount = pageCount; 
    }

    @Override
    public Document clone() {
        try {
            return (Document) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public void open() {
        System.out.println("Opening PDF Document: " + fileName + " by " + author + " (" + pageCount + " pages)");
    }

    @Override
    public String getType() {
        return "PDF";
    }
}