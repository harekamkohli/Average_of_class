//Harekam Kohli 
// SBU ID- 115148763
// CSE-114
//kohli_harekam_Lab7_P1_ques2 

package lab_7;
import java.util.*;
public class lab7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner (System.in);
		
		System.out.print("Enter the no of groups:");
		int r= input.nextInt();
		
		System.out.print("Enter the number of students in each group:");
		int c= input.nextInt();
		
		int[][] inp= new int[r][c];
		System.out.println("Enter the grades: ");
			for (int i=0; i<r; i++) {
				
				for (int j=0; j<c; j++) {
					
					inp[i][j] = input.nextInt();
				}
			}
		
		
		double total;
			for (int i=0 ; i<r ; i++) {
				total= 0;
				for (int j=0 ; j<c ; j++) {
						total= total + inp[i][j];
					}
				System.out.print("average score of group "+(i+1)+" is:");
				
				System.out.println(total/c);
					}
				}
			}
		
		


