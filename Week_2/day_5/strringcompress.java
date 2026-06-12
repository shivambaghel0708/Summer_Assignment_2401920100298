package Week_2.day_5;

import java.util.ArrayList;

public class strringcompress {

    public int compress(char[] chars) {
        ArrayList<Character> result=new ArrayList<>();
        int  current=0 ;
         while (current < chars.length) {

            char ch = chars[current];
            int count = 0;

            while (current < chars.length && chars[current] == ch) {
                count++;
                current++;
            }

            result.add(ch);

            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    result.add(c);
                }
            }
        }
        for (int i = 0; i < result.size(); i++) {
    chars[i] = result.get(i);
}

        System.out.println(result);
        
        return result.size();
    }
}        
    

    

