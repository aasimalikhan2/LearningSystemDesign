package factoryDesignPattern.documentAssignmentChatGPT;

public class TextDocumentFactory implements DocumentFactory{
    @Override
    public Document getDocument(String shapeType) {
        if(shapeType.equalsIgnoreCase("TEXT")) {
            return new TextDocument();
        }
        return null;
    }
}
