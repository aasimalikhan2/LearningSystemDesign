package abstractFactoryDesignPattern.guiFactoryAssignmentChatGPT;

public class WindowsGUIFactory implements GUIFactory{
    @Override
    public Button getButton() {
        return new WindowsButton();
    }

    @Override
    public TextField getTextField(String type) {
        return new WindowsTextField(type);
    }
}
