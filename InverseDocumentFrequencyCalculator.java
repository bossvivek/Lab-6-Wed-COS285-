package Lab6;

import java.util.ArrayList;
import java.util.TreeMap;


public class InverseDocumentFrequencyCalculator implements IInverseFreq {

    @Override
    public TreeMap<String, Double> getInverseDocumentFrequency(TreeMap<String, String> songLyrics) {
        /**
         * @author Madalyn Amero
         * @version 1 November, 2023
         */
    	TreeMap<String, Double> result = new TreeMap<String, Double> ();
    	TreeMap<String, Integer> counts = new TreeMap<String, Integer> ();
    	
        for(String songTitle: songLyrics.keySet())
        {
            // current lyrics
            String lyric = songLyrics.get(songTitle);
            String[] words = lyric.split(" ");
            
            //ArrayList to hold unique words
            ArrayList<String> temp = new ArrayList<>();
            
            for(int i = 0; i < words.length; i++) {
            	String current = words[i];
            	int count = 1;
            	
            	if (!temp.contains(words[i])) {
            		temp.add(words[i]);
            	}
            }
            
            //Counting how many time each unique word is used
            for (int i = 0; i < temp.size(); i++) {
      
            	if (!counts.containsKey(temp.get(i))) {
            		counts.put(temp.get(i), 1);
            	}
            	if (counts.containsKey(temp.get(i))) {
            		int prevCount = counts.get(temp.get(i));
            		counts.put(temp.get(i), prevCount+1);
            	}
            }
            
     
            // Calculate the Inverse Document Frequency (IDF) Values here
            // You might need to introduce other methods and additional variables
            
            // IDF for term X is calculated as ln of (N-n(X)+0.5)/(n(X)+0.5) plus 
            // where N is total number of songs
            // and n(X) is the number of songs having term X

            
            ////////////////////////////
            //WRITE HERE
            //////////////////////////
        }
       
        //Calculating the IDF value for each term
        int total = songLyrics.size();
        for (String words: counts.keySet()) {
        	int temp = counts.get(words);
        	
        	Double IDF = Math.log(((total-temp)+0.5)/(temp+0.5)+1);
        	result.put(words, IDF);
        }
        
        return result;
    }

}
