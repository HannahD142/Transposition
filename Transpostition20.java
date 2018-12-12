/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transpostition2.pkg0;

/**
 *
 * @author 630190
 */
public class Transpostition20 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String note = "C#";
        int numOfHalfSteps = 4;
        String letter = toLetter(note);
        int number = toNumber(letter);
        int transposedUp = transposeUp(number, numOfHalfSteps);
        char transposedNote = toNote(transposedUp);
        System.out.println(transposedNote);
    }
    public static String toLetter(String note){
    String aFlat = "Af";
    String a = "A";
    String aSharp = "A#";
    String bFlat = "Bf";
    String b = "B";
    String bSharp = "B#";
    String cFlat = "Cf";
    String c = "C";
    String cSharp = "C#";
    String dFlat = "Df";
    String d = "D";
    String dSharp = "D#";
    String eFlat = "Ef";
    String e = "E";
    String eSharp = "E#";
    String fFlat = "Ff";
    String f = "F";
    String fSharp = "F#";
    String gFlat = "Gf";
    String g = "G";
    String gSharp = "G#";    
    
    String aFlatGSharpLetter = "A";
    String aLetter = "B";
    String aSharpBFlatLetter = "C";
    String bCFlatLetter = "D";
    String bSharpCNatualLetter = "E";
    String cSharpDFlatLetter = "F";
    String dLetter = "G";
    String dSharpEFlatLetter = "H";
    String eFFlatLetter = "I";
    String eSharpFLetter = "J";
    String fSharpGFlatLetter = "K";
    String gLetter = "L";
   
    if(note.equals(aFlat)){
        String letter = aFlatGSharpLetter;
        return letter;
    }
    if(note.equals(a)){
        String letter = aLetter;
    return letter;
    }
    if(note.equals(aSharp)){
        String letter = aSharpBFlatLetter;
        return letter;
    }
    if(note.equals(bFlat)){
        String letter = aSharpBFlatLetter;
        return letter;
    }
    if(note.equals(b)){
        String letter = bCFlatLetter;
        return letter;
    }
    if(note.equals(bSharp)){
        String letter = bSharpCNatualLetter;
        return letter;
    }
    if(note.equals(cFlat)){
        String letter = bCFlatLetter;
        return letter;
    }
    if(note.equals(c)){
        String letter = bSharpCNatualLetter;
        return letter;
    }
    if(note.equals(cSharp)){
        String letter = cSharpDFlatLetter;
        return letter;
    }
    if(note.equals(dFlat)){
        String letter = cSharpDFlatLetter;
        return letter;
    }
    if(note.equals(d)){
        String letter = dLetter;
        return letter;
    }
    if(note.equals(dSharp)){
        String letter = dSharpEFlatLetter;
        return letter;
    }
    if(note.equals(eFlat)){
        String letter = dSharpEFlatLetter;
        return letter;
    }
    if(note.equals(e)){
        String letter = eFFlatLetter;
        return letter;
    }
    if(note.equals(eSharp)){
        String letter = eSharpFLetter;
        return letter;
    }
    if(note.equals(fFlat)){
        String letter = eFFlatLetter;
        return letter;
    }
    if(note.equals(f)){
        String letter = eSharpFLetter;
        return letter;
    }
    if(note.equals(fSharp)){
        String letter = eSharpFLetter;
        return letter;
    }
    if(note.equals(gFlat)){
        String letter = fSharpGFlatLetter;
        return letter;
    }
    if(note.equals(g)){
        String letter = gLetter;
        return letter;
    }
    if(note.equals(gSharp)){
        String letter = aFlatGSharpLetter;
        return letter;
    }
    else{
        return ("error");
    }
        
    
    }
    public static int toNumber(String letter){
        int noteNumber = (int) letter.charAt(0);
        return noteNumber;
    }
    public static int transposeUp(int number, int numberOfHalfSteps){
        int transposedUp = number + numberOfHalfSteps;
        if (transposedUp >= 77){
            transposedUp -= 12;
        }
        return transposedUp;
    }
    public static int transposeDown(int number, int numberOfHalfSteps){
        int transposedDown = number - numberOfHalfSteps;
        if (transposedDown <= 64){
            transposedDown += 12;
        }
        return transposedDown;
    }
    public static char toTransposedLetter(int transposed){
       char transposedNote = (char) transposed;
       return transposedNote;
    }
    public static String toNote(char charLetter){
      String letter = Character.toString(charLetter);
        if(letter.equals("A")){
          String note = "G#/Af";
          return note;
      } 
      if(letter.equals("B")){
          String note = "A";
          return note;
      } 
      if(letter.equals("C")){
          String note = "A#/Bf";
          return note;
      } 
      if(letter.equals("D")){
          String note = "B/Cf";
          return note;
      } 
      if(letter.equals("E")){
          String note = "B#/C";
          return note;
      } 
      if(letter.equals("F")){
          String note = "C#/Df";
          return note;
      } 
      if(letter.equals("G")){
          String note = "D";
          return note;
      } 
      if(letter.equals("H")){
          String note = "D#/Ef";
          return note;
      } 
      if(letter.equals("I")){
          String note = "E/Ff";
          return note;
      } 
      if(letter.equals("J")){
          String note = "E#/F";
          return note;
      } 
      if(letter.equals("K")){
          String note = "F#/Gf";
          return note;
      } 
      if(letter.equals("L")){
          String note = "G";
          return note;
      } 
      else{
          return("error");
      }
    }
     
}
