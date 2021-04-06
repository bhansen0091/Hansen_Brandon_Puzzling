import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;


public class PuzzleJava {

    public ArrayList printSumReturnGreat10(String str) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        ArrayList<Integer> resultArr = new ArrayList<Integer>();
        String[] newStrArr = str.split(",");
        int sum = 0;
        for (var i = 0; i < newStrArr.length; i++) {
            int intConvert = Integer.parseInt(newStrArr[i]);
            if (intConvert > 10) {
                resultArr.add(intConvert);
                newArr.add(intConvert);
            }
            newArr.add(intConvert);
            sum += intConvert;
        }
        System.out.println("Sum: %d".formatted(sum));
        return resultArr;
    }

    public String getChoice(String[] choices) {
        Random r = new Random();
        int index = r.nextInt(choices.length);
        return choices[index];
    }

    public ArrayList namesLongerThan5(String[] names) {
        ArrayList<String> newStrArr = new ArrayList<String>();
        ArrayList<String> namesArr = new ArrayList<String>();
        for (String name : names) {
            if (name.length() > 5) {
                newStrArr.add(name);
            }
        }
        while (namesArr.size() < names.length) {
            for (var i = 0; i < names.length; i++) {
                String randomName = getChoice(names);
                if (!namesArr.contains(randomName)) {
                    namesArr.add(randomName);
                }
            }
        }
        System.out.println(namesArr);
        return newStrArr;
    }

    public void alphabetArray(String str) {
        ArrayList<Character> charArrList = new ArrayList<Character>();
        char[] charArr = str.toCharArray();
        for (char c : charArr) {
            charArrList.add(c);
        }

        System.out.println("Pre-Shuffle: " + charArrList);
        Collections.shuffle(charArrList);
        System.out.println("Post-Shuffle: " + charArrList);
        
        char firstChar = charArrList.get(0);
        char lastChar = charArrList.get(charArrList.size()-1);

        System.out.println("FirstChar: %c | LastChar: %c".formatted(firstChar, lastChar));

        if (firstChar == 'a' || 
            firstChar == 'e' || 
            firstChar == 'i' ||
            firstChar == 'o' || 
            firstChar == 'u') {
            System.out.println("The first char is a vowel.");
        }
    }

    public int[] randomInt(int min, int max) {
        Random randomInt = new Random();
        int[] newArr = new int[10];

        for (var i = 0; i < newArr.length; i++) {
            int newRandInt = randomInt.nextInt((max-min) + 1) + min;
            newArr[i] = newRandInt;
        }
        return newArr;
    }
    
    public int[] randomIntSorted(int min, int max) {
        Random randomInt = new Random();
        int[] newArr = new int[10];
        for (var i = 0; i < newArr.length; i++) {
            int newRandInt = randomInt.nextInt((max-min) + 1) + min;
            newArr[i] = newRandInt;
        }
        Arrays.sort(newArr);
        System.out.printf("Sorted Array: %s | Min: %d | Max: %d", 
            Arrays.toString(newArr),
            newArr[0],
            newArr[newArr.length-1]);
        return newArr;
    }

    public String[] fiveCharString(int times) {
        String[] alphabetArr = {
            "a","b","c","d","e","f","g","h",
            "i","j","k","l","m","n","o","p",
            "q","r","s","t","u","v","w","x",
            "y","z"};
        Random r = new Random();
        String[] newStrArr = new String[times];

        for (var t = 0; t < times; t++) {
            String newStr = "";
            for (var i = 0; i < 5; i++) {
                int randomInt = r.nextInt(alphabetArr.length);
                newStr += alphabetArr[randomInt];
            }
            newStrArr[t] = newStr;
        }
        System.out.println("\nStringArray: " + Arrays.toString(newStrArr));
        return newStrArr;
    }

}