class Solution {
    public int solution(int[] array) {
        
        int[] check = new int[1001]; 
        
        for (int i = 0; i < array.length; i++) {
            check[array[i]]++;
        }
        
        int max = 0;    
        int answer = 0; 
        
        for(int i = 0; i <= 1000; i++) {
            if(check[i] > max) {
                max = check[i]; 
                answer = i;     
            } else if (check[i] == max && max != 0) {
                answer = -1; 
            }
        }
        
        return answer; 
    }
}