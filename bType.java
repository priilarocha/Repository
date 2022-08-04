import java.util.Scanner;

public class bType
{
    public static void main(String[] args)
 {
    int bType, giveReceive ; // variables
    String bTypeString ; // variable to receive letters
    Scanner input = new Scanner(System.in); // input of data
    System.out.println("Enter your blood type: ");// asking the user 
    System.out.println("Use:"); // giving to the user options of input
    System.out.println("1 for A+ ");
    System.out.println("2 for B+ ");
    System.out.println("3 for AB+ ");    
    System.out.println("4 for O+ ");
    System.out.println("5 for A- ");
    System.out.println("6 for B- ");
    System.out.println("7 for AB- ");
    System.out.println("8 for O- ");
    do{
        bType = input.nextInt(); 
        if (bType < 1 || bType > 8) { // analysing the input if it's a valid input
        System.out.println ("Invalid input, please try again");
        }
       
    } while (bType < 1 || bType > 8) ; // if the input is valid then the programa starts to analyzing the valid input
        switch (bType){
            case 1 :
                bTypeString = "A+";
                System.out.println("Your Bloody Type is " + bTypeString );
                break;
            case 2 :
                bTypeString = "B+";
                System.out.println("Your Bloody Type is " + bTypeString );
                break;
            case 3 :
                bTypeString = "AB+";
                System.out.println("Your Bloody Type is " + bTypeString );
                break;
            case 4 :
                bTypeString = "A-";
                System.out.println("Your Bloody Type is " + bTypeString );
                break;    
            case 5 :
                bTypeString = "B-";
                System.out.println("Your Bloody Type is " + bTypeString );
                break;    
            case 6 :
                bTypeString = "AB-";
                System.out.println("Your Bloody Type is " + bTypeString );
                break;
            case 7 :
                bTypeString = "O-";
                System.out.println("Your Bloody Type is " + bTypeString );
                break;
        
        }
        System.out.println ("Do you want receive ou give your bloody ?") ; // asking the user what he want to know about the bloody
        System.out.println ("Use:");
        System.out.println ("1 to receive");
        System.out.println ("2 for give");
    do {         
        giveReceive = input.nextInt(); 
        if (giveReceive < 1 || giveReceive > 2){ // analysing the input if it's a valid input
        System.out.println ("Invalid input, please try again");
        }
    } while (giveReceive < 1 || giveReceive > 2) ; // if the input is valid then the program starts to analyzing the valid input
       switch (giveReceive){
              case 1 :
                if ( bType == 1){
                System.out.println("Your can give to A+ and AB+" );
                break;
            } else if (bType ==2){ 
             System.out.println("Your can give to A+, B+, O+ and AB+" );
                break;
            }
            else if (bType ==3){ 
             System.out.println("Your can give to B+ and AB+" );
                break;
            } 
            else if (bType == 4){ 
             System.out.println("Your can give to AB+" );
                break;
            } 
            else if (bType ==5){ 
             System.out.println("Your can give to A+,A-,AB+ and AB-" );
                break;
            } 
            else if (bType ==6){ 
             System.out.println("Your can give to Everyone" );
                break;
            }
            else if (bType ==7){ 
             System.out.println("Your can give to B+,B-,AB+ and AB-" );
                break;
            }
            else if (bType ==8){ 
             System.out.println("Your can give to AB+ and AB-" );
                break;
            }
        
            
            case 2:
                if ( bType == 1){
                System.out.println("Your can receive from A+,A-, O+ and O-" );
                break;
            } else if (bType ==2){ 
             System.out.println("Your can receive from O+ and O-" );
                break;
            }
            else if (bType ==3){ 
             System.out.println("Your can reveive from B+, B-, O+ and O-" );
                break;
            } 
            else if (bType == 4){ 
             System.out.println("Your can receive from Everyone" );
                break;
            } 
            else if (bType ==5){ 
             System.out.println("Your can receive from A- and O-" );
                break;
            } 
            else if (bType ==6){ 
             System.out.println("Your can receive from O-" );
                break;
            }
            else if (bType ==7){ 
             System.out.println("Your can reveive from B- and O-" );
                break;
            }
            else if (bType ==8){ 
             System.out.println("Your can receive from A-, B-,AB- and O-" );
                break;
            }        
       }
       
    }
}
    
      

    
