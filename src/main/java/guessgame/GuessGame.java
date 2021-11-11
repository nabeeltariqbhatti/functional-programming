package guessgame;

public class GuessGame {
    Player player1 = new Player(12);
    Player player2 = new Player(23);

    Player player3 = new Player(34);

    public void startGame(){
        int number = 23;


         if (player1.guess() == number) System.out.println("guessed");
         else if (player2.guess() == number) System.out.println("guessed by number 2");
        else if (player3.guess() == number) {
            System.out.println("guessed by number 3");
        }else
        {  System.out.println("could not be guessed");
        }






    }
}
