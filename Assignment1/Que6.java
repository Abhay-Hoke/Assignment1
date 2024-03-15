import java.util.Scanner;
class Que6{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Height in mts.: ");
        float height = sc.nextFloat();
        System.out.print("Enter Weight in Kgs: ");
        float weight = sc.nextFloat();
        float BMI = weight/(height*height);
        if(BMI<18.5){
            System.out.println("Underweight");
        }
        else if(BMI>18.5 && BMI<24.9){
            System.out.println("Normal");
        }
        else if(BMI>25 && BMI<29.9){
            System.out.println("Overweight");
        }
        else if(BMI>30 && BMI<34.9){
            System.out.println("Obese");
        }
        else if(BMI>35){
            System.out.println("Extremly Obese");
        }

    }
}