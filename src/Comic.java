/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leemj
 */
public class Comic {

    //data fields
    private String isbn13, title, type, language;
    private int pages;
    private double cost;

    //constructor
    public Comic(String isbn13, String title, int pages, double cost, String type, String language) {
        this.isbn13 = isbn13;
        this.title = title;
        this.pages = pages;
        this.cost = cost;
        this.type = type;
        this.language = language;
    }

    //start of getters, setters
    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    //end of getters, setters

    //daily rental
    public double getPricePerDay() {
        return this.cost / 20;
    }

    //deposit
    public double getDeposit() {
        return this.cost * 11 / 10;
    }

    public String information() {
        String information = "";
        if (this.type.equals("Manga")) {
            information += "This is a Manga";
        }
        else{
            information += "This is a Comic in English";
        }
        return information;
    }
}
