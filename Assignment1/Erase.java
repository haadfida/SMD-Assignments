public final class Erase {
    private final String eraserMessage = "has been deleted";
    Erase()
    {
        try{
            System.out.println(eraserMessage);
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
