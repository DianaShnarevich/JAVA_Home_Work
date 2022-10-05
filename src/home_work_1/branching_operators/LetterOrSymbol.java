package home_work_1.branching_operators;



public class LetterOrSymbol {
    private char s;

    public LetterOrSymbol(char s) {
        this.s = s;
    }

    public String getSolution(){
        if (Character.isLetter(s)){
            return "'" + s + "'" + "is letter";
        } else {
            return "'" + s + "'" + " is symbol";
        }
    }
}
