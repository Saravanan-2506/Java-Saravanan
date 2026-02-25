import java.util.Scanner;

class Reverse{

    int num , temp ,digit;
    void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter interger number:");
        num = sc.nextInt();
        temp =0;
        sc.close();
    }

    int reverseNum(){
        getInput();
        while(num!=0){
            digit = num % 10;
            temp = temp*10 + digit;
            num = num / 10;
        }
        return temp ;
    }
    public static void main(String[] args){
        Reverse obj = new Reverse();
        System.out.println(obj.reverseNum());


    }
}
