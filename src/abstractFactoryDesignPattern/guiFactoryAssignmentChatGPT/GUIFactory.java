package abstractFactoryDesignPattern.guiFactoryAssignmentChatGPT;

public interface GUIFactory {
    public Button getButton();
    public TextField getTextField(String type);
}
