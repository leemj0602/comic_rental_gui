/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leemj
 */
public class Rentee {
        //data fields
    private String memberID, name;
    private String[] comicsISBN;

    public Rentee(String memberID, String name, String[] comicsISBN) {
        this.memberID = memberID;
        this.name = name;
        this.comicsISBN = comicsISBN;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getComicsISBN() {
        return comicsISBN;
    }

    public void setComicsISBN(String[] comicsISBN) {
        this.comicsISBN = comicsISBN;
    }
    
    
}
