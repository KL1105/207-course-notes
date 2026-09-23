/**
 * Exercise (Chapter 1: Introduction to Java) — Strings and StringBuilder.
 *
 * Complete {@link #firstLetters(String)} below.
 *
 *
 * Relevant reading: 1.4. Strings and 1.4.4. StringBuilder.
 */
public class FirstLetters {

    public static void main(String[] args) {
        String phrase = "Idol Long Oolong Vertical Europe University Toyota";
        // Should print ILOVEUT once firstLetters is implemented.
        System.out.println("First letters of \"" + phrase + "\": " + firstLetters(phrase));
    }

    /**
     * Given a string of words separated by single spaces, returns a new string
     * made of the first character of each word, in order. You may assume the
     * input contains at least one word.
     *
     * Example: {@code firstLetters("Good Morning")} returns {@code "GM"}.
     *
     * @param words a non-empty string of words separated by single spaces
     * @return the first character of each word, concatenated
     */
    public static String firstLetters(String words) {
        if (words.isEmpty()) {
            return "";
        } else if (words.length() == 1) {
            return words.toUpperCase();
        } else {
            StringBuilder concat = new StringBuilder();
            concat.append(words.charAt(0)); // get the first character

            for (int i = 0; i < words.length(); i++) {
                char c = words.charAt(i);
                if (c == ' ') {
                    concat.append(words.charAt(i+1));
                }
            }
            return concat.toString();
        }

    }
}
