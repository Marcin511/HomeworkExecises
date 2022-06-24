package button;

public class ButtonChoice implements ButtonFactory{
    @Override
    public Button createButton(ButtonType type) {
        Button button = null;
        switch (type) {
            case RED:
                button = new RadioButton();
                break;
            case BLACK:
                button =  new SubmitButton();
                break;
            case BLUE:
                button = new CheckBoxButton();
        }
        return button;
    }
}
