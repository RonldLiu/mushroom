public class HangingMan {
    private int numWrongGuesses;
    String[] HangmanImage = {
            "\n\n\n\n\n\n    XX",
            "\n\n\n\n\n    XX\n    XX",
            "\n\n\n\n    XX\n    XX\n    XX",
            "\n\n\n`\"\"\"XX\"\"\"`\n    XX\n    XX\n    XX",
            "\n\nXXXXXXXXXX\n`\"\"\"XX\"\"\"`\n    XX\n    XX\n    XX",
            "\n,XXXXXXXX,\nXXXXXXXXXX\n`\"\"\"XX\"\"\"`\n    XX\n    XX\n    XX",
            " ,xXXXXx,\n,XXXXXXXX,\nXXXXXXXXXX\n`\"\"\"XX\"\"\"`\n    XX\n    XX\n    XX"};
    public boolean isntDead(){
        return numWrongGuesses < "Puzzle".length();
    }

    public void show(){
        System.out.println(HangmanImage[numWrongGuesses]+"\n");
    }

    public void dieSomeMore(){
        numWrongGuesses++;
    }
}
