import java.util.Scanner;
/**
 * It's a program that the user can check  the compatibility the blood types
 * 
 * @author Patricia Vicente
 * @studentID 25573
 * @email patricia.candrade@hotmail.com
 */
public class Blood {
    public static void main (String args[]) {
        
        //variables
        Scanner kb = new Scanner(System.in);
        String bloodType;
        String give;
        String receive;
        give="1";
        receive="2";
        int option=0;
        bloodType="x";
        
        //blood types
        while (bloodType!= "A+"||bloodType!="A-"||bloodType!="B+"||bloodType!="B-"||bloodType!="AB+"||bloodType!="AB-"||bloodType!="O+"||bloodType!="O-"){
        
        //in this phase, the user input the blood type    
            System.out.println("Please, enter the blood type: A+, A-, B+, B-, AB+, AB-, O+ or O-.");
        bloodType = kb.nextLine().toUpperCase();
        
        //blood types and what types the user can give or receive
        if (bloodType.equals("A+")){
            give = "A+, AB+";
            receive = "A+, A-, O+, O-";
            break;
         }
        else if  (bloodType.equals("A-")){
            give = "A+, AB+, A-, AB- ";
            receive = "A-, O- ";
            break;
         }
        else if  (bloodType.equals("B+")){
            give = "B+, AB+";
            receive = "B+, B-, O+, O-";
            break;
        }
        else if  (bloodType.equals("B-")){
            give = "B+, B-, AB+ and AB-";
            receive = "B- and O- ";
            break;
        }
        else if  (bloodType.equals("AB+")){
            give = "AB+ ";
            receive = "All Types ";
            break;
        }
        else if  (bloodType.equals("AB-")){
            give = "AB+, AB-";
            receive = "AB-, A-, B-, O-";
            break;
        }
        else if  (bloodType.equals("O+")){
            give = "O+, A+, B+, AB+ ";
            receive = "O+, O-";
            break;
        }
        else if  (bloodType.equals("O-")){
            give = "All Types";
            receive = "O-";
            break;
        }
            System.out.println("This blood type doesn't exist. Please, try again.");
    }
    while(option!=1||option!=2||option!=3){
            
            //in this phase, the user input the option 1, 2 or 3
            System.out.println("Would you like to know about what blood type you can give or receive? Please, type 1 for give, 2 for receive or 3 for both.");
            option=kb.nextInt();
            
            if(option==1){
                System.out.println("You can give to: "+give);
                break;
            }
            else if(option==2){
                System.out.println("You can receive from: "+receive);
                break;
            }
            else if(option==3){
                System.out.println("You can give to: "+give + " and you can reveive from: "+receive);
                break;
            }
                System.out.println("This option doesn't exist. Please, try again. I already say:try again!");
        }
}
}
