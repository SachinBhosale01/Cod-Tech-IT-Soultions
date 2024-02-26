package Tic.Tac.Toe.Game;
import java.util.Scanner;


public class TicTacToe {
	private char[][] pos = new char[3][3];
	private char winner = ' ';
	private char player = 'X';
	private String name ;
	private String name1;
	private String name2;
	private int count;
	
	public TicTacToe(char[][] arr, String name1, String name2) {
		count =0;
		pos = arr;
		this.name1 = name1;
		this.name2 = name2;
	}
	
	public String board() {
		//System.out.println("");
		System.out.println("________________ _______________ _______________");
		System.out.println("\t\t|\t\t|");
		System.out.println("\t"+pos[0][0]+"\t|\t"+pos[0][1]+"\t|\t"+pos[0][2]+"\t");
		System.out.println("________________|_______________|_______________");
		System.out.println("\t\t|\t\t|");
		System.out.println("\t"+pos[1][0]+"\t|\t"+pos[1][1]+"\t|\t"+pos[1][2]+"\t");
		System.out.println("________________|_______________|_______________");
		System.out.println("\t\t|\t\t|");
		System.out.println("\t"+pos[2][0]+"\t|\t"+pos[2][1]+"\t|\t"+pos[2][2]+"\t");
		System.out.println("________________|_______________|_______________");
		return "currentboard";
	}
	
	public void playeGame() {
		
		int num,i,j;
		char blank=' ';
		System.out.println("\n "+name1+" will start the game ");
		do {
			Scanner sc = new Scanner(System.in);
			boolean posTaken = true;
			
			while(posTaken) {
				if(player=='X') {
					System.out.println("=>Player : "+getName1());
					System.out.println("Your identification symbol is 'X'. Please choose a Position#"  );
				}
				else if(player=='O') {
					System.out.println("=>Playe : "+getName2());
					System.out.println("Your identification symbol is 'O'. Please choose a Position#"  );
				}
				num = sc.nextInt();
				i=(int) (num/3.5);
				if(num == 1 || num == 4 || num == 7 ) {
					j = 0;
					posTaken = checkPosition(i,j);
					if(posTaken == false) {
						pos[i][j] = getPlayer();
					}
				} else if(num == 2 || num == 5 || num == 8 ) {
					j = 1;
					posTaken = checkPosition(i,j);
					if(posTaken == false) {
						pos[i][j] = getPlayer();
				 }
				} else if(num == 3 || num == 6 || num == 9 ) {
					j = 2;
					posTaken = checkPosition(i,j);
					if(posTaken == false) {
						pos[i][j] = getPlayer();
				 }
				}
			}
			System.out.println("Nice Move");
			count++;
			board();
			getNextPlayer();
		}while(checkWinner() == blank);
	}

	public String getNextPlayerName() {
		
		if(name == name1) {
			name = name2;
			return name;
		}else {
			name = name1;
			return name;
		}
	}

	public char getPlayer() {
		return player;
	}

	public char getNextPlayer() {
		if(player == 'X') {
			player = 'O';
			return player;
		}else {
			player ='X';
			return player;
		}
	}
	
	public boolean checkPosition(int i, int j) {
		if(pos[i][j] == 'X' || pos[i][j] == 'O') {
			System.out.println("This position is already filled. Choose another position");
			return true;
		}
		else {
			return false;
		}
	}
	
	public char checkWinner() {
		if(pos[0][0] == 'X' && pos[0][1] == 'X' && pos[0][2] == 'X') {
			winner = 'X'; 
		}else if(pos[0][0] == 'X' && pos[1][0] == 'X' && pos[2][0] == 'X') {
			winner = 'X'; 
		}else if(pos[0][0] == 'X' && pos[1][1] == 'X' && pos[2][2] == 'X') {
			winner = 'X'; 
		}else if(pos[0][1] == 'X' && pos[1][1] == 'X' && pos[2][1] == 'X') {
			winner = 'X'; 
		}else if(pos[0][2] == 'X' && pos[1][2] == 'X' && pos[2][2] == 'X') {
			winner = 'X'; 
		}else if(pos[0][2] == 'X' && pos[1][1] == 'X' && pos[2][0] == 'X') {
			winner = 'X'; 
		}else if(pos[1][0] == 'X' && pos[1][1] == 'X' && pos[1][2] == 'X') {
			winner = 'X'; 
		}else if(pos[2][0] == 'X' && pos[2][1] == 'X' && pos[2][2] == 'X') {
			winner = 'X'; 
		}
		
		if(winner == 'X') {
			System.err.println("\n=> Congratulations "+name1+" you won the Game......:-");
			return winner;
		}
		
		
		
		if(pos[0][0] == 'O' && pos[0][1] == 'O' && pos[0][2] == 'O') {
			winner = 'O'; 
		}else if(pos[0][0] == 'O' && pos[1][0] == 'O' && pos[2][0] == 'O') {
			winner = 'O'; 
		}else if(pos[0][0] == 'O' && pos[1][1] == 'O' && pos[2][2] == 'O') {
			winner = 'O'; 
		}else if(pos[0][1] == 'O' && pos[1][1] == 'O' && pos[2][1] == 'O') {
			winner = 'O'; 
		}else if(pos[0][2] == 'O' && pos[1][2] == 'O' && pos[2][2] == 'O') {
			winner = 'O'; 
		}else if(pos[0][2] == 'O' && pos[1][1] == 'O' && pos[2][0] == 'O') {
			winner = 'O'; 
		}else if(pos[1][0] == 'O' && pos[1][1] == 'O' && pos[1][2] == 'O') {
			winner = 'O'; 
		}else if(pos[2][0] == 'O' && pos[2][1] == 'O' && pos[2][2] == 'O') {
			winner = 'O'; 
		}
	
		if(winner == 'O') {
			System.err.println("\n=> Congratulations "+name2+" You won the Game......!");
			return winner;
		}
		for(int i=0 ;i<3; i++) {
			for(int j=0;j<3;j++) {
				if(pos[i][j] == 'X' || pos[i][j] == 'O') {
					if(count == 9) {
						char draw = 'D';
						System.err.println("\n=>Match has been Draw.........!");
						return draw;
					}
					continue;
				}else {
					break;
				}
			}
		}
		return winner;
	}
	
	public void setName(String n1, String n2) {
		name1= n1;
		name2 = n2;
	}
	public String getName1() {
		return name1;
	}
	public String getName2() {
		return name2;
	}


}
