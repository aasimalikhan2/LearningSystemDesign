package abstractFactoryDesignPattern.guiFactoryAssignmentChatGPT;

public class MacButton implements Button{
    @Override
    public void onClick() {
        System.out.println("Mac button clicked");
    }

    @Override
    public void onDoubleClick() {
        System.out.println("Mac button double clicked");
    }

    @Override
    public void onHover() {
        System.out.println("Mac button hovered");
    }
}
