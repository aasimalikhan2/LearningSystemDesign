package abstractFactoryDesignPattern.guiFactoryAssignmentChatGPT;

public class WindowsButton implements Button{
    @Override
    public void onClick() {
        System.out.println("Windows button clicked");
    }

    @Override
    public void onDoubleClick() {
        System.out.println("Windows button double clicked");
    }

    @Override
    public void onHover() {
        System.out.println("Windows button hovered");
    }
}
