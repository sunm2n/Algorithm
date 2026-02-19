import java.util.Arrays;

class Solution {
    public String solution(String s) {
        
        String[] tempArray = s.split(" ");
        int size = tempArray.length;

        int[] intArray = new int[size]; 

        for (int i = 0; i < size; i++) {
            intArray[i] = Integer.parseInt(tempArray[i]);
        }
        
        Arrays.sort(intArray);
        
        String answer = intArray[0] + " " + intArray[size-1];
        
        return answer;
    }
}