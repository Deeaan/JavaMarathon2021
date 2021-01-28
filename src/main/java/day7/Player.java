package day7;


public class Player {

    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    private static int countPlayers;


    public Player(int stamina) {
        this.stamina = stamina;
        if(countPlayers >= 0 && countPlayers < 6){
            countPlayers++;
        }
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int getStamina() {
        return stamina;
    }


    public void run() {

        if (stamina > 0) {
            stamina--;

            if (stamina == 0)
                countPlayers--;
        }
    }

    public static void info() {

        if(countPlayers < 6){
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        }else{
            System.out.println("На поле нет свободных мест");
        }
    }
}
