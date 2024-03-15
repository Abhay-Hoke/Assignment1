import java.util.Scanner;
class Que3{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter Number2: ");
        int n2 = sc.nextInt();
        if(n2!=0){
        System.out.println("Operators: ");
        System.out.println("1.+");
        System.out.println("2.-");
        System.out.println("3.*");
        System.out.println("4./");
        System.out.print("Enter Operator no.: ");
        int op = sc.nextInt();
        
            switch (op) {
            case 1:
                System.out.println("Sum: "+(n1+n2));
                break;
            case 2:
                System.out.println("Sub: "+(n1-n2));
                break;
            case 3:
                System.out.println("Sum: "+(n1*n2));
                break;
            case 4:
                System.out.println("Sum: "+(n1/n2));
                break;
            }
        }
        else{
            System.out.println("n2 Must be a non-zero value");
        }
    }
}