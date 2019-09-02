import java.util.*;

public class Animator implements TreeAnimator, BirdAnimator ,SkyAnimator {
    public void Animator()
    {
        try
        {
            System.out.println("Tree, Bird and Sky Animator functions called.");
            this.animateTrees();
            this.animateBirds();
            this.animateSky();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("All exceptions(if any) in Animator class are handled.");
        }

    }   

    @Override
    public void animateTrees() {
        try
        {
            List<String> Trees = new ArrayList<String>();
            Trees.add("Mango tree");
            Trees.add("Amrood tree");

            System.out.println("There are "+Trees.size()+" trees in this animation "
                    + "and those trees are " + Trees);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("All exceptions(if any) in TreeAnimator class are handled.");
        }

    }

    @Override
    public void animateBirds() {
        try{
            List<String> Birds = new ArrayList<String>();
            Birds.add("Chiria");
            Birds.add("Kawwa");

            System.out.println("There are "+Birds.size()+" birds in this animation "
                    + "and those birds are " + Birds);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("All exceptions(if any) in BirdAnimator class are handled.");
        }

    }

    @Override
    public void animateSky() {
        try{
            List<String> Sky = new ArrayList<String>();
            Sky.add("Neela Asmaan");
            Sky.add("Kaala Asmaan");

            System.out.println("There are "+Sky.size()+" colors of sky in this animation "
                    + "and those colors are "+ Sky);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("All exceptions(if any) in SkyAnimator class are handled.");
        }

    }
}