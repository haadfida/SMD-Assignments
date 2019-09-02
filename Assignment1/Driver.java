import java.util.ArrayList;

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

        System.out.println();
        System.out.println("Total number of shapes: " + Shape.numOfObjects);

        System.out.println();
        System.out.println("Deleting Triangle");
        Erase Eraser= new Erase();
        ShapeList.remove(triangle);
        System.out.println("Total number of shapes: " + Shape.numOfObjects);

        Player player=new Player(19,"Haad","Pakistan");
        Player.Teenager teen = new Player.Teenager(player, "Lahore Kalandar");




    }



}