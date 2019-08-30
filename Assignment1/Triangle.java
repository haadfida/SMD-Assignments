public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("This is a Triangle.");
        Shape.numOfObjects = Shape.numOfObjects + 1;
    }

    @Override
    public void hasEdges() {
        System.out.println("This is a Triangle.");
    }
}
