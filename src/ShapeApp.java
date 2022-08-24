public class ShapeApp {
    public static void main(String[] args) {
        var shape = new Shape();
        System.out.println(shape.getCorner());

        var rectangle1 = new Rectangle();
        System.out.println(rectangle1.getCorner());
        System.out.println(rectangle1.getParentCorner());
    }
}
