package decorator.decorator;

public class BaseWindow implements Window {
    @Override
    public void rendererWindow() {
        System.out.println("Base windows rendering");
    }
}