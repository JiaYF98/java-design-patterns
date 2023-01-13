package exercise1;

public class Client {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.setDog(new ConcreteDog());
        adapter.setCat(new ConcreteCat());
        ((Dog) adapter).catchMouse();
        ((Cat) adapter).cry();
    }
}
