public class Permutations {
    public static void generatePermutations(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);  // Pick a character
            String rest = str.substring(0, i) + str.substring(i + 1); // Remove it from string
            
            generatePermutations(rest, result + ch); // Recursive call
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        generatePermutations(str, "");
    }
}
