package exercise2;

public class ShapeFactory {
    public static Shape getShape(String type) throws UnsupportedShapeException {
        Shape shape = null;
        switch (type) {
            case "Circle":
                shape = new Circle();
                break;
            case "Rectangle":
                shape = new Rectangle();
                break;
            case "Triangle":
                shape = new Triangle();
                break;
        }
        if (shape != null) {
            return shape;
        } else {
            throw new UnsupportedShapeException("图形不支持！");
        }
    }
}
