import java.util.Scanner;

class EligibilityChecker{
    public static void main(String[] args){
    Scanner sc= new Scanner (System.in);

    System.out.println("Enter the GPA: ");
    double gpa= sc.nextDouble();


    System.out.println("Enter the attendance % :");
    double attendance= sc.nextDouble();

    System.out.println("Enter the attitude score : ");
    double attitude= sc.nextDouble();
    
    if(gpa > 3.6 && gpa < 4.0){
        if (attendance >=80){
            if(attitude >=5){
            System.out.println("You are elligible for scholarship!");
            
        }else {
        System.out.println("Attitude must greater than 5");
        } 
    }else{
            System.out.println("Attendence must be greater than 80%");
        }
    }else {
        System.out.println("Not elligible for scholarship");
    }
}
}