/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leemj
 */
public class Manga extends Comic {

    private boolean translated;

    public Manga(String isbn13, String title, int pages, double cost, String type, String language, boolean translated) {
        super(isbn13, title, pages, cost, type, language);
        this.translated = translated;
    }

    public boolean isTranslated() {
        return translated;
    }

    public void setTranslated(boolean translated) {
        this.translated = translated;
    }

    public String mangaInformation() {
        String information = super.information();
        if (this.translated == true) {
            information += " translated to English";
        } else {
            information += " in Japanese";
        }
        return information;
    }
}
