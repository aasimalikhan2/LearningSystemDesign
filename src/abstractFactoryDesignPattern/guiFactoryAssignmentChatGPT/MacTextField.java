package abstractFactoryDesignPattern.guiFactoryAssignmentChatGPT;

public class MacTextField implements TextField{
    public String type;
    public MacTextField(String type)
    {
        this.type = type;
    }
    @Override
    public void onChange() {
        System.out.println("Mac Text Field content changed");
    }
}
