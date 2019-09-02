public class Circle extends Shape{
    @Override
    public void draw() {
        try
        {
            System.out.println("This is a Circle.");
            Shape.numOfObjects = Shape.numOfObjects + 1;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());            
        }
    }

    @Override
    public void hasEdges() {
        try {
        System.out.println("This is a Circle. It has no edges.");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());            
        }

    }
}
