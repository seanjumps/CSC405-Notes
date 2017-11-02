import java.util.Arrays;
import java.util.Scanner;


public class TTT
{
	static final int X = 1;
	static final int O = -1;
	static final int EMPTY = 0;
	
	public static void main(String[]args)
	{
		//size of the board
		int size = 3;
		int turn = 1;
		boolean gameOver = false;
		boolean playAgain = true;
		int[] board = new int[size * size];
		Scanner scan = new Scanner(System.in);
		
		//while(playAgain)
		//{
			while (!gameOver)
			{
				printBoard(board);
				//X makes move
				int index = -1;
				//while(move is not legal)
				//{
					//index = scan.nextInt();
				//}
				board[index] = X;
				//check for win/game over
				//O makes move
				//check for win/game over
			}
		//}
	}
	
	static void printBoard(int[] b)
	{
		System.out.println(Arrays.toString(b));
	}
	
	/*
	 * 1 means X wins
	 * -1 means O wins
	 * 0 means game not over
	 * 2 means cat's game
	 */
	static int gameStatus(int[] b)
	{
		int size = (int)(Math.sqrt(b.length));
		//check horizontals
		//check verticals
		//check diagonals
		return 0;
	}
}
