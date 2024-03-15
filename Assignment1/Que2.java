import java.util.Scanner;
class Que2{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        //Write your logic here
        if( year%4==0 && year%100!=0 ){
            
            System.out.println("Leap Year");
        }
        else if( year%400==0 ){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("not");
        }

    }
}