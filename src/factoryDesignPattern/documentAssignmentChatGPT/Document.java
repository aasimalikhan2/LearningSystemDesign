package factoryDesignPattern.documentAssignmentChatGPT;

public interface Document {
    public void open(String filepath);
    public void close();
    public void print();
}
