package factoryDesignPattern.documentAssignmentChatGPT;

public class CodeDocumentFactory implements DocumentFactory{
    @Override
    public Document getDocument(String shapeType) {
        if(shapeType.equals("CODE"))
        {
            return new CodeDocument();
        }
        return null;
    }
}
