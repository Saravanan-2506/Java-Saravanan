import java.util.Scanner;

public class Fibonacci {
    int num , a , b ,c;
    void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter interger number:");
        num = sc.nextInt(); 
        a = 0;
        b = 1;
        sc.close();
    }

    void fibonacci(){
        getInput();
        System.out.println(a);
        System.out.println(b);

        for(int i = 2;i<num;i++){
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }

    public static void main(String[] args){
        Fibonacci obj = new Fibonacci();
        obj.fibonacci();
    }
    
}
