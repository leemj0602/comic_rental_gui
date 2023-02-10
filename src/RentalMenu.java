
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author leemj
 */
public class RentalMenu {

    public static void main(String[] args) {
        RentalSystem rs = new RentalSystem();
        List comics = rs.comic();
        List rentees = rs.rentee();

        Comic comic = (Comic) comics.get(1);
        Rentee rentee = (Rentee) rentees.get(1);

//        System.out.println(comic.getTitle());
//        for (int i = 0; i < rentee.getComicsISBN().length; i++) {
//            System.out.println(rentee.getComicsISBN()[i]);
//        }
//        for (int i = 0; i < comics.size(); i++) {
//            Comic c = (Comic) comics.get(i);
//            for (int j = 0; j < rentees.size(); j++) {
//                Rentee r = (Rentee) rentees.get(i);
//                for (int k = 0; k < rentee.getComicsISBN().length; k++){
//                    if (r.getComicsISBN()[i].equals(c.getIsbn13())) {
//                        System.out.println(r.getComicsISBN()[i]);
//                        System.out.println(c.getIsbn13());
//                    }
//                }
//            }
//        }
        for (int h = 0; h < rentees.size(); h++) {
            Rentee r = (Rentee) rentees.get(h);
            for (int i = 0; i < comics.size(); i++) { //loop through comic object array
                Comic c = (Comic) comics.get(i);
                for (int j = 0; j < r.getComicsISBN().length; j++) { //loop through rentee object comicISBN array
                    if (c.getIsbn13().equals(r.getComicsISBN()[j])) {
                        System.out.print(r.getName());
                        System.out.print(r.getComicsISBN()[j]);
                        System.out.print(c.getTitle());
                        System.out.println("\n");
                    }
                }
            }
        }
    }
}
