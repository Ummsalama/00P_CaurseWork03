package salma;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner s= new Scanner(System.in);
		ArrayList<StudentsInfo> Students = new ArrayList<StudentsInfo>();
		StudentsInfo sn = null; 
		System.out.println("Enter Number of Students in the class ");
			num=s.nextInt();
		int i = 0;
		while(true) {
			if(i>=num)
			   break;
			else
				sn=new StudentsInfo(); 
				sn.setScores();
				Students.add(sn);
	        while(true){
	            System.out.println("Pick a number between 1 and "+num+" to view the corresponding student's results or type '0' to Continue Adding the student in the System.");
	            int no = s.nextInt();
	            if(no==0)
	                break;
	            else if(no>0 && no<=num){
	                int index = no-1;
	                sn.printStdInfo();
	                sn.printScores();
	            }
	        }
	        i++;
		}
	}
	
}
