package lecture1.dependencyInversion.badCode;

public class WiredMouse {
    public int mouseWireLength;
    public String mouseCompany;

    public WiredMouse(int mouseWireLength, String mouseCompany) {
        this.mouseWireLength = mouseWireLength;
        this.mouseCompany = mouseCompany;
    }

    public void scroll()
    {
        //scrolling
    }
}
