import java.util.*;
public class Morsie
{
    // First 10 elements of Array are the digits. The rest are the letters.
    private final String[] morseSimbols = new String[] {"-----", ".----", "..---", "...--", "....-",
                                                        ".....", "-....", "--...", "---..", "----.",
                                                        ".-", "-...", "-.-.", "-..", ".", "..-.", 
                                                        "--.", "....", "..", ".---", "-.-", ".-..",
                                                        "--", "-.", "---", ".--.", "--.-", ".-.",
                                                        "...", "-", "..-", "...-", ".--", "-..-",
                                                        "-.--", "--.."};
     
    public String englishToMorse (String englishPhrase)
    {
        // Stringbuilder to store the converted morse phrase.
        StringBuilder morsePhrase = new StringBuilder(englishPhrase.length() + 16);
        // Split the phrase into individual words.
        String[] englishWords = englishPhrase.split(" ");
         
        for (int word = 0; word < englishWords.length; word++)
        {
            // Split curret word into individual uppercase Characters.
            char[] englishLetters = englishWords[word].toUpperCase().toCharArray();
            for (int letter = 0; letter < englishLetters.length; letter++)
            {
                // variable to store the difference between characters ACSII code and the array index.
                int diff = 0;
                if (Character.isDigit(englishLetters[letter]))
                {
                    // If Character is a digit subtract 48 from ACSII code
                    // since first array index of digits is 0.
                    diff = 48;
                }
                else if (Character.isLetter(englishLetters[letter]))
                {
                    // If Character is a letter subtract 55 from ACSII code
                    // since first array index of letters is 10.
                    diff = 55;
                }
                 
                // Append the morse simbol based on characters ACSII code
                morsePhrase.append(morseSimbols[(int)englishLetters[letter] - diff]);
                // Append a space between characters
                morsePhrase.append(" ");
            }
             
            // current word is finished so append 2 more spaces (one was added inside the loop)
            morsePhrase.append("  ");
        }
         
        // Return the morse phrase removing trailing spaces.
        return morsePhrase.toString().trim();
    }
     
    public String morseToEnglish(String morsePhrase)
    {
        // Split the morse phrase into individual letters and leave a zero length
        // element in array where there are 3 spaces between words.
        String[] morseLetters = morsePhrase.split(" \\s?");
        // Stringbuilder to store the converted english phrase.
        StringBuilder englishPhrase = new StringBuilder(morseLetters.length);
         
        for (int letter = 0; letter < morseLetters.length; letter++)
        {
            if (morseLetters[letter].length() == 0)
            {
                // if the current array element is of zero length than word is finished and append a space
                englishPhrase.append(" ");
            }
            else
            {
                // variable to store the difference between characters ACSII code and the array index.
                // Since digits in morse have a length of 5 and letters only 4, set the variable accordingly
                int diff = morseLetters[letter].length() == 5 ? 48 : 55;
                 
                // Find the index of the array where the current morse simbol is stored
                int index = 0;
                for (; index < morseSimbols.length && !morseSimbols[index].equals(morseLetters[letter]); index++)
                    ;
                 
                // Append the digit or character that corresponds to the morse simbol
                englishPhrase.append((char)(index + diff));
            }
        }
         
        // return the english phrase
        return englishPhrase.toString();
    }
    public static void main (String[] args)
    {
        Morsie j25 = new Morsie();
        String englishPhrase = "Im domb";
        String morsePhrase = j25.englishToMorse(englishPhrase);
        System.out.println(morsePhrase);
        System.out.println(j25.morseToEnglish(morsePhrase));
         
    }
}