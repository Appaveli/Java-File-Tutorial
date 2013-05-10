/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package filetutorial;

import java.lang.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author dominque
 */
public class FileTutorial {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input;

    public void getData() {
        try {
            File file = new File("FileTutorial.txt"); //creates new file
            FileWriter fstream = new FileWriter(file, true); // object created to write data to file
            BufferedWriter out = new BufferedWriter(fstream);
            System.out.println("Is the sky red? ");
            input = br.readLine();

            out.write(input);
            out.newLine();
            out.close();

        } catch (Exception ex) {
            System.out.println("Something is wrong, check you code or keyboard");

        }
        System.out.println("You said, " + input);


    }

    public static void main(String[] args) {
        FileTutorial ft = new FileTutorial();
        ft.getData();

    }
}
