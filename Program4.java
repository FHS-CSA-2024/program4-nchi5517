//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;
public class Program4 {
    public static void main(String[] args){
        int x = 0;
        int y = 0;
        int a = 0;
        int n = 0;
        int sum = 0;
        double decimalAverage = 0.00;
        
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        x = myObj.nextInt();
        System.out.println("Enter 2nd number: ");
        y = myObj.nextInt();
        System.out.println("Enter 3rd number: ");
        a = myObj.nextInt();
        System.out.println("Enter 4th number: ");
        n = myObj.nextInt();
        
        sum = x+y+a+n;
        decimalAverage = sum/4.0;
        
        
        System.out.println("The sum of the four numbers is "+sum);
        System.out.println("The average of the four numbers is "+decimalAverage);
        
        
        
        
    
    }
}


//Paste console output below:
/*


*/
