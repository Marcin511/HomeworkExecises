package decorator.decorator;

public class ResaizableWindow extends DecoratorWindow {
    public ResaizableWindow(Window window) {
        super(window);
    }

    @Override
    public void rendererWindow() {
        super.rendererWindow();
        System.out.println("Resaizable window! -> resize window!");
    }
}
