import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class Puzzle{
    private String word; 
    private String guesses;
    public Puzzle(){
        word = "Puzzle".toUpperCase();
        guesses = "";
    }

    public boolean isUnsolved(){
        for(int i = 0; i < word.length(); i++){
            if(!guesses.contains(word.substring(i,i+1))) return true;
        }
        return false;
    }

    public void show(){
        System.out.print("Puzzle: ");
        for(int i = 0; i < word.length(); i++){
            boolean match = false;
            for(int j = 0; j < guesses.length(); j++){
                if(word.charAt(i) == guesses.charAt(j)){
                    match = true;
                    System.out.print(word.charAt(i)+" ");
                    break;
                }
            }
            if(!match) System.out.print("_ ");     
        }
        System.out.println("\n");
        System.out.print("Guesses: ");
        for(int i = 0; i < guesses.length(); i++){
            if(i == 0) System.out.print(guesses.charAt(i));
            else System.out.print(", " + guesses.charAt(i));
        }
    }

    public boolean makeGuess(String s){
        s = s.toUpperCase();
        guesses += s;
        return word.contains(s);
    }

    public String getWord(){
        return word.toUpperCase();  
    }
}
