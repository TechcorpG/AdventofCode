package day1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class solution {

    public static void s1() throws FileNotFoundException {

        Scanner in = new Scanner(new File("src/day1/input.txt"));
        int ges = 0;

        while(in.hasNext()){
            String temp = in.nextLine();
            Pattern pattern = Pattern.compile("\\d");
            Matcher matcher = pattern.matcher(temp);

            int first = 0;
            int second = 0;

            if(matcher.find())
                first = Integer.parseInt(String.valueOf(temp.charAt(matcher.start())));

            int cc=0;
            while(matcher.find()){
                second = Integer.parseInt(String.valueOf(temp.charAt(matcher.start())));
                cc++;
            }

            if(cc==0)
                second = first;

            int num = Integer.parseInt(String.valueOf(first) + String.valueOf(second));

            ges = ges + num;

            System.out.println("Ziffer: " + num);
        }

        System.out.println("Das Ergebnis ist: " + ges + "!");
    }

    public static void s2() throws FileNotFoundException {

        Scanner in = new Scanner(new File("src/day1/input.txt"));
        int ges = 0;

        while(in.hasNext()){
            String temp = in.nextLine();
            Pattern pat_num = Pattern.compile("\\d");
            Matcher mat_num = pat_num.matcher(temp);
            Pattern pat_word = Pattern.compile("one|two|three|four|five|six|seven|eigth|nine");
            Matcher mat_word = pat_word.matcher(temp);

            int first = 0;
            int second = 0;

            if(mat_num.find() || mat_word.find())
                first = Integer.parseInt(String.valueOf(temp.charAt(mat_num.start())));
            

            int cc=0;
            while(mat_num.find()){
                second = Integer.parseInt(String.valueOf(temp.charAt(mat_num.start())));
                cc++;
            }

            if(cc==0)
                second = first;

            int num = Integer.parseInt(String.valueOf(first) + String.valueOf(second));

            ges = ges + num;

            System.out.println("Ziffer: " + num);
        }

        System.out.println("Das Ergebnis ist: " + ges + "!");
    }

    public static void main(String[] args) throws FileNotFoundException {

        s1();
        s2();

    }
}