import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ShortLister {
    public static void main(String[] args) {
        String currentDirectory = System.getProperty("user.dir");
        JFileChooser fileChooser = new JFileChooser(currentDirectory);
        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            try {
                Scanner scanner = new Scanner(selectedFile);
                Filter<String> shortWordFilter = new ShortWordFilter();

                while (scanner.hasNext()) {
                    String word = scanner.next();
                    if (shortWordFilter.accept(word)) {
                        System.out.println(word);
                    }
                }

                scanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
