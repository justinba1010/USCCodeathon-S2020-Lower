import java.util.Scanner;

public class PerimeterSolution
{

	// walls are always at least 2 units long

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner inputScanner = new Scanner(System.in);
//		System.out.println();

		int totalArea = 0;
		int fakeTotal = 0;
		int lineTotal = 0;
		String fillCharacter = " ";

		while (inputScanner.hasNextLine())
		{
			boolean isInOpen = false;
			lineTotal = 0;
			String currentLine = inputScanner.nextLine();

			if(inputScanner.hasNextLine() == false)
				break;
			currentLine = currentLine.trim();
			if(currentLine.length() < 2)
				break;
			for (int i = 0; i < currentLine.length() - 1; i++)
			{
				if(currentLine.substring(i, i + 1).equals("#"))
				{

				}
				if(isInOpen && currentLine.substring(i, i + 1).equals(fillCharacter))
				{
					lineTotal += 1;
				}
				if(currentLine.substring(i, i + 1).equals("#")
						&& currentLine.substring(i + 1, i + 2).equals("#") == false)
				{
					isInOpen = !isInOpen;
					continue;
				}
				if(currentLine.substring(i, i + 1).equals("#") == false
						&& currentLine.substring(i + 1, i + 2).equals("#"))
				{
					i += 1;
					isInOpen = !isInOpen;
				}

//				if(isInOpen == false)
//					i += 1;

			}
			totalArea += lineTotal;

//			System.out.println(currentLine + " " + lineTotal);

		}
		System.out.println(totalArea);

	}

}
