import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {
        
        Shape s = null;
        ArrayList<Shape> ShapeList= new ArrayList();
        Circle circle = new Circle();
        try {
            ShapeList.add(circle);
        }
         catch (Exception e) {
        System.out.println("An error occured while adding Circle to ShapeList");
        }
        Triangle triangle = new Triangle();
        try {
            ShapeList.add(triangle);
        }
        catch (Exception e) {
            System.out.println("An error occured while adding Trinalge to ShapeList" + "\n");
        }
        s.draw(ShapeList);

        System.out.println();
        circle.noOfSides();
        circle.hasEdges();
        triangle.noOfSides();
        triangle.hasEdges();
        

        System.out.println("Total number of shapes: " + Shape.numOfObjects + "\n");

        System.out.println("Deleting Triangle");
        Erase Eraser= new Erase();
        try {
            ShapeList.remove(triangle);
        }
        catch (Exception e) {
            System.out.println("An error occured while removing Trinalge from ShapeList" + "\n");
        }

        System.out.println("Total number of shapes: " + Shape.numOfObjects + "\n");

        Animator animate = new Animator();
        animate.Animator();

        System.out.println();
        Player player=new Player(19,"Haad","Pakistan");
        Player.Teenager teen = new Player.Teenager( "Lahore Kalandar");


    

    }



}