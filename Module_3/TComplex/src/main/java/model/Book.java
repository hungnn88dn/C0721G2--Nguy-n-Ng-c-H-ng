package model;

public class Book {
    private String id;
    private String name;
    private String author;
    private int amount;
    private String descripton;

    public Book(String id, String name, String author, int amount, String descripton) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.amount = amount;
        this.descripton = descripton;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }
}
