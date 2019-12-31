import java.util.Scanner;

public class CommentingSolution
{
	// Goal: only print out things that are not commented from the input
	// also ignore all '#'
	// lines where everything is commented is just a blank line (as in part of the
	// solution)
	// examples (without the // on the far left)

//	I*/Y
//	E#VSGH
//	S*/DLU/*IP/*J
//	WN*/UN
//	ZY#W/*J/FIS
//	C#T#NS/*R/C#T
//	TLYL/*D#IK//E
//	V*/H//Z#DG#P*/MSZ*/QG/*I//R

	// yields:

//	I*/Y
//	EVSGH
//	S*/DLU
//	UN
//	ZYW
//
//
//	H

	// example 2

//	H
//	Q*/G#DR*/T
//	P*/WP/*H*/KHPK#AE/*X#QKEN/DP/E//N/*U/P/DKQM*/M
//	X*/I*/N
//	HFUV#HAP//F#M/I//ST#AI/T
//	CDDP/MK/A/*XA//V//U*/D/VQ

	// yields:

//	H
//	Q*/GDR*/T
//	P*/WPKHPKAEM
//	X*/I*/N
//	HFUVHAP
//	CDDP/MK/AD/VQ

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		boolean isBlockCommented = false;
//		boolean isCommented = false;
		String currentLine = input.nextLine();
//		boolean shouldMoveToNextLine = true;
		System.out.println("---------------------------------");
		System.out.println("---------------------------------");

		while (currentLine.equals("") == false)
		{
			for (int k = 0; k < 5; k++)
			{
				currentLine += " ";
			}
			currentLine.replaceAll("#", "");
			//System.out.println("2222" + currentLine + "222");
			for (int i = 0; i < currentLine.length() - 2; i++)
			{
				String currentLetters = currentLine.substring(i, i + 3);
				//System.out.println("++++++++++" + currentLetters);
				if(isBlockCommented == false)
				{
					if(currentLetters.contains("//"))
					{
						if(currentLetters.indexOf("//") == 1)
							System.out.print(currentLetters.replace("#", "").charAt(0));
						break;
					}

					if(currentLetters.contains("/*"))
					{
						if(currentLetters.indexOf("/*") == 1)
						{
							System.out.print(currentLetters.replace("#", "").trim().charAt(0));
						}
						isBlockCommented = true;
						continue;
					}
				}

				else
				{
					if(currentLetters.contains("*/") && currentLetters.contains("/*/") == false)
					{
						if(i > 0)
						{
							i += 2;
						} else
						{
							if(currentLetters.indexOf("*/") == 0)
								i += 1;
							else {
								i += 2;
							}
						}
						isBlockCommented = false;
						continue;
					}
				}

				if(isBlockCommented == false)
				{
					if(currentLetters.charAt(2) == '/' && currentLetters.charAt(1) != '*')
					{
						System.out.print(currentLetters.substring(0, 2).replace("#", "").trim());
						i += 1;
					} else
					{

						System.out.print(currentLetters.replace("#", "").trim());
						i += 2;

					}
				}

			}
			currentLine = input.nextLine();
			System.out.println();

		}

		input.close();

	}

}
