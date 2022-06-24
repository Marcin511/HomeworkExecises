package decorator.decorator;

public class GuiDriver {

    public static void main(String[] args) {
        Window window = new BaseWindow();
        Window horizontallyScrollableWindow = new HorizontalScrollableWindow(window);
        Window verticallyScrollableWindow = new VerticalScrollableWindow(window);
        Window horizontallyAndVerticallyScrollableWindow = new VerticalScrollableWindow(horizontallyScrollableWindow);
        Window resaizableWindow = new ResaizableWindow(window);
        Window resaizableAndHorizontallyAndVerticallyScrollableWindow = new ResaizableWindow(horizontallyAndVerticallyScrollableWindow);
        System.out.println("Base window: ");
        window.rendererWindow();

        System.out.println("Horizontally scrollable window: ");
        horizontallyScrollableWindow.rendererWindow();

        System.out.println("Vertically scrollable window: ");
        verticallyScrollableWindow.rendererWindow();

        System.out.println("Horizontally and Vertically scrollable window: ");
        horizontallyAndVerticallyScrollableWindow.rendererWindow();

        System.out.println("Resaizable window: ");
        resaizableWindow.rendererWindow();

        System.out.println("Resaizable and Horizontally and Vertically scrollable window: ");
        resaizableAndHorizontallyAndVerticallyScrollableWindow.rendererWindow();
    }
}
