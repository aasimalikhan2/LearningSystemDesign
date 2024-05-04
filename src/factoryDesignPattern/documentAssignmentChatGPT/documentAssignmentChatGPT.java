package factoryDesignPattern.documentAssignmentChatGPT;

public class documentAssignmentChatGPT {
    public static void main(String[] args) {
        DocumentFactory codeDocumentFactory = new CodeDocumentFactory();
        DocumentFactory textDocumentFactory = new TextDocumentFactory();

        Document codeDocument = codeDocumentFactory.getDocument("CODE");
        codeDocument.open("./TextDocument.java");
        codeDocument.print();

        Document textDocument = textDocumentFactory.getDocument("TEXT");
        textDocument.open("./SampleFile.txt");
        textDocument.print();
    }
}
