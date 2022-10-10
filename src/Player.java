import java.util.Scanner;

public class Player {
   Object player;
   String namePlayer;

    public Player(Object player, String namePlayer) {
        this.player = player;
        this.namePlayer = namePlayer;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public final void createName(String namePlayer){
        Scanner scanner = new Scanner(System.in);
        namePlayer = scanner.nextLine();
        setNamePlayer(namePlayer);
    }
}
