package lecture1.dependencyInversion.goodCode;

import lecture1.dependencyInversion.badCode.WiredKeyboard;
import lecture1.dependencyInversion.badCode.WiredMouse;

public class Macbook {
    private final Keyboard keyboard;
    private final Mouse mouse;

    public Macbook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}
