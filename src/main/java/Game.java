import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Game {
    public  static void startGame() throws IOException {
    boolean theGameContinues=true;
        Gallows gallows = new Gallows();
        List<String>AllSelectedLetters=new ArrayList<>();
        int stageOfGame = 0;
        System.out.println(gallows.getGallow(stageOfGame));
        String theHiddenWord = (new FileReader()).getWordFromFile();
        RenderWord(AllSelectedLetters, theHiddenWord);
        while(theGameContinues){
            String inputLetter=inputLetter(AllSelectedLetters);
            AllSelectedLetters.add(inputLetter);
            if(theHiddenWord.contains(inputLetter)){
                System.out.println("Есть такая буква!");
                RenderWord(AllSelectedLetters, theHiddenWord);
            }
            else{
                stageOfGame++;
                System.out.println(gallows.getGallow(stageOfGame));
            }
            theGameContinues=isGameContinuing(stageOfGame, AllSelectedLetters, theHiddenWord);
        }
    }
private static void RenderWord(List<String>letters, String word){
        char[] charArrayOfWord=word.toCharArray();
    System.out.print("[ ");
    for (int i=0; i<word.length(); i++){
        char letter=charArrayOfWord[i];
        if(letters.contains(Character.toString(letter))){
            System.out.print(Character.toString(letter)+" ");
        }
        else System.out.print("X ");
    }
    System.out.println("]");
}
private static boolean isThereALetterInTheWord(String word, String letter){
        if(word.contains(letter.toLowerCase())){
            return true;
        }
        else{
            return false;
        }
    }
    private static String inputLetter(List<String>letters){
        System.out.println("Введите букву");
        String theEnteredLetter;
        Scanner input =new Scanner(System.in);
        while(true){
            theEnteredLetter=input.next().toLowerCase();
            if(letters.contains(theEnteredLetter)){
                System.out.println("Ты вводил эту букву! Повтори попытку.");
                continue;
            }
            else if(theEnteredLetter.length()!=1){
                System.out.println("Это не буква! Повтори попытку.");
                continue;
            }
            else if(!Character.isLetter(theEnteredLetter.charAt(0))){
                System.out.println("Это не буква, а другой символ! Повтори попытку.");
                continue;
            }
            else {break;}
        }
        return theEnteredLetter;
    }
    private  static boolean isGameContinuing(int stageOfGame, List<String> AllSelectedLetters, String word){

        if(stageOfGame==6){
            System.out.println("Ты проиграл:( Хочешь начать заново?");
            return false;
        }
        else{
            boolean AreAllTheLettersGuessed=true;
            char[] charArrayOfWord=word.toCharArray();
            for (int i=0; i<word.length(); i++){
                char letter=charArrayOfWord[i];
                if(!AllSelectedLetters.contains(Character.toString(letter))){
                    AreAllTheLettersGuessed=false;
                    break;
                }
        }
            if(!AreAllTheLettersGuessed){
                return true;
            }
    }
        System.out.println("Ты победил!!! Хочешь начать заново?");
        return false;
}

}
