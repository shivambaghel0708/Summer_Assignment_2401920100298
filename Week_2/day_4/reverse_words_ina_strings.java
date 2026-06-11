class reverse_words_ina_strings
{
    public static void main(String[] args){
        reverseWords("hey i am shivam");


    }}
    static String reverseWords(String s) {
        String[] words=s.split(" ");
        StringBuilder result=new StringBuilder();
        for(int i=0;i<words.length;i++){
            String reversed_word=new StringBuilder(words[i]).reverse().toString();
            result.append(reversed_word);
            if(i<words.length-1) result.append(" ");
        }
    return result.toString();
        
    }
