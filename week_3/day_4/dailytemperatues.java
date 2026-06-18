package week_3.day_4;

import java.util.Stack;

public class dailytemperatues {
    class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s=new Stack<>();
        int[] answer=new int[temperatures.length];
        int count=0;
        for(int i=temperatures.length-1;i>=0;i--){
            while(s.size()>0 &&temperatures[s.peek()]<=temperatures[i]){
                s.pop();
                }
            
            if(s.isEmpty()){ 
                
            answer[i]=0;

            }
            else answer[i]=s.peek()-i;
            s.push(i);
        }
        return answer;
        
    }
}
    
}
