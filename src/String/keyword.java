package String;

public class keyword {
    public static void main(String[] args) {
        String s = "10#11#12";
        StringBuilder decodedString = new StringBuilder();

        for (int i = 0; i < s.length(); ) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                // Convert the two-digit number before '#' to a letter
                int num = Integer.parseInt(s.substring(i, i + 2));
                decodedString.append((char) ('a' + num - 1));
                i += 3; // Move past the current number and '#'
            } else {
                // Convert the single-digit number to a letter
                int num = s.charAt(i) - '0';
                decodedString.append((char) ('a' + num - 1));
                i++;
            }
        }

        System.out.println(decodedString.toString());
    }
}
