import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class Menu {
    void startGame() throws IOException {
        boolean startGame=true;
        Scanner input=new Scanner(System.in);
        String getChoice;
        while(startGame){
            System.out.println("1-Начать игру");
            System.out.println("2-Завершить игру");
            getChoice=input.next();
            if(Objects.equals(getChoice, "1")){
                Game.startGame();
            }
            else if(Objects.equals(getChoice, "2")){
                startGame=false;
            }
            else {
                System.out.println("Неверный ввод");
            }
        }
    }
}
