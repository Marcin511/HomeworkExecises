package decorator.decorator;

public class VerticalScrollableWindow extends DecoratorWindow {
    public VerticalScrollableWindow(Window window) {
        super(window);
    }

    @Override
    public void rendererWindow() {
        super.rendererWindow();
        System.out.println("Add vertical scroll! -> rendering");
    }
}