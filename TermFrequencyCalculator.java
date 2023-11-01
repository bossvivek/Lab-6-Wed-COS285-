
import java.util.Scanner;
import java.util.TreeMap;

public class TermFrequencyCalculator implements ITermFrequency {

    @Override
    public TreeMap<String, TreeMap<String, Double>>

            getTermFrequency(TreeMap<String, String> songLyrics) {
        TreeMap<String, TreeMap<String, Double>> result = new TreeMap<String, TreeMap<String, Double>>();

        // Calculating AvgS
        double sum_length = 0;
        for (String songTitle : songLyrics.keySet())
            {
                String lyrics = songLyrics.get(songTitle);
                sum_length += lyrics.split(" ").length;
            }
        double avgS = sum_length / songLyrics.size();
        
        
        for (String songTitle : songLyrics.keySet()) {
            // For each song you have to create TF values
            TreeMap<String, Double> tempMap = new TreeMap<String, Double>();

            // current lyrics
            String lyric = songLyrics.get(songTitle);
            String[] words = lyric.split(" ");

           
        //step 1: for each word, go through the entire words array (lyrics split) 
            // and count each time it is there (
            
 
            int totalWords = words.length;
            int wordCount = 0;
            
            for (int i = 0; i < totalWords; i++)
                if (words.length==0) {
             return null;
         } else if (words.containsKey(word)) { // search the element
             return tempMap.put(word, wordCount +1);
         }
 
            // TF for Term (word) X in Song S is calculated as
            // f(X,S) . (2.2) / (f(X,S) + 1.2 . (0.25+0.75 .|S|/AvgS)
            // where f(X,S) is the frequency of term X in song S
            // |S| is the length of song in terms of number of words
            // AvgS is the average length of songs based on number of words
            
            double termFrequency = ();
            
            //use containsValue
            
         }
     
         
                
                
            }

    // TreeMap Key: Song Title Value: TreeMap Key: Words Value: Times that word pops
    // up

    // Calculate the Term Frequency (TF) Values here and save them in tempMap

    // You might need to introduce other methods and additional variables



    ////////////////////////////
    // WRITE HERE
    //////////////////////////

    // After Calculaion
    result.put(songTitle,tempMap);
}

return result;

}

}
