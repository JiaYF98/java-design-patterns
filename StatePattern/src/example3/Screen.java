package example3;

public class Screen {
    private ScreenState currentState, normalState, largerState, largestState;

    public Screen() {
        this.normalState = new NormalState();
        this.largerState = new LargerState();
        this.largestState = new LargestState();
        this.currentState = normalState;
        currentState.display();
    }

    public void setState(ScreenState state) {
        this.currentState = state;
    }

    public void onClick() {
        if (this.currentState == normalState) {
            this.setState(largerState);
            this.currentState.display();
        } else if (this.currentState == largerState){
            this.setState(largestState);
            this.currentState.display();
        } else if (this.currentState == largestState) {
            this.setState(normalState);
            this.currentState.display();
        }
    }
}
