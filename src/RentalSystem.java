
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author leemj
 */
public class RentalSystem {

    private List comicList = new ArrayList(); //dynamic array
    private List renteeList = new ArrayList(); //dynamic array
    private List mangaList = new ArrayList(); //dynamic array

    public List comic() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("comics.txt"));

            String s;
            while ((s = br.readLine()) != null) {
//                System.out.println(s);
                String[] temp = s.split(";");
//                for (int i = 0; i < temp.length; i++){
//                    System.out.println(temp[i]);
//                }
                comicList.add(new Comic(temp[0], temp[1], Integer.parseInt(temp[2]), Double.parseDouble(temp[3]), temp[4], temp[5]));
            }
            br.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    null,
                    e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
        return comicList;
    }

    public List manga() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("comics.txt"));

            String s;
            boolean translated;
            while ((s = br.readLine()) != null) {
//                System.out.println(s);
                String[] temp = s.split(";");
//                for (int i = 0; i < temp.length; i++){
//                    System.out.println(temp[i]);
//                }
                translated = temp[5].equals("EN");

                mangaList.add(new Manga(temp[0], temp[1], Integer.parseInt(temp[2]), Double.parseDouble(temp[3]), temp[4], temp[5], translated));
            }
            br.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    null,
                    e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
        return mangaList;

    }

    public List rentee() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("rentees.txt"));

            String s;
            while ((s = br.readLine()) != null) {
//                System.out.println(s);
                String[] temp = s.split(";");
//                for (int i = 0; i < temp.length; i++){
//                    System.out.println(temp[i]);
//                }
                String[] comics = temp[2].split("#");
                renteeList.add(new Rentee(temp[0], temp[1], comics));
            }
            br.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    null,
                    e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
        return renteeList;
    }
}
