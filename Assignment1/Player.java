public class Player {
    static int age;
    static String name;
    String nationality;
    int[] pointsEarnedEachTime = {12,13,14};

    public static void showAge(){
        System.out.println("The age of " + name + " is " + age);

    }

    public static void showName(){
        System.out.println("The name of the Person is" + name);
    }

    public static class Teenager{
        String club;
        Player test;
        Teenager()
        {
            try
            {
                test.showName();
                test.showAge();
                System.out.println(test.pointsEarnedEachTime[10]);
            }
            catch(Exception e)
            {
                System.out.println("Something went wrong.");
            }
        }
    }
}
