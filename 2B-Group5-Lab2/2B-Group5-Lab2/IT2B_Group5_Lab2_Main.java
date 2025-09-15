import java.util.Scanner;
import java.util.InputMismatchException;

public class IT2B_Group5_Lab2_Main
{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int userInputIndexes;
    int userChoice;
    boolean retry = true;
    IT2B_Group5_Lab2_Methods new_array = new IT2B_Group5_Lab2_Methods();
    do {
            try{
            System.out.println("----------------------------------");
            System.out.println("|         Array Operations       |");
            System.out.println("|               Menu             |");
            System.out.println("|                                |");
            System.out.println("|       [1] Create Array         |");
            System.out.println("|       [2] Insert Elements      |");
            System.out.println("|       [3] Search               |");
            System.out.println("|       [4] Display              |");
            System.out.println("|       [5] Delete               |");
            System.out.println("|       [6] Reset                |");
            System.out.println("|       [0] Stop                 |");
            System.out.println("----------------------------------");
            System.out.print  ("       Enter Choice:  "); 
            userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1:
                    new_array.CreateArrayUser();
                    new_array.ClsArrayUser();
                    break;
                case 2:
                    new_array.InsertArrayUser();
                    new_array.ClsArrayUser();
                    break;
                case 3:
                    new_array.searchArrayUser();
                    new_array.ClsArrayUser();
                    break;
                case 4:
                    new_array.displayArrayUser();
                    new_array.ClsArrayUser();
                    break;
                case 5:
                    new_array.deleteArrayUser();
                    new_array.ClsArrayUser();
                    break;
                case 6:
                    new_array.ResetArrayUser();
                    new_array.ClsArrayUser();
                    break;
                case 0:
                    new_array.StopArrayUser();
                    new_array.ClsArrayUser();
                    break;  
                default:
                    System.out.print("\nInvalid input");
                    new_array.ClsArrayUser();
            } 
        } catch(InputMismatchException e){
        System.out.println("Whole numbers only");
        new_array.ClsArrayUser();
        scanner.nextLine();
        }
        } while (retry);    
    }
}
