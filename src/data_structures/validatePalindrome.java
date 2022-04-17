package data_structures;


public class validatePalindrome {
     static boolean isPalindrome(String str){

        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
              i++;
              j--;
        }

        return true;
    }

    public static void main(String[] args)
    {
       String str = "бялхляб";

        if (isPalindrome(str))
            System.out.print("Yes, the word is a palindrome.");
        else
             System.out.print("No, the word is not a palindrome");
    }
}

        

