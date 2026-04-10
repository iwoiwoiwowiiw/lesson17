package Task3;

public class FindRepeats {
    static int numberOfRepeats(String text, String substring) {
        int count = 0;
        StringBuilder sb = new StringBuilder(text);

        int index = sb.indexOf(substring);
        while (index != -1) {
            count++;
            sb.delete(0, index + substring.length());
            index = sb.indexOf(substring);
        }
        return count;
    }

    public static void outPut(){
        System.out.println(numberOfRepeats("paradisssse","s"));
    }
}
