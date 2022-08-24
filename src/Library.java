public class Library {
    public static void main(String[] args) {

        //instantiate a Book Object
        Book Book1 = new Book("Learning Java",
                new Author("Bob Smith", "bobthegreat@gmail.com", 'M'),
                14.99,10 );

        Book Book2 = new Book("Baking Java",
                new Author("Jim Carrey", "jimmy@gmail.com", 'M'),
                12.99,18 );

        //display Book objects;
        System.out.println("The current inventory is: " ) ;
        System.out.println(Book1.getName() + ", by " + Book1.getAuthor().toString() +
                ", priced at £" + Book1.getPrice() + ", " + Book1.getQty() +" pieces in stock.");
        //get.Author().toString() calls the Author's toString() method, displaying the details as a string

        System.out.println(Book2.getName() + ", by " + Book2.getAuthor().toString() +
                ", priced at £" + Book2.getPrice() + ", " + Book2.getQty() +" pieces in stock.");


    }
}
