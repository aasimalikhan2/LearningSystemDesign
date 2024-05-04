package abstractFactoryDesignPattern.guiFactoryAssignmentChatGPT;

public class WindowsTextField implements TextField{
    public String type;
    public WindowsTextField(String type)
    {
        this.type = type;
    }
    @Override
    public void onChange() {
        System.out.println("Windows Text Field content changed");
    }
}
