import java.io.StreamCorruptedException;
import java.util.Random;

public class perimGen
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Random rand = new Random();

		int xDim = rand.nextInt(30) + 36;
		int yDim = rand.nextInt(15) + 25;

//		System.out.println("yDim" + yDim);
//		System.out.println("xDim" + xDim);

		int currX = 0;
		int currY = 0;

		String[][] board = new String[yDim][xDim];

		for (int y = 0; y < board.length; y++)
		{
			for (int x = 0; x < board[0].length; x++)
			{
				board[y][x] = " ";
			}

		}
		board[currY][currX] = "#";
		boolean continueMovingDown = true;
		while (continueMovingDown)
		{

			int downwardMovement = rand.nextInt(5) + 2;
			for (int j = 0; j < downwardMovement; j++)
			{
				if(currY + 1 < board.length)
				{
					currY += 1;
					board[currY][currX] = "#";
				} else
				{
					continueMovingDown = false;
					break;
				}
			}

			int outwardMovement = rand.nextInt(board[0].length / 3) + 1;
			for (int j = 0; j < outwardMovement; j++)
			{
				if(currX + 1 < board[0].length)
				{
					currX += 1;
					board[currY][currX] = "#";
				} else
				{
					break;
				}
			}
			int sideFenceHeight = rand.nextInt(4) + 2;
			for (int i = 0; i < sideFenceHeight; i++)
			{
				if(currY + 1 < board.length)
				{
					currY += 1;
					board[currY][currX] = "#";
				}
				if(currY == board.length - 2 || currY == board.length - 1)
					break;
			}
			if(currY == board.length - 2 || currY == board.length - 1)
				break;
			for (int j = 0; j < outwardMovement; j++)
			{
				if(currX - 1 >= 0)
				{
					currX -= 1;
					board[currY][currX] = "#";
				} else
				{
					break;
				}
			}
		}

		while (currX + 1 < board[0].length/* - board[0].length / 4 */)
		{
			currX++;
			board[currY][currX] = "#";
		}

		boolean continueMovingUp = true;
		while (continueMovingUp)
		{

			int upwardMovement = rand.nextInt(5) + 2;
			for (int j = 0; j < upwardMovement; j++)
			{
				if(currY - 1 >= 0)
				{
					currY -= 1;
					board[currY][currX] = "#";
				} else
				{
					continueMovingUp = false;
					break;
				}
			}
			if(currY == 0)
				break;

			int outwardMovement = rand.nextInt(board[0].length / 3) - 1;
			for (int j = 0; j < outwardMovement; j++)
			{
				if(board[currY][currX - 3].equals("#") == false)
				{
					currX -= 1;
					board[currY][currX] = "#";
				} else
				{
					break;
				}
			}
			int sideFenceHeight = rand.nextInt(4) + 2;
			for (int i = 0; i < sideFenceHeight; i++)
			{
				if(currY - 1 >= 0)
				{
					currY -= 1;
					board[currY][currX] = "#";
				}
				if(currY == 1)
				{
					currY -= 1;
					board[currY][currX] = "#";

					break;
				}
			}
			if(currY == 0)
				break;

			for (int j = 0; j < outwardMovement; j++)
			{
				if(currX + 1 < board[0].length)
				{
					currX += 1;
					board[currY][currX] = "#";
				} else
				{
					break;
				}
			}
		}
		while (currX > 0)
		{
			currX--;
			board[currY][currX] = "#";
		}

//place in holes

		int holeX = 0;
		int holeY = 0;
		for (int y = 3; y < board.length; y += 8)
		{
			holeX = rand.nextInt(4) + 3;
			holeY = rand.nextInt(4) + 3;
			if(y + holeY >= board.length - 2)
			{
				continue;
			}
			for (int i = 0; i < holeY; i++)
			{
				for (int j = 0; j < holeX; j++)
				{
					if(i + y < yDim && y + holeY - 1 < yDim && j + board[0].length / 2 < xDim)
					{
						if(i == 0 || j == 0 || i == holeY - 1 || j == holeX - 1)
						{
							board[i + y][j + board[0].length / 2] = "#";
						} else
						{

							board[i + y][j + board[0].length / 2] = " ";
						}
					}
				}

			}

		}

		for (int i = 0; i < board.length; i++)
		{
			int x = 0;
			while (x < board[i].length && board[i][x].equals("#") == false)
			{
				board[i][x] = " ";
				x++;
			}
		}

		for (int i = 0; i < board.length; i++)
		{
			int x = board[0].length - 1;
			while (x > 0 && board[i][x].equals("#") == false)
			{
				board[i][x] = " ";
				x--;
			}
		}

		for (int y = 0; y < board.length; y++)
		{
			for (int x = 0; x < board[0].length; x++)
			{
				System.out.print(board[y][x]);
			}
			System.out.println();
		}

	}

}
