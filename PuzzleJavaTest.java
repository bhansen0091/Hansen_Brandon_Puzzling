/**
 * PuzzleJavaTest
 */
public class PuzzleJavaTest {

    public static void main(String[] args) {
        PuzzleJava pj = new PuzzleJava();
        
        String testStr = "3,5,1,2,7,9,8,13,25,32";
        String[] testArrNames = {"Nancy", "Jinichi", "Fujibayashi", "Ishikawa"};
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        System.out.println(pj.printSumReturnGreat10(testStr));
        System.out.println(pj.namesLongerThan5(testArrNames));
        pj.alphabetArray(alphabet);
        pj.randomInt(55, 100);
        pj.randomIntSorted(55, 100);
        pj.fiveCharString(10);
    }
}