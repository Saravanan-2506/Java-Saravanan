import java.util.Scanner;

class Palindrome{

    int num , temp ,digit ,reversedNum;
    void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter interger number:");
        num = sc.nextInt();
        temp = num;
        reversedNum = 0; 
        sc.close();
    }

    String checkPalindromeString(){
        getInput();
        while(temp!=0){
            digit = temp % 10;
            reversedNum = reversedNum*10 + digit;
            temp = temp / 10;
        }

        if(reversedNum == num) {return "Palindrome";}
        return "Not an Palindrome";
    }
    public static void main(String[] args){
        Palindrome obj = new Palindrome();
        System.out.println(obj.checkPalindromeString());
    }
}
