package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){
        String[] inputWords = input.split(" ");
        int hasYZ = 0;
        for (String word : inputWords) {
            char lastLetter = word.charAt(word.length() - 1);
            if (lastLetter == 'y' || lastLetter == 'z') {
                hasYZ++;
            }
        }
        return hasYZ;
        //double check the requirements for the method
        //return null;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){
        return base.replace(remove, "");
        //return null;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        int counter = 0;
        input = input.replace("is", " is ");
        input = input.replace("not", " not ");
        String[] inputWords = input.split(" ");
        for (String word : inputWords) {
            if (word.contains("is")) {
                counter++;
            }
            if (word.contains("not")) {
                counter--;
            }
        }
        return counter == 0; //counter == 0;
        //return null;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        int counter = 0;
        for (int i = 1; i <= input.length() - 1; i++) {
            char letterBefore = input.charAt(i - 1);
            if (input.charAt(i) == 'g' && letterBefore == 'g') {
                counter++;
            }
            if (input.charAt(i) == 'g' && letterBefore != 'g') {
                counter--;
            }
        }
        return counter == 0;
        //return null;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        int counter = 0;
        for (int i = 2; i <= input.length() - 1; i++) {
            char oneLetterBefore = input.charAt(i - 1);
            char twoLettersBefore = input.charAt(i - 2);
            if (input.charAt(i) == oneLetterBefore && input.charAt(i) == twoLettersBefore) {
                counter++;
            }
        }
        return counter;
        //return null;
    }
}
