public class Main {
    public static void main(String[] args) {

        int ticketPrice = 12220;
        int milesPerRub = 20;

        int bonus = ticketPrice / milesPerRub;

        System.out.println("Количество бонусных миль: " + bonus);
    }
}