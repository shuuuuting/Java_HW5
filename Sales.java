import java.util.Scanner;

public class Sales{
	public static void main(String[] args){
		int array[][];
		array = new int[3][2];
		Scanner input = new Scanner(System.in);
		System.out.println("How about your sales?");
		while(true){
			System.out.print("Enter Sales No.[1-2 or -1:exit]:");
			String s = input.next();
			if(s.equals("1")==true||s.equals("2")==true){
				while(true){
					System.out.print("Enter Product No.[A,B,C or -1:back]:");
					String p = input.next();
					if (p.equals("A")==true){
						System.out.print("Enter the amount:");
						array[0][Integer.parseInt(s)-1]=input.nextInt();
					}
					else if (p.equals("B")==true){
						System.out.print("Enter the amount:");
						array[1][Integer.parseInt(s)-1]=input.nextInt();
					}
					else if (p.equals("C")==true){
						System.out.print("Enter the amount:");
						array[2][Integer.parseInt(s)-1]=input.nextInt();
					}
					else if(p.equals("-1")==true) break;
					else 
						System.out.println("---Please enter A,B,C as the Product No.---");
					}
				}
			else if(s.equals("-1")==true) break;
			else 
				System.out.println("---Please enter 1-2 as the Sales No.---");
		}
		int totalofP[]={0,0,0};
		for(int p=0;p<array.length;p++){
			for(int s=0;s<array[p].length;s++){
				totalofP[p]+=array[p][s];
			}
		}
		int totalofS[]={0,0};
		for(int s=0;s<array[0].length;s++){
			for(int p=0;p<array.length;p++){
				totalofS[s]+=array[p][s];
			}
		}		
		System.out.printf("%7s%13s%13s%6s\n","Product","Salesperson1","Salesperson2","Total");
		System.out.printf("%7s%13d%13d%6d\n","A",array[0][0],array[0][1],totalofP[0]);
		System.out.printf("%7s%13d%13d%6d\n","B",array[1][0],array[1][1],totalofP[1]);
		System.out.printf("%7s%13d%13d%6d\n","C",array[2][0],array[2][1],totalofP[2]);
		System.out.printf("%7s%13d%13d\n","Total",totalofS[0],totalofS[1]);
	}
}