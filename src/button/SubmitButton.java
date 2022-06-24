package button;

public class SubmitButton extends Button{
    public SubmitButton(ButtonType buttontype,ButtonType BLACK) {
        super(buttontype);
        this.BLACK = BLACK;
    }
    private ButtonType BLACK;
}
