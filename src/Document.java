public interface Document extends Cloneable {
    public Document clone();
    public void open();
    public String getType();
}