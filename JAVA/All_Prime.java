package fundamentals;
import java.util.Scanner;
public class All_Prime {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        s.close();
            
        int count = 2;
        while(count <= number){
        	int subCount = 2;
            int factors = 0;
            while(subCount <= Math.sqrt(count)){
            	if(count % subCount ==0){
            		factors++;
            		break;
            	}
            	subCount++;
            	}
            if(factors == 0){
            	System.out.println(count);
            }
            count++;
        }
    }
}
