import java.util.HashSet;
import java.util.Set;
public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s){
        if(s.length() < 2){
            return s.length();
        }

        int sLength = s.length();
        int longestLength = 0;
        int leftPointer = 0;
        int rightPointer = 1;
        Set<Character> charTrack = new HashSet<>();
        charTrack.add(s.charAt(leftPointer));

        while(rightPointer < sLength){
            if(charTrack.contains(s.charAt(rightPointer))){
                int tempLength = findLength(leftPointer, rightPointer);
                if(tempLength > longestLength){
                    longestLength = tempLength;
                }

                charTrack.remove(s.charAt(leftPointer));
                leftPointer++;
            }else{
                charTrack.add(s.charAt(rightPointer));
                rightPointer++;
            }
        }
        int tempLength = findLength(leftPointer, rightPointer);
        if(tempLength > longestLength){
            longestLength = tempLength;
        }

        return longestLength;
    }

    public static int findLength(int start, int end){
        return end - start;
    }
}

