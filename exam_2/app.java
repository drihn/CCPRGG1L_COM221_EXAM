//import java.util.ArrayList;
import java.util.Scanner;

public class Exam {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        ODDOREVEN();
        PRIMEORCOMPOSIT();
        LENGHT();
        LARGESTNUMBER();
        SIXDIGIT();


       // =========================================================================================================================

        // Part II
        // Print "valid" if the result is true.
        // Print "invalid" if the result is false.

        // ==============================================================================
        // 6. Create a condition to check if the entered student number is your student
        // number. (10 pts)
        System.out.println("6. Student number validation");
        System.out.print("Enter your ten digit student number: ");
        int studntNumber = scan.nextInt();

        if (studntNumber == 2022104601)
        System.out.println("Your student number is valid");
        else
        System.out.println("Your student number is unvalid");

        // ==============================================================================

        // 7. Create a condition to check if your firstname is in UPPERCASE and your
        // lastname is in lowercase. (10 pts)
       System.out.println("7. Case sensitivity check");
        System.out.print("Enter your firstname in UPPERCASE: ");
       String FirstName = scan.next();
        System.out.print("Enter your surname in lowercase: ");
      String SurName = scan.next();
       
       
      if (FirstName.equals(FirstName.toUpperCase())) {
         System.out.println("Uppercase");
      } else {
         System.out.println("Not Uppercase");
      }
    
      if (SurName.equals(SurName.toLowerCase())) {
         System.out.println("Valid");
      } else {
         System.out.println("Not valid");
      }
   

  
// ==============================================================================
    
       // 8. Create a nested condition that will ask the specialization of the student
        // is taking
        // depending if the student is a BSIT or BSCS student.

        // Condition 1
        // if the student is BSIT, ask again if the student is taking MWAA or MAA.

        // Condition 2
        // if the student is BSCS, ask again if the student is taking ML or DF.

       
        System.out.println("8. Nested conditions");

        System.out.print("Enter your enrolled course (BSIT or BSCS): ");

        String course = scan.next();
        switch (course){
            case "BSIT":

            System.out.println("BSIT");

            System.out.println("Enter your Specialization MWA or MAA");

            String specialization1 = scan.next();
           switch (specialization1){
       
            case "MWA":
       System.out.println("Valid");
       break;
        
       case "MAA":

       System.out.println("Valid");

        break;
      }
        }
        switch (course){  

            case "BSCS":

            System.out.println("BSCS");

            System.out.println("Enter your Specialization DF or ML");

            String specialization2 = scan.next();
            switch (specialization2){
          
                case "DF":
            System.out.println("Valid");
            break;
            
            case "ML":
           System.out.println("Valid");
              break;
            }
           
        }
       
        // ==============================================================================

         // 9. Create a condition to check if the answer belongs to one of the possible
        // answers. (10 pts)

        // STEM
        // ICT
        // ABM
        // HUMSS
        // HOME ECONOMICS
        // ARTS AND DESIGN
        // TVL MARITIME

        System.out.println("9. Selection");



        System.out.println("STEM");

        System.out.println("ICT");

        System.out.println("HUMSS");

        System.out.println("HOME ECONOMICS");

        System.out.println("ARTS AND DESIGN");

        System.out.println("TVL MARITIME");

        System.out.print("Enter your SHS strand: ");



        String strand = scan.next();



        switch (strand) {



            case "STEM":

                System.out.println("VALID");

             break;



            case "ICT":

                System.out.println("VALID");

             break;



            case "HUMSS":

                System.out.println("VALID");

             break;



            case "HOME ECONOMICS":

                System.out.println("VALID");

             break;



             case "ARTS AND DESIGN":

             System.out.println("VALID");

          break;



          case "TVL MARITIME":

             System.out.println("VALID");

          break;



         default:

             System.out.println("INVALID\n");

          break;

     }

        // ==============================================================================

          // 10. Create a condition to check if your student email address contains the
        // following pattern:
        // - Your surname
        // - The string "@students.national-u.edu.ph"
        // (10 pts)
        System.out.println("10. Validate student email address ");

        System.out.print("Enter your student email address: ");
        String studentEmailAddress = scan.next();

        if(studentEmailAddress != "galvezaa@students.national-u.edu.ph" ) {

      System.out.println("VALID\n");

        }

        else{

            System.out.println("INVALID");

        }
        // ==============================================================================
          // 11. Mystery method :-)

        // Find the formula of method f(n) that accepts any positive integer n.

        // If n = 4, result is 2
        // f(4) = - 1 + 2 - 3 + 4 = 2

        // If n = 5, result is -3
        // f(5) = - 1 + 2 - 3 + 4 - 5 = - 3

        System.out.println("11. Mystery method! :-)");
        System.out.print("Enter value of n: ");
        

    }
        // Long exam 2
        // Total points possible (100 pts)
        // Methods and Conditions

        // Part I
        // 1. Create a method.
        // 2. Call the method.
        // 3. Print result of the method.

        // ==============================================================================
        // 1. Create a method that will:
        // print "ODD" if the last two digits of your student number is an odd number
        // print "EVEN" if the last two digits of your student number is an even number.
        // (10 pts)
        static void ODDOREVEN(){
            System.out.println("1. ODD or EVEN numbers");
            System.out.print("Enter the last two digits of your student number: ");
            int lastTwoDigits = scan.nextInt();

            if (lastTwoDigits % 2 == 0)
            System.out.println("The number is even.");
            else
            System.out.println("The number is odd.");
        }






     

 // ==============================================================================

        // 2. Create a method that will:
        // print "PRIME" if the last digit of your student number is a prime number
        // print "COMPOSITE" if the last digit of your student number is a composite
        // number.
        // print "NEITHER" if the last digit of your student number is neither a prime
        // nor a composite number.
        // (10 pts)

        static void PRIMEORCOMPOSIT()  {
            System.out.println("2. PRIME or COMPOSITE number");
            System.out.print("Enter the last digit of your student number: ");
            int lastDigit = scan.nextInt();

            boolean isPrime = true;
            for(int i = 2; i <= lastDigit/2; i++)
            {
                // condition for nonprime number
                if(lastDigit % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime==true)
                System.out.println(lastDigit + " is a Prime number.");
            else
                System.out.println(lastDigit + " is not a Prime number\n(it is a Composite number.)");
        }


        
        
    
    // ==============================================================================

        // 3. Create a method that will return the sum of the character length of your
        // firstname and your surname. (10 pts)
        
        static void LENGHT()  {
            System.out.println("3. Length of your fullname");

            System.out.print("Enter your firstname: ");

            String firstName = scan.next();

            System.out.print("Enter your surname: ");

            String surName = scan.next();



            int totalChar = firstName.length() + surName.length();



            System.out.println("The Length of your fullname " + totalChar);
        }
       

        

        
        // ==============================================================================

        // 4. Create a method that will take three whole numbers and print the largest
        // number.
        static void LARGESTNUMBER()  {
            System.out.println("4. Largest Number");
            System.out.print("Enter first number: ");
            int firstNumber = scan.nextInt();
            System.out.print("Enter second number: ");
            int secondNumber = scan.nextInt();
            System.out.print("Enter third number: ");
            int thirdNumber = scan.nextInt();

            if (firstNumber > secondNumber)
                if (firstNumber > thirdNumber)
                    System.out.println("The greatest numbers is: " + firstNumber);

            if (secondNumber > firstNumber)
                if (secondNumber > thirdNumber)
                    System.out.println("The greatest numbers is: " + secondNumber);

            if (thirdNumber > firstNumber)
                if (thirdNumber > secondNumber)
                    System.out.println("The greatest numbers is : " + thirdNumber);
        }
          
       
      
    

        // ==============================================================================

         // 5. Create a method and think of a formula to get the last 6 digits of your
        // student number. (10 pts)
        static void SIXDIGIT()  {
            System.out.println("5. Last six digits");

            System.out.print("Enter your ten digit student number: ");

            int studentNumber = scan.nextInt();



            int stuNumber = studentNumber - 2022000000;



            System.out.println(stuNumber);
        }
}
//         ArrayList<Integer> o = new ArrayList<Integer>();
 
   
//     ArrayList<Integer> ans;
//     for (int i = 0; i < n - 1; i++)
//         ans.add(1);
 
   
//     int y;
//     if (y - (n - 1) <= 0)
//     {
//         System.out.print("-1");
//         return;
//     }
 
    
//     ans.add(y - (n - 1));
 
    
//     int store = 0;
//     for (int i = 0; i < n; i++)
//         store += ans.get(i) * ans.get(i);
 
    
//     int x;
//     if (store < x)
//     {
//         System.out.print("-1");
//         return;
//     }
 
    
//     for (int i = 0; i < n; i++){
//         System.out.print(ans.get(i)+" ");}

// }
 


// {
//     int n = 3, x = 254, y = 18;
//     findIntegers(n, x, y);}
// }

// private static void findIntegers(int n, int x, int y) {


    



//     // Close scanner
//     scan.close();
//     }

