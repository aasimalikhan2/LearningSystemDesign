package abstractFactoryDesignPattern.guiFactoryAssignmentChatGPT;

public class guiFactoryAssignmentChatGPT {
    public static void main(String[] args) {
        GUIFactory macGUIFactory = new MacGUIFactory();
        GUIFactory windowsGUIFactory = new WindowsGUIFactory();

        Button macButton = macGUIFactory.getButton();
        TextField macTextField = macGUIFactory.getTextField("password");

        macButton.onClick();
    }
}
