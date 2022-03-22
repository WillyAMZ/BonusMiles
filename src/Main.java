public class Main {
    public static void main(String[] args) {
        // входные данные
        int ticketPrice = 50_000;
        int bonusLevel = 20;

        //логика программы
        int bonus = (ticketPrice / bonusLevel);
        System.out.println("Количество бонусных миль составляет:" +bonus);
    }
}
