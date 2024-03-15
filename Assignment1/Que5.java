import java.util.Scanner;
class Que5{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Alphabet in lower case: ");
        char x = sc.next().charAt(0);
        
        if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonent");
        }
    }

}