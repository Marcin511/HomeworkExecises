package button;

public class CheckBoxButton extends Button{
    public CheckBoxButton(ButtonType buttontype, ButtonType BLUE) {
        super(buttontype);
        this.BLUE = BLUE;
    }

    private ButtonType BLUE;
}
