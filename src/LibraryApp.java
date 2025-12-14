import java.util.ArrayList;
import java.util.Scanner;




public class LibraryApp {
    public ArrayList<Book> books = new ArrayList<>();
    Scanner cin = new Scanner(System.in);




    public void run(){
      while(true){
          System.out.println(" Welcome to Library App!\n" +
                          "1. Print all books\n" +
                          "2. Add new book\n" +
                          "3. Search books by title\n" +
                          "4. Borrow a book\n" +
                          "5. Return a book\n" +
                          "6. Delete a book by id\n" +
                          "7. Quit "
                  );
          int choice = cin.nextInt();
          cin.nextLine();

          switch(choice){
              case 1:
                  if(books.size()==0)System.out.println("No books in the library;");
                  else{
                      for(int i=0;i<books.size();i++){System.out.println((i+1)+"."+books.get(i).toString());}
                  }
                  break;

               case 2:
                   System.out.print("Enter title: ");
                   String title = cin.nextLine();
                   System.out.print("Enter author: ");
                   String author = cin.nextLine();
                   System.out.print("Enter year: ");
                   int year  = cin.nextInt();
                   cin.nextLine();
                   Book b = new Book(title, author, year);
                   books.add(b);
                   System.out.println("Book added!");
                   break;

              case 3:
                  System.out.print("Enter part of the title: ");
                  String search = cin.nextLine().toLowerCase();
                  boolean found = false;
                  for (Book b1 : books) {
                      if (b1.toString().toLowerCase().contains(search)) {
                          System.out.println(b1.toString());
                          found = true;
                      }
                  }
                  if (!found) {
                      System.out.println("No matching books found.");
                  }
                  break;

              case 4:
                  System.out.print("Enter id: ");
                  int id = cin.nextInt();
                  cin.nextLine();
                  boolean found4 = false;
                  for (Book b2 : books) {
                      if (b2.getId() == id) {
                          found4 = true;
                          if (b2.available1()) {
                              b2.markAsBorrowed();
                              System.out.println("Book borrowed!");
                          } else {
                              System.out.println("Book is already borrowed.");
                          }
                          break;
                      }
                  }
                  if(!found4)System.out.println("Book not found.");
                  break;

              case 5:
                  System.out.print("Enter id: ");
                  int id1  = cin.nextInt();
                  cin.nextLine();
                  boolean found5 = false;
                  for (Book b3 : books) {
                      if (b3.getId() == id1) {
                          found5 = true;
                          if(!b3.available1()){
                              b3.markAsReturned();
                              System.out.println("Book returned!");
                          } else {
                              System.out.println("This book was not borrowed.");
                          }
                          break;
                      }
                  }
                  if(!found5)System.out.println("Book not found.");
                  break;

              case 6:
                  System.out.print("Enter id: ");
                  int id3  = cin.nextInt();
                  cin.nextLine();
                  boolean found6 = false;
                  for (Book b4 : books) {
                      if (b4.getId() == id3) {
                          found6 = true;
                          books.remove(b4);
                          System.out.println("Book deleted!");
                          break;
                      }
                  }
                  if(!found6)System.out.println("Book not found.");
                  break;

              case 7:
                  System.out.print("GOOD BYE !!!! ");
                  return ;
          }
      }
    }




    public static void main(String[] args) {
        new LibraryApp().run();
    }
}
