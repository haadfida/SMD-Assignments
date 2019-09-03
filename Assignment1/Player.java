public class Player {
    static int age;
    static String planet = "Earth";
    static String name;
    static String nationality;
    boolean retired = false;


    Player(int age, String name, String nationality){
        Player.age =age;
        Player.name =name;
        Player.nationality =nationality;
    }

    public static void showPlanet(){
        System.out.println("This player curently resides in Earth");

    }

    public static void showName(){
        System.out.println("This player name is " + name);
    }

    public static void showNationality(){
        System.out.println("This player name is " + nationality);
    }

    public void isRetired(boolean retired){

        this.retired = retired;
    }



    public static class Teenager{
        String club;

        private void showClub(){
            System.out.println("The player belongs to " + club);
        }
        Teenager(Player player, String club)
        {
            try
            {
                player.showPlanet();
                player.showName();
                player.showNationality();
                this.club = club;
                this.showClub();
            }
            catch(Exception e)
            {
                System.out.println("Something went wrong.");
            }
        }
    }
}
