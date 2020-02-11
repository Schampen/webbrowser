import java.net.URL;
import javax.swing.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class urlreader {
    public static void main(String[] args) {
        String url = JOptionPane.showInputDialog(null, "where?","Buppen Inc",JOptionPane.QUESTION_MESSAGE);
        try {
            URL resource = new URL(url);
            Scanner urlScanner = new Scanner(resource.openStream());
            while (urlScanner.hasNext()) {
                String line = urlScanner.nextLine();
                if (line.contains("a href")) {
                    int start = line.indexOf("href") + 6;
                    int stop = line.indexOf("\"",line.indexOf("href") + 6);
                    String link = line.substring(start,stop);
                    System.out.println(line);
                    System.out.println(link);

                    int start2 = line.indexOf(">") + 1;
                    int stop2 = line.indexOf("<", line.indexOf(">"));
                    String name = line.substring(start2,stop2);
                    System.out.println(name);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

