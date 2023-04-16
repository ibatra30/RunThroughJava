package Programs;

import java.util.ArrayList;
import java.util.List;

//is2 sentence4 This1 a3
//This is a Sentence
public class sortingTheSentence {

    public static String sortSentence(String sentence){
        String[] words = sentence.split(" ");
        String[] wordWithCorrectPosition = new String[words.length];
        for(String word : words) {
            int index = Character.getNumericValue(word.charAt(word.length() - 1));
            wordWithCorrectPosition[index - 1]= word.substring(0,word.length() - 1);
        }
  return String.join(" ",wordWithCorrectPosition);
    }

    public static String sortSentenceArray(String sentence){
        String[] words = sentence.split(" ");
        List<String> wordlist = new ArrayList(List.of(words));
        for(String word : words) {
            int index = Character.getNumericValue(word.charAt(word.length() - 1));
            wordlist.set(index - 1, word.substring(0,word.length() - 1));
        }
        return String.join(" ",wordlist);
    }

   public static void main(String[] args){
       System.out.println(sortSentence("is2 sentence4 This1 a3"));
       System.out.println(sortSentenceArray("Myself2 Me1 I4 and3"));

    }
}
