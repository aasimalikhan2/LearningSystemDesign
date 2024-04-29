package lecture1.dependencyInversion.badCode;

public class WiredKeyboard {
    public int keyboardWireLength;
    public String keyboardCompany;
    public WiredKeyboard(int keyboardWireLength, String keyboardCompany)
    {
        this.keyboardWireLength = keyboardWireLength;
        this.keyboardCompany = keyboardCompany;
    }
    public void type(){
        //typing
    }
}
