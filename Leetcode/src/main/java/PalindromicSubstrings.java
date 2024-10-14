public class PalindromicSubstrings{
    public static int countSubstrings(String s){
        if(s.length() < 2){
            return s.length();
        }

        int count = 0;
        int sLength = s.length();

        //For odd palindrome substrings
        int i = 0;
        while(i < sLength){
            count++;

            int leftPointer = i - 1;
            int rightPointer = i + 1;
            while(leftPointer >= 0 && rightPointer < sLength){
                if(s.charAt(leftPointer) == s.charAt(rightPointer)){
                    count++;
                    leftPointer--;
                    rightPointer++;
                }else {
                    break;
                }
            }
            i++;
        }

        //For even palindrome substrings
        i = 0;
        int j = i + 1;
        while(i < (sLength - 1)){
            int leftPointer = i;
            int rightPointer = j;

            while(leftPointer >= 0 && rightPointer < sLength){
                if(s.charAt(leftPointer) == s.charAt(rightPointer)){
                    count++;
                    leftPointer--;
                    rightPointer++;
                }else
                    break;
            }
            i++;
            j++;
        }

        return count;
    }
}