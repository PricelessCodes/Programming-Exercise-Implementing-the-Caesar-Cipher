
/**
 * Write a description of WordPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import org.apache.commons.csv.*;
import java.io.*;

public class WordPlay {

    public boolean isVowel(char ch) {
        
        String vowels = "aeiou";
        
        for(int i = 0; i < vowels.length(); i++) {
            
            if (vowels.charAt(i) == Character.toLowerCase(ch))
            {
                return true;
            }
        }        
       
        return false;
    }
    
    public void testisVowel() {
        char ch = 'm';
        System.out.println(ch + " is " + isVowel(ch));
    }
    
    public String replaceVowels(String phrase, char ch) {
        
        StringBuilder newPhrase = new StringBuilder(phrase);
        
        for(int i = 0; i < newPhrase.length(); i++)
        {
            char currChar = newPhrase.charAt(i);
            boolean bIsVowel = isVowel(currChar);
            
            if(bIsVowel){
                newPhrase.setCharAt(i, ch);
            }
            //Otherwise: do nothing
        }
        return newPhrase.toString();
    }
    
    public void testreplaceVowels() {
        String phrase = "Hello World, Om Fras wakla el gaw.";
        char ch = '*';
        System.out.println(replaceVowels(phrase, ch));
    }
    
    public String emphasize(String phrase, char ch) {
        
        StringBuilder newPhrase = new StringBuilder(phrase);
        
        for(int i = 0; i < newPhrase.length(); i++)
        {
            char currChar = newPhrase.charAt(i);
            
            if(Character.toLowerCase(currChar) == Character.toLowerCase(ch)){
                if ((i + 1) % 2 == 0)
                {
                    newPhrase.setCharAt(i, '+');
                }
                else
                {
                    newPhrase.setCharAt(i, '*');
                }
            }
            //Otherwise: do nothing
        }
        return newPhrase.toString();
    }
    
    public void testEmphasize() {
        String phrase = "dna ctgaaactga";
        char ch = 'A';
        System.out.println(emphasize(phrase, ch));
        
        phrase = "Mary Bella Abracadabra";
        ch = 'a';
        System.out.println(emphasize(phrase, ch));
    }
}
