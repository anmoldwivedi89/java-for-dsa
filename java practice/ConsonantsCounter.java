

public class ConsonantsCounter {
    public static void main(String[] args) {
        String str = "Hello World";
        int consonantCount = countConsonants(str);
        System.out.println("Number of consonants: " + consonantCount);
    }

    public static int countConsonants(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                count++;
            }
        }
        return count;
    }}

