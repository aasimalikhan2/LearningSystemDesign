package lecture1.dependencyInversion.badCode;

public class Macbook {
    private final WiredKeyboard keyboard;
    private final WiredMouse mouse;

    public Macbook(WiredKeyboard keyboard, WiredMouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}
