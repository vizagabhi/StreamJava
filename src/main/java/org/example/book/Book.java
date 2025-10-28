package org.example.book;

public class Book {
    private String btitle;
    private int bprice;
    private String bcategory;
    private String bauthor;
    private int launchYear;

    public Book(String bname, int bprice, String bcategory, String bauthor, int launchYear) {
        this.btitle = bname;
        this.bprice = bprice;
        this.bcategory = bcategory;
        this.bauthor = bauthor;
        this.launchYear = launchYear;
    }

    public Book() {
    }

    public String getBname() {
        return btitle;
    }

    public void setBname(String bname) {
        this.btitle = bname;
    }

    public int getBprice() {
        return bprice;
    }

    public void setBprice(int bprice) {
        this.bprice = bprice;
    }

    public String getBcategory() {
        return bcategory;
    }

    public void setBcategory(String bcategory) {
        this.bcategory = bcategory;
    }

    public String getBauthor() {
        return bauthor;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "btitle='" + btitle + '\'' +
                ", bprice=" + bprice +
                ", bcategory='" + bcategory + '\'' +
                ", bauthor='" + bauthor + '\'' +
                ", launchYear=" + launchYear +
                '}';
    }
}
