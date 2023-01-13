package example;

public abstract class Component {
    protected Mediator mediator;

    public Component(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void changed(String name) {
        mediator.componentChanged(this, name);
    }

    public abstract void update(String name);
}
