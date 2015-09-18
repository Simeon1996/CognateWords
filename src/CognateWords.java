import java.util.HashSet;
import java.util.Scanner;

public class CognateWords {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        String[] input = reader.nextLine().split("[^a-zA-Z]+");

        HashSet<String> cognateWords = new HashSet<>();

        Integer counter = 0;

        for(Integer firstWord = 0; firstWord < input.length;firstWord++) {
            for (Integer secondWord = 0; secondWord < input.length; secondWord++) {
                for (Integer thirdWord = 0; thirdWord < input.length; thirdWord++) {
                    if (input[firstWord] != input[secondWord] && input[firstWord] != input[thirdWord]
                            && input[secondWord] != input[thirdWord]) {
                        String concatenatedWord = input[firstWord] + "" + input[secondWord];
                        String wordPattern = input[thirdWord];

                        if (concatenatedWord.equals(wordPattern)) {
                            String output = String.format("%s|%s=%s", input[firstWord], input[secondWord], input[thirdWord]);

                            cognateWords.add(output);
                            counter++;
                        }
                    }
                }
            }
        }
        for (String word : cognateWords) {
            System.out.println(word);
        }

        if(counter == 0){
            System.out.println("No");
        }
    }
}
