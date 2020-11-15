/* AshleyPatel_Assign04.java by Ashley Patel 
 * on
 * April 3, 2020
 * It  allows user to make a selection from the menu and prompt the user to enter a number. 
 * It then makes a calculation based on the number and menu selected using methods.
 */
import java.util.Scanner; 
class Assignment4{ 
    public static void main(String[] args){ 
        Scanner input = new Scanner(System.in); 
        int num = -1;
        int selection = -2; 
        
        while(num !=0){ 
            System.out.println("Enter a Positive Integer or 0 to Exit"); 
            num = input.nextInt(); 
            
            if(num == 0){
                System.out.println("Program Terminated"); 
                break;
            }// ends Program Terminate if block
            
            if(num < 0){
                System.out.println("Number is invalid. Please Enter a positive Integer");
                continue;
            }// ends invalid entry if block
            
            while(selection != 0){
                System.out.println("Please make a selection from the Menu to display the following: " + "\n 1 For prime numbers" 
                                       + "\n 2 For prime factors" + "\n 3 For perfect square" + "\n 4 To Re-enter an Integer" + "\n 0 To Exit");
                selection = input.nextInt();
                
                if(selection < 0){
                    System.out.println("This is an invalid entry. Please try again and select and option below");
                    continue;
                }//ends validity if statement
                
                switch(selection){
                    case 0:{
                        System.out.println("Menu option Terminated");
                        System.exit(0);
                    }
                    case 1:{
                        primeNumber(num);
                        break;
                    }//ends case 1
                    
                    case 2:{
                        primeFactor(num);
                        break;
                    }//ends case 2
                    
                    case 3:{
                        perfectSq(num);
                        break;
                    }//ends case 3
                    
                    case 4:{
                        num = newEntry();
                        break;
                    }//ends case 4
                    
                    default:{
                        System.out.println("This is Invalid. Try again"); 
                        continue;
                    }//ends default statement   
                }//ends case switch 
            }//ends while loop with case switch
        }//end main while loop
    }//ends main method
    
    public static void primeNumber(int num){
        System.out.println(" All the prime numbers less than " + num +  " are: "); 
        for(int divisor = 2; divisor < num; divisor++){
            for (int divisor2 = 2; divisor2 <= divisor; divisor2++){
                if (divisor2 == divisor){
                    System.out.print(divisor  + " , ");
                }//ends if statement
                if (divisor % divisor2 == 0){
                    break; 
                }//ends if statement
            }//ends for loop
        }//ends for loop
        System.out.println();
    }//ends prime number method
    
    public static void primeFactor(int num){
        System.out.println(" All the prime factors of " + num + " are ");
        for(int primef = 2; primef <= num; primef++){
            while(num % primef ==0){
                System.out.print(primef+ " , ");
                num = num / primef;
            }//ends while loop
        }//ends for loop
        System.out.println();
    }//end prime factor method 
    
    public static void perfectSq(int num){
        for(int square = 1; square < num; square++){
            int x = (int)Math.sqrt(num);
            if(x * x == num){
                System.out.print("This is a perfect square");
                break;
            }//ends if statement
            else{
                System.out.println("This not a perfect square");
                break;
            }//ends else statement
        }//ends for loop
    }//ends perfect square method
    
    public static int newEntry(){
        int newNum = -1;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please Re-enter an Integer or press 0 to Terminate the program");
        newNum = input.nextInt(); 
        
        
        if(newNum == 0){
            System.out.println("Program Terminated");
            System.exit(0);
        }// end sentinal if statement
        
        while(newNum < 0){
            System.out.println("This is an invalid Re-Entry Please Try Again");
            newNum = input.nextInt();
        }//end validity if statement
        return newNum;
    }// ends reEntering method 
}//ends class