import java.util.*;
public class Num{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scan.nextInt();
        int arr[]=new int[10];
        int rem;
        for(int i=0;i<arr.length;i++){
            arr[i]=0;
        }
        while(num!=0){
            rem=num%10;
            arr[rem]++;
            num=num/10;
        }
        
        System.out.println("Sample Output");
        System.out.println("======================");
        System.out.println("Data \t Frequency");
        System.out.println("======================");
        
            
            
        
        for(int j=0;j<arr.length;j++){
            System.out.println(""+j+"\t "+arr[j]);
        }
                   
        }
        
        
    }
