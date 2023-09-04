package model;

public class Book {
    private final int id;
    private String name;
    private String description;
    private String author;
    public String idInfo(){
        return  "-------------------------------------\n" +
                "Id: " + id + "\n" +
                "Name: " + name + "\n" +
                "Description: " + description +"\n" +
                "Author: " + author + "\n" +
                "-------------------------------------";
    }
    public Book(int id, String name, String description, String author){
        this.id = id;
        this.name = name;
        this.description = description;
        this.author = author;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
}
