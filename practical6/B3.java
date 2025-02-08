//Create a class which ask the user to enter a sentence, and it should display count of
//each vowel type in the sentence. The program should continue till user enters a word
//“quit”. Display the total count of each vowel for all sentences
package practical6;
import java.util.Scanner;
class VowelCounter{
    int tcountA=0, tcountE=0, tcountI=0, tcountO=0, tcountU=0;
    public void countVowels(String sentence){
        int countA=0, countE=0, countI=0, countO=0, countU=0;
        for(int i=0; i<sentence.length(); i++){
            if(sentence.toLowerCase().charAt(i) == 'a'){
                countA++;
                tcountA++;
            }
            else if(sentence.toLowerCase().charAt(i) == 'e'){
                countE++;
                tcountE++;
            }
            else if(sentence.toLowerCase().charAt(i) == 'i'){
                countI++;
                tcountI++;
            }
            else if(sentence.toLowerCase().charAt(i) == 'o'){
                countO++;
                tcountO++;
            }
            else if(sentence.toLowerCase().charAt(i) == 'u'){
                countU++;
                tcountU++;
            }
        }
        System.out.println("a: "+countA);
        System.out.println("e: "+countE);
        System.out.println("i: "+countI);
        System.out.println("o: "+countO);
        System.out.println("u: "+countU);
    }
    public void displayTotalCount(){
        System.out.println("a: "+tcountA);
        System.out.println("e: "+tcountE);
        System.out.println("i: "+tcountI);
        System.out.println("o: "+tcountO);
        System.out.println("u: "+tcountU);
    }
}
public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VowelCounter vc = new VowelCounter();
        while(true){
            System.out.print("Enter Sentence: ");
            String sentence = sc.nextLine();
            if(sentence.equalsIgnoreCase("quit")){
                break;
            }
            vc.countVowels(sentence);
        }
        vc.displayTotalCount();
    }
}
