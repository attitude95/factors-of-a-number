import java.io.*;
import java.util.*;
public class factors_of_a_number{
	public static void main(String [] args){
		Scanner in=new Scanner(System.in);
		LinkedList<Integer> factors=new LinkedList<Integer>();
		int n=in.nextInt();
		for(int i=1;i<Math.sqrt(n);i++){
			if(n%i==0){
				factors.add(i);
				if(i!=n/i){
				factors.add(n/i);
				}
			}
		}
		System.out.println(factors);
	}
}