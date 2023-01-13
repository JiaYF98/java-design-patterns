package exercise2;

public class Client {
    public static void main(String[] args) {
        Shape shape = null;
        try {
            shape = ShapeFactory.getShape("a");
            shape.draw();
            shape.erase();
        } catch (UnsupportedShapeException e) {
            System.out.println("创建失败，原因:" + e.getMessage());
        }
    }
}
