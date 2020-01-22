import java.util.Scanner;

public class OddOrigami
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int boardDim = input.nextInt();
		int numInstructions = input.nextInt();
		int[][] board = new int[boardDim][boardDim];

		for (int i = 0; i < numInstructions; i++)
		{
			String command = input.next();
//			System.out.print(command);
			if(command.equals("h"))
			{
				horizontalSlice(board, input.nextInt());
			} else if(command.equals("v"))
			{
				verticalSlice(board, input.nextInt());
			} else if(command.equals("k"))
			{
				knightMove(board, input.nextInt(), input.nextInt());
			} else if(command.equals("dr"))
			{
				downRight(board, input.nextInt(), input.nextInt());
			} else if(command.equals("sd"))
			{
				shiftDown(board, input.nextInt());
			}

//			for (int y = 0; y < boardDim; y++)
//			{
//				for (int x = 0; x < boardDim; x++)
//				{
//					System.out.print(board[y][x]);
//				}
//				System.out.println();
//			}
//			System.out.println();
//			input.nextLine();
		}

		for (int i = 0; i < boardDim; i++)
		{
			for (int j = 0; j < boardDim; j++)
			{
				System.out.print(board[i][j]);
			}
			System.out.println();
		}

		input.close();

	}

	static void shiftDown(int[][] board, int amount)
	{
		int[][] temp = new int[board.length][board.length];

		for (int i = 0; i < board.length; i++)
		{
			for (int j = 0; j < board.length; j++)
			{
				temp[i][j] = board[i][j];

			}
		}
		
		for (int i = 0; i < board.length; i++)
		{
			board[(i + amount) % board.length] = temp[i];
		}
	}

	static void horizontalSlice(int[][] board, int y)
	{
		for (int i = 0; i < board.length; i++)
		{
			board[y][i] = 1;

		}
	}

	static void verticalSlice(int[][] board, int x)
	{
		for (int i = 0; i < board.length; i++)
		{
			board[i][x] = 1;

		}
	}

	static void downRight(int[][] board, int x, int y)
	{
		int counter = x;
		for (int d = y; d < board.length; d++)
		{
			if(counter < board.length)
			{
				board[d][counter] = 1;
			}
			counter++;

		}
	}

	static void knightMove(int[][] board, int x, int y)
	{
		// top
		if(y - 2 >= 0)
		{
			if(x - 1 >= 0)
			{
				board[y - 2][x - 1] = 1;
			}
			if(x + 1 < board.length)
			{
				board[y - 2][x + 1] = 1;
			}

		}
		// left
		if(x - 2 >= 0)
		{
			if(y - 1 >= 0)
			{
				board[y - 1][x - 2] = 1;
			}
			if(y + 1 < board.length)
			{
				board[y + 1][x - 2] = 1;
			}
		}

		// down
		if(y + 2 < board.length)
		{
			if(x - 1 >= 0)
			{
				board[y + 2][x - 1] = 1;
			}
			if(x + 1 < board.length)
			{
				board[y + 2][x + 1] = 1;
			}
		}

		// right
		if(x + 2 < board.length)
		{
			if(y - 1 >= 0)
			{
				board[y - 1][x + 2] = 1;
			}
			if(y + 1 < board.length)
			{
				board[y + 1][x + 2] = 1;
			}
		}
	}

}
