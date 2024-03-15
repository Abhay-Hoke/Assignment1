import java.util.*;
class Que1{
    public static void main(String []args){
        System.out.print("Enter your Score: ");
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        if(a<=100 && a>90 ){
            System.out.println("A");
        }
        else  if(a<=90 && a>80 ){
            System.out.println("B");
            }
            else  if(a<=80 && a>65 ){
            System.out.println("C+");
            }
            else  if(a<=65 && a>50 ){
            System.out.println("C");
            }
            else if(a<=50 && a>=40 ){
            System.out.println("D");
            }
            else  if(a<40 ){
            System.out.println("F");
        }
    }
}