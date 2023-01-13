package example;

public class Button extends Component {
    public Button(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void update(String name) {
        //按钮不产生相应
    }
}
