public class Driver {

    public static void main(String[] args) {
        ArrayList<Shape> ShapeList= new ArrayList();
        Circle circle = new Circle();
        circle.draw();
        circle.hasEdges();
        try {
            ShapeList.add(circle);
        }
         catch (Exception e) {
        System.out.println("An error occured while adding Circle to ShapeList");
        }
        Triangle triangle = new Triangle();
        triangle.draw();
        triangle.hasEdges();
        try {
            ShapeList.add(triangle);
        }
        catch (Exception e) {
            System.out.println("An error occured while adding Trinalge to ShapeList");
        }

    }

}