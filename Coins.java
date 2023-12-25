public class Coins {
    public static void main(String[] args) {
    int coins =Integer.parseInt (args[0]) ; 
    System.out.println("java coins : " + coins) ;
    int quarters = coins/25 ;
    int cent =(coins - (quarters*25)) ; 
    System.out.println("Use " + quarters + " quarters and " + cent + " cent");
}

}