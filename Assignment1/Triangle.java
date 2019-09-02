public class Triangle extends Shape {
    @Override
    public void draw() {
        try{
        System.out.println("This is a Triangle.");
        Shape.numOfObjects = Shape.numOfObjects + 1;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());                        
        }
    }

    @Override
    public void hasEdges() {
        try{
            System.out.println("This is a Triangle. It has 3 edges.");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());                        
        }

    }
}
