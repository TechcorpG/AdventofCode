package day2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class solution {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(new File("src/day2/input.txt"));

        Pattern pat_num = Pattern.compile("\\d+");
        Pattern pat_rgb = Pattern.compile("red|green|blue");

        int ges=0;

        int red = 12;
        int green = 13;
        int blue = 14;

        while(in.hasNext()){
            String temp = in.nextLine();
            Matcher mat_num = pat_num.matcher(temp);
            Matcher mat_rgb = pat_rgb.matcher(temp);
            int game_num = 0;
            boolean bool = true;

            if(mat_num.find())
                game_num = Integer.valueOf(String.valueOf(temp.charAt(mat_num.start())));

            while(mat_num.find()){
                mat_rgb.find();
                int num = 0;
                for(int i = mat_num.start(); i < mat_num.end(); i++)
                    num = Integer.valueOf(String.valueOf(num) + String.valueOf(temp.charAt(i)));
                char col = temp.charAt(mat_rgb.start());
                if(col == 'r' && num > red)
                    bool = false;
                else if(col == 'g' && num > green)
                    bool = false;
                if(col == 'b' && num > blue)
                    bool = false;
            }

            if(bool) {
                ges = ges + game_num;
                System.out.println("Das Spiel kann durchgeführt werden!");
            }
        }

        System.out.println("Die Addition der Spielnummern beträgt: " + ges + "!");

    }
}