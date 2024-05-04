package abstractFactoryDesignPattern.guiFactoryAssignmentChatGPT;

public class MacGUIFactory implements GUIFactory{
    @Override
    public Button getButton() {
        return new MacButton();
    }

    @Override
    public TextField getTextField(String type) {
        return new MacTextField(type);
    }
}
