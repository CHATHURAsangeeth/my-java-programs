import java.util.Scanner;
class Total{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int x = 10;
		int total = 0;
		for (int i = 1 ; i <= x ; i++)
		{
			System.out.print("Enter subject "+i +" mark : ");
			int mark = input.nextInt();
			total = total + mark;
			
			}
			int avg = total/10;
			System.out.println("Youer avarage is : "+avg);
			System.out.println("Youer Total Mark is : "+total);
			
			char grade = ((avg <= 100) && (avg >= 75)) ? 'A' :
							((avg < 75) && (avg >= 65)) ?  'B' :
							((avg < 65) && (avg >= 55)) ?  'c' :
							((avg < 55) && (avg >=35)) ?   'S' :'F'	;
							
			System.out.println("Youer Grade is  : "+grade);						
		
		}
	
	}
