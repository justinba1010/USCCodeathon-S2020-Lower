import java.util.Scanner;

public class GreedyStudentsSolution
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner inputScanner = new Scanner(System.in);
//        System.out.println();
		int numStudents = inputScanner.nextInt();
		int[] students = new int[numStudents];
		int[] scores = new int[numStudents];

		for (int i = 0; i < numStudents; i++)
		{
			students[i] = inputScanner.nextInt();
			// System.out.println(students[i]);
		}

		for (int i = 1; i < numStudents; i++)
		{
			if(students[i] > students[i - 1])
			{
				scores[i] = scores[i - 1] + 1;
			}

		}

		for (int i = numStudents - 2; i >= 0; i--)
		{
			if(students[i] > students[i + 1] && scores[i] < scores[i + 1] + 1)
			{
				scores[i] = scores[i + 1] + 1;
			}

		}

		int total = 0;

		for (int i = 0; i < numStudents; i++)
		{
			total += scores[i];
		}

//		for (int i = 0; i < numStudents; i++)
//		{
//			System.out.print(scores[i] + " ");
//		}
		System.out.print(total);

	}

}
