import java.util.Arrays;

public class LenghtOfLastWord {
    public static void main(String[] args) {

        String[] tab1 = new String[15];

        tab1[0] = "Everything is pointless";
        tab1[1] = "Maybe it will work";
        tab1[2] = "But I don't have much hope";
        String[] split = tab1[0].split(" ");
        String longestWord = null;

       // System.out.println(Arrays.toString(split));

        for(int i = 0; i < split.length; i++){
            for(int j = 1 + i; j < split.length; j++){
                if(split[i].length() >=split[j].length()){
                    longestWord = split[i];
                }
            }
        }

        System.out.println(longestWord);
    }
}
