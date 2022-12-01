package String;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
         int temp;
         String swapTwoChars;
         String polindrome;
         String duplicateStr;
         StringMethodsImpl s=new StringMethodsImpl();
        do{
            Scanner in=new Scanner(System.in);
            System.out.println("Choose options: \n 1.swap last two characters \n  2.check polindrome or not\n 3. remove duplicates from string\n enter 0 to exit\n");
            temp=in.nextInt();
            in.nextLine();
            switch(temp)
            {
                case 1:
                    System.out.println("Enter string");
                    swapTwoChars=in.next();
                    System.out.println("Before swapping string is:\n"+swapTwoChars);
                    System.out.println("After swapping string is:\n"+s.swapOnlyLastTwoCharacters(swapTwoChars));
                    break;
                case 2:
                    System.out.println("Enter string\n");
                    polindrome=in.nextLine();
                    int k=s.palindromeOrNot(polindrome);
                    if( k== -1)
                    {
                        System.out.println("You entered an empty string\n");
                    }
                    else if(s.palindromeOrNot(polindrome)==10) {
                        System.out.println("Given string is Polindrome:\n");
                    }
                    else
                    {
                        System.out.println("Given string is not a Polindrome:\n");
                    }
                    break;
                case 3:
                    System.out.println("Enter string");
                    duplicateStr=in.next();
                    System.out.println("Before removing duplicates from the string is:\n"+duplicateStr);
                    System.out.println("After Removing duplicates from the string is:\n"+s.removeDuplicatesFromString(duplicateStr));
                    break;


            }
        }while (temp!=0);
    }
}
