import java.util.Scanner;

class ClassRoutine {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the day name: ");
        String day = sc.nextLine().toLowerCase(); 

        switch(day) {
            case "sunday":
                System.out.println("Lecture: Logic,Information System");
                break;

            case "monday":
                System.out.println("Lecture: Computer H&S , Programming ");
                break;

            case "tuesday":
                System.out.println("Tutorial: Computer H&S , Programming");
                break;

            case "wednesday":
                System.out.println("Tutorial: Logic,Information System");
                break;

            case "thursday":
                System.out.println("Workshop: Logic,Information System");
                break;

            case "friday":
                System.out.println("Workshop:Computer H&S , Programming");
                break;

            case "saturday":
                System.out.println("Holiday! No classes.");
                break;

            default:
                System.out.println("Invalid day! Please enter a valid weekday name.");
                break;
        }
    }
}
