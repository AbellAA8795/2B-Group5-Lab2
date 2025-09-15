/** * Array Manipulation
* Group 5 
* Authors: Abella, Gabriel Rey (Leader)
* Ignacio, Keane
* Presto, Vin Hendrix
* Laboratory Exercise 2
* Date: 9/9/2025
*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;
public class IT2B_Group5_Lab2_Methods {
    Scanner scanner = new Scanner(System.in);
    public int input_index;
    private int[] arrayUser;
    boolean maxArray = false;
    int InsertSave = 0;
    boolean exceptionError = true;
    
    // 
    public void CreateArrayUser() {
         do {
            try{
                if (!maxArray) {
                        do{
                            System.out.print("Input number of indexes: ");
                            this.input_index = scanner.nextInt();

                            if (this.input_index < 5 || this.input_index > 20) {
                                System.out.println("\nInput must be greater than 5 and less than 20");
                            } else {
                                this.arrayUser = new int[this.input_index];
                                System.out.println("\nCreated array successfully");
                                maxArray = true;
                            }
                        } while (this.input_index < 5 || this.input_index > 20);

                }else{
                    System.out.println();
                    System.out.println("You already have array\n");
                }
                exceptionError = false;
            } catch (InputMismatchException e) {
                System.out.println("Whole numbers only ");
                scanner.nextLine();
            }
        }while(exceptionError);
    }


    public void InsertArrayUser() {
         int InsertValidate = 0;

        try{
            if (!maxArray) {
                System.out.println("\nArray not created");
            } else if (InsertSave == arrayUser.length) {
                    System.out.println("Array is full");
                } else {
                    System.out.print("Input elements: ");
                    for (int i = InsertSave; i < input_index; i++) {
                            int terminate = scanner.nextInt();

                            for (int j = 0; j < input_index; j++) {
                                 if (arrayUser[j] == terminate) {
                                    InsertValidate = 1;
                                     break;
                                } else {
                                     InsertValidate = 0;
                                }
                            }
                            if (terminate == -99 || terminate == 0) {
                              break;
                            } else if ( InsertValidate == 1) {
                             i--;
                            } else {
                              arrayUser[i] = terminate;
                              InsertSave++;
                            }
                    }
            }

            }catch (InputMismatchException e){
                System.out.println("Whole numbers only ");
                scanner.nextLine();
        }
    }

    public void searchArrayUser(){
        do{
            try{
                if (!maxArray){
                    System.out.println("\nArray not created");
                    return;
                }
                int searchId;
                System.out.print("Input element: ");
                searchId = scanner.nextInt();
                int i;
                for (i = 0; i < input_index; i++) {
                    if ( arrayUser[i] == searchId) {
                        break;
                    }
                }
                if (i == input_index) {
                    System.out.println("Can't find element " + searchId);
                } else {
                    System.out.println("Found element " + searchId);
                }
                exceptionError = false;
            }catch (InputMismatchException e){
                System.out.println("Whole numbers only");
                scanner.nextLine();
            }
        }while(exceptionError);
    }

    public void displayArrayUser(){
        if (!maxArray){
            System.out.println("\nArray not created");
            return;
        }
        int line = 0;
        System.out.print("Array elements are: \n");
        for (int i = 0; i < input_index; i++) {
            line++;
            System.out.printf("%7d", arrayUser[i]);
            if (line == 5) {
                System.out.println();
                line = 0;
            }
        }
       
    }

    public void deleteArrayUser() {
         do {
            try{
                if (!maxArray){
                    System.out.println("\nArray not created");
                    return;
                }
                int search;
                System.out.print("Input element to be deleted: ");
                search = scanner.nextInt();
                int i;
                for (i = 0; i < input_index; i++) {
                    if (arrayUser[i] == search) {
                        System.out.println("Element " + search + " is deleted");
                        break;
                    }
                }
                for (int j = i; j < input_index; j++) {
                    if (j == input_index -1) {
                        arrayUser[j] = 0;
                    } else {
                        arrayUser[j] = arrayUser[j + 1];
                    }
                    
                } InsertSave--;

                exceptionError = false;

            }catch(InputMismatchException e){
                System.out.println("Whole numbers only");
                scanner.nextLine();

            }
        }while (exceptionError);
    }
    
    public void ResetArrayUser(){
        boolean rechecking = true;
        boolean verification = true;
        if (!maxArray){
            System.out.println("\nArray not created");
            return;
                }
        while(verification){
                System.out.print("\nWould you like to Reset your progress? (y/n) ");
                String ans = scanner.next();
            while(rechecking){
                if(ans.toLowerCase().equals("y")){
                verification = false;
                rechecking = false;
                input_index  = 0;
                Arrays.fill(arrayUser,0);
                maxArray = false;
                InsertSave = 0;
                }else if (ans.toLowerCase().equals("n")){
                rechecking = false;
                verification = false;
                return;
                }else{
                System.out.print("\nInvalid Input. Please input y or n only"); 
                break;
                }
            }
        }
        
    
    }
    
    public void StopArrayUser() {
        boolean rechecking = true;
        boolean verification = true;
        while(verification){
        System.out.print("\nDo you want to exit the program? (y/n) ");
        String ans = scanner.next();
        while(rechecking){
            if(ans.toLowerCase().equals("y")){
                verification = false;
                rechecking = false;
                System.exit(0);
            }else if (ans.toLowerCase().equals("n")){
                rechecking = false;
                verification = false;
                return;
            }else{
                System.out.print("\nInvalid Input. Please input y or n only"); 
                break;
            }
            }
        }
    }
    
    public void ClsArrayUser(){
        System.out.print("\nPress ENTER to continue");
        String input = scanner.nextLine();
        if(scanner.hasNextLine()){
            System.out.println('\u000C');
        }
    }
}