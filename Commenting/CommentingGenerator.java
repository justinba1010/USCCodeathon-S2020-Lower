import java.util.Random;

public class CommentingGenerator
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Random rand = new Random();

		int blockCommentCount = rand.nextInt(20);

		for (int i = 0; i < blockCommentCount; i++)
		{
			int garbageCount = rand.nextInt(20);

			for (int j = 0; j < garbageCount; j++)
			{
				System.out.print((char) (rand.nextInt(26) + 65));
				int commentDecider = rand.nextInt(10);
				switch (commentDecider)
				{
				case 0:
					System.out.print("*/");
					break;
				case 1:
					System.out.print("//");
					break;
				case 2:
					System.out.println();
					break;
				case 3:
					System.out.print("/*");
					break;
				case 4:
					System.out.print("/");
					break;
				case 5:
					System.out.print("#");
					break;
				}

			}

		}

		/*
		 * 
		 */

	}

}
