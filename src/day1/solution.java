package day1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(new FileReader("input.txt"));

        while(in.hasNext()){
            String temp = in.nextLine();
            int max = temp.length();
            Pattern pattern = Pattern.compile("\\d");

            for(int i=0;i<max;i++){
                char c = temp.charAt(i);

                Matcher matcher = pattern.matcher(String.valueOf(c));

            }

            while(matcher.find()){
                
            }


        }

    }
}