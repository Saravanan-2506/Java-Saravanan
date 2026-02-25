import java.util.Scanner;
public class Factorial {
    int num,i,fact = 1;
    void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter interger number:");
        num = sc.nextInt(); 
        sc.close();
    }
    int findFact(){
        getInput();

        for(i=2;i<=num;i++){
            fact = fact * i;
        }
        
        return fact;
    }
    public static void main(String[] args){
        Factorial obj = new Factorial();
        System.out.println(obj.findFact());
    }
    
}
