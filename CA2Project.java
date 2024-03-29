import java.util.Scanner;
/**
 * It's a program to check the compatibility of the blood types
 * Checking to what blood types the one informed by the user can receive and donate
 *
 * @author Priscila Rocha de Queiroz
 * @studentID 25337
 * @email 25337@student.dorset-college.ie
 */
public class CA2Project
{
     public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        
        int choice=0; //the variable was declared with a value 0 associated just to be initialized
        String bloodType="nothing",give="nothing",receive="nothing"; //variable declared and initialized
       
    while (bloodType!="A+"||bloodType!="A-"||bloodType!="B+"||bloodType!="B-"||bloodType!="AB+"||bloodType!="AB-"||bloodType!="O+"||bloodType!="O-"){
        //while the blood type doesn't exist, the program will continue asking for the blood type
        System.out.println("Please provide blood type (A+, O+, B+, AB+, A-, O-, B-, AB-):  ");
        bloodType=kb.nextLine().toUpperCase(); //the upper case makes what the user digit in upper case, so the program will undertand a+ and A+, for example
    
        if (bloodType.equals("A+")){  //if the blood type is A+ the program will give the following values to the give and receive
            give="A+,AB+";
            receive="A+,A-,O+,O-";
            break;
        }
        else if (bloodType.equals("A-")){ //if the blood type is A- the program will give the following values to the give and receive
            give="A+,A-,AB+,AB-";
            receive="A-,O-";
            break;
        }
        else if (bloodType.equals("B+")){ //if the blood type is B+ the program will give the following values to the give and receive
            give="B+,AB+";
            receive="B+,B-,O+,O-";
            break;
        }
        else if (bloodType.equals("B-")){ //if the blood type is B- the program will give the following values to the give and receive
            give="B+,B-,AB+,AB-";
            receive="B-,O-";
            break;
        }
        else if (bloodType.equals("AB+")){ //if the blood type is AB+ the program will give the following values to the give and receive
            give="AB+";
            receive="Everyone";
            break;
        }
        else if (bloodType.equals("AB-")){ //if the blood type is AB- the program will give the following values to the give and receive
            give="AB+,AB-";
            receive="A-,B-,AB-,O-";
            break;
        }
        else if (bloodType.equals("O+")){ //if the blood type is O+ the program will give the following values to the give and receive
            give="A+,B+,AB+,O+";
            receive="O+,O-";
            break;
        }
        else if (bloodType.equals("O-")){ //if the blood type is O- the program will give the following values to the give and receive
            give="Everyone";
            receive="O-";
            break;
        }
            System.out.println("Blood type doesn’t exist, please try again! ");
    } 
            
     while(choice!=1||choice!=2){
         //while the choice doesn't exist, the program will continue asking for the user choose between give and receive
        System.out.println("Do you want to know about giving or receiving (1 for Gives, 2 for Receives): ");
        choice=kb.nextInt();
    
        if (choice==1){ //if the choice is equal to 1 the program will show the gives
            System.out.println("The blood type for "+bloodType+" to give are:  "+give);
            break;
        }
        else if (choice==2){ //if the choice is equal to 2 the program will show the receives
            System.out.println("The blood type for "+bloodType+" to receive are:  "+receive);
            break;
        }
           System.out.println("Choice doesn’t exist, please try again! "); //if the choice isn't valid, the program will show this message and ask for another number
    System.out.println("Test GIT Repository! ");
}    
 }
}
