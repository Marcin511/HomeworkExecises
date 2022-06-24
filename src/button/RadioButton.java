package button;

public class RadioButton extends Button{
    public RadioButton(ButtonType buttontype, ButtonType RED) {
        super(buttontype);
        this.RED = RED;
    }
    private ButtonType RED;

}
