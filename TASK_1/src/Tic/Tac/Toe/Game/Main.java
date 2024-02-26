package Tic.Tac.Toe.Game;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String ch;
		do {
			System.out.println("Welcome Tic Tac Toe Game!");
			System.out.print("Please Enter Player#1 Name: ");
			String name1 = scanner.next();
			
			System.out.print("Please Enter Player#2 Name: ");
			String name2 = scanner.next();
			
			char[][] arr = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
			
			TicTacToe t = new TicTacToe(arr, name1, name2);
			t.board();
			t.playeGame();
			System.out.println("\nWould you like to play again (Enter 'yes')?");
			ch = scanner.next().toLowerCase();
			System.out.println("You have entered '"+ch+ "'");
		}
		while(ch.equals("yes"));
		System.out.println("....................GAME OVER........................");
		scanner.close();

	}

}
