package Week_1.Day_5;

public class valid_palindrome {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder builder=new StringBuilder();
        for (int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                builder.append(c);
            }
            else
            {
                continue;
            }
        }
        String original=builder.toString();
        String changed=(builder.reverse()).toString();
        if(original.equals(changed))   {
            return true;
            
        }   
        else 
         return false;  
    }
    
}
