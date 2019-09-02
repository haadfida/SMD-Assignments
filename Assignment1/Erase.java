public final class Erase {
    private final String eraserMessage = " shape has been deleted";
    Erase()
    {
        try{
            System.out.println("Eraser called");
            System.out.println(eraserMessage);
            Shape.numOfObjects = Shape.numOfObjects - 1;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("All exceptions(if any) in Erase class are handled.");
        }
    }
}
