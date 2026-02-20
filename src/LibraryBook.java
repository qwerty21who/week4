 class LibraryBook {
    private String bookTitle="Unknown";
    private String author="Unknown";
    private int pages=1;


     public String getBookTitle() {
         return bookTitle;
     }

     public String getAuthor() {
         return author;
     }

     public int getPages() {
         return pages;
     }

     public void setBookTitle(String bookTitle) {
         this.bookTitle = bookTitle;
     }

     public void setAuthor(String author) {
         this.author = author;
     }

     public void setPages(int pages) {
         if (pages>0){
         this.pages = pages;}
     }
     boolean isThinck(){
         if (pages>500) return true;
         return false;
     }
 }
