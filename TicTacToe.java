import java.util.Scanner;
import java.util.Random;
public class TicTacToe{
	public static void main(String[] args){
		//создаем двумерный массив для отрисовки доски
		char [][] gameBoard = {{' ', '|', ' ', '|', ' '},
		{'-', '+', '-', '+', '-'},
		{' ', '|', ' ', '|', ' '},
		{'-', '+', '-', '+', '-'},
		{' ', '|', ' ', '|', ' '}
		};
		printGameBoard(gameBoard);
		//даем возможность игроку ввести цифры 1-9, чтобы сделать ход
		
		System.out.println("Enter your placement (1-0)");
		while(true){
			Scanner input = new Scanner(System.in);
			int playerPos = input.nextInt();
			placePiece(gameBoard, playerPos, "player");
			Random rand = new Random();
			int cpuPos = rand.nextInt(9) + 1;
			placePiece(gameBoard, cpuPos, "cpu");
			printGameBoard(gameBoard);
		}
		
	}
	
	public static void printGameBoard(char [][] gameBoard){
		for(char [] row: gameBoard){
			for(char c: row){
				System.out.print(c);
			}
			System.out.println();
		}
	}
	public static void placePiece(char [][] gameBoard, int pos, String user){
		char symbol = ' ';
		if(user.equals("player")){
			symbol = 'X';
		}else if(user.equals("cpu")){
			symbol = '0';
			
		}
		switch(pos){
			case 1:
				gameBoard[0][0] = symbol;
				break;
			case 2:
				gameBoard[0][2] = symbol;
				break;
			case 3:
				gameBoard[0][4] = symbol;
				break;
			case 4:
				gameBoard[2][0] = symbol;
				break;
			case 5:
				gameBoard[2][2] = symbol;
				break;
			case 6:
				gameBoard[2][4] = symbol;
				break;
			case 7:
				gameBoard[4][0] = symbol;
				break;
			case 8:
				gameBoard[4][2] = symbol;
				break;
			case 9:
				gameBoard[4][4] = symbol;
				break;
			default:
				break;
		}
	}
	public static String checkWinner(){
		return "";
	}
}








