package module_7;

public class Book {
    public String title = "Ngụy Trang Học Tra";
    public String author = "Mộc Qua Hoàng";
    public double price = 9999999;

    public void printInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.printInfo();
    }
}
