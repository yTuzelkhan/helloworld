public class Book {
    private int id;
    private static int idGen=1;
    private String title;
    private String author;
    private int year;
    private boolean available;




    public Book(){
        id = idGen++;
        available = true;
    }




    public Book(String title, String author, int year) {
        this();
        setter(title,author,year);
    }




    public void setter(String title, String author, int year) {
        if(title==null||author==null|| year<1500 || year>2025){
            throw new IllegalArgumentException("invalid title or author or the year");
        }
        this.title = title;
        this.author = author;
        this.year = year;
    }




    public void markAsBorrowed(){
        available = false;
    }




    public int getId(){
        return id;
    }




    public int getYear(){
        return year;
    }




    public String getTitle(){
        return title;
    }




    public String getAuthor(){
        return author;
    }




    public boolean available1(){
        return available;
    }




    public void markAsReturned(){
        available = true;
    }




    @Override
    public String toString() {
        return "id:" + id + "\ntitle:" + title + "\nauthor:" + author + "\nyear:" + year + "\navailable:" + available;
    }
}
