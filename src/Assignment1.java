import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		boolean start = true;
		while (start) {
		System.out.println ("Player 1 will be X, Player 2 will be O.");
		char pos = 'X';
		char pos2 = 'O';

		System.out.println ("Please insert the length of the board you want.");
		Scanner n = new Scanner (System.in);
		int number = n.nextInt();
		{
			int [] board = new int [number * number];
			int i=0;
			while (i < number * number)
			{
				i = i+ 1;
				System.out.print(i + " ");
				if (i % number == number-1)
				{
					i = i + 1;
					System.out.println(i);	
				}
			}
		}
		System.out.println("This is an empty array.");
		char[] board = new char [number*number];
		for (int i=0; i<number*number; i++) {
		board[i]	 = '_' ;
		}
		
		int _i = 0;
		while (_i <number * number)
		{
			System.out.print(board[_i]+ " ");
			if (_i% number == number -1)
			{
				System.out.println();
			}
			_i= _i + 1;
		}

		// game loop
		char winner;
		while (true) {

			System.out.println("Player 1, type any digits on the board to choose your location and start the game.");
			Scanner move = new Scanner (System.in);
			int po = move.nextInt();
			_i = 0;
			board[po-1]=pos;
			while(_i < number * number) 
			{
				System.out.print(board[_i]+ " ");
				if (_i% number == number -1)
				{
					System.out.println();
				}
				_i= _i + 1;
			}
			winner=checkWinner(board,number);
			if (winner  != 0) break;

			System.out.println("Player 2, type any digits on any empty space on the board that is not taken.");
			Scanner move2 = new Scanner (System.in);
			int po2 = move2.nextInt(); 
			board[po2-1]=pos2;
			_i = 0;
			while(_i < number * number) 
			{
				System.out.print(board[_i]+ " ");
				if (_i% number == number -1)
				{
					System.out.println();
				}
				_i= _i + 1; 

			} 
			
			if ((winner = checkWinner(board, number)) != 0) break;
		}
		System.out.println("Player "+winner+" wins!"); 
		System.out.println("Do you want to restart? Yes/No?");
		Scanner play = new Scanner (System.in);
		String restart = play.next(); {
		if (restart.equals("No")) {
		System.out.println("Game over") ;
		start = false;
		 }
		if (restart.equals("Yes")){
		System.out.println("Game restarts!");
		start = true;
		}
		}
		}
	}
		
	
	public static char checkWinner(char[] board, int number) {

		//checks horizontal lines for a winner
		for (int i = 0; i < board.length; i = i + number) {

			boolean win = true;

			for(int x = i; x < i+ number; x++) {
				if (board[x] != board[i] || board[x] == '_') {
					win = false;
				}	
			}
			if (win) return board[i];
		}

		//checks vertical lines for a winner
		for (int x = 0; x < number; x++) {
			boolean win = true;
			int first = x;
			for (int y = 0; y < number; y++) {
				int i = number*y+x;
				if (board[i] != board[first] || board[i] == '_') win = false;
			}
			if (win) return board[first];
		}
		//check diagonal from right to left
		boolean win = true;
		for (int i = number-1; i < board.length-1 ; i = i+number-1) {
			if ((board[number-1] != board[i]) || board[number-1] == '_') {
				win = false;
			}
			}
			if (win) return board[number-1];
			
		//check diagonal from left to right
		 win = true; 
		for (int i = 0 ; i < board.length ; i = i+number+1) {
			if ((board[0] != board[i]) || board[0] == '_') {
				win = false;
			}	
			}
			if (win) return board[0];
			boolean full = true; 
			for (int i=0; i<number*number; i++) {
			if (board[i]	 == '_') {
				full = false;
			}
			}
			if (full) System.out.println("It's a cat's game. Game end!"); 
		return 0;
	}
}
	

		









