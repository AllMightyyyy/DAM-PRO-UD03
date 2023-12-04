public class Book {
    private String title, author;
    private int availableCopies, copiesOnloan;

    public Book() {
    }

    public Book(String title, String author, int availableCopies, int copiesOnloan) {
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
        this.copiesOnloan = copiesOnloan;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    public int getCopiesOnloan() {
        return copiesOnloan;
    }

    public void setCopiesOnloan(int copiesOnloan) {
        this.copiesOnloan = copiesOnloan;
    }
    public boolean loan() {
        if(availableCopies > 0) {
            copiesOnloan++;
            availableCopies--;
            return true;
        } else {
            return false;
        }
    }
    public boolean returnCopy() {
        if(copiesOnloan > 0) {
            copiesOnloan--;
            availableCopies++;
            return true;
        } else {
            return false;
        }
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", availableCopies=" + availableCopies +
                ", copiesOnloan=" + copiesOnloan +
                '}';
    }
}
