import java.util.Scanner;

public class solution {

	 private static final Scanner scan = new Scanner(System.in);

	    public static void main(String[] args) {
	    	System.out.print("Please Enter the number of students: ");
	        int n = Integer.parseInt(scan.nextLine().trim());

	        int[] grades = new int[n];
	        System.out.print("Grades are: ");
	        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
	            int gradesItem = Integer.parseInt(scan.nextLine().trim());
	            grades[gradesItr] = gradesItem;
	        }

	        int[] result = gradingStudents(grades);

	        System.out.print("The final grades for students are: ");
	        for (int resultItr = 0; resultItr < result.length; resultItr++) {
	            System.out.print(String.valueOf(result[resultItr]));

	            if (resultItr != result.length - 1) {
	            	System.out.println();
	            }
	        }

}

		private static int[] gradingStudents(int[] grades) {
			
			int[] finalgrades = new int[grades.length];
			
			for (int i=0;i<grades.length;i++)
			{
				if (grades[i]%5 == 3 && grades[i] >= 38)
				{
					finalgrades[i] = grades[i] + 2;
				}
				else if (grades[i]%5 == 4 && grades[i] >= 38)
				{
					finalgrades[i] = grades[i] + 1;
				}
				else
				{
					finalgrades[i] = grades[i];
				}
			}
			
			return finalgrades;
		}
}
