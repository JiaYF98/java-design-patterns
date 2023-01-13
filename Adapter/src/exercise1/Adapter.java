package exercise1;

public class Adapter implements Cat, Dog {
    private Cat cat;
    private Dog dog;

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void catchMouse() {
        cat.catchMouse();
    }

    @Override
    public void cry() {
        dog.cry();
    }
}
