import java.util.ArrayList;

public abstract class Shape {
    static int numOfObjects = 0;
    private String name;
    public abstract void hasEdges();
    public abstract void noOfSides();


    public static < E > void draw(ArrayList<E> elements) {
        for ( E element : elements){
            if(element instanceof Triangle){
                System.out.println("This is a Triangle.");
            }
            if(element instanceof Circle){
                System.out.println("This is a Circle.");
            }
        }
        System.out.println();
    }

    public void setName(String name){
        this.name = name;
    }

}
