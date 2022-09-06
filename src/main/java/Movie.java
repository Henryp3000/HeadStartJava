public class Movie {
    String title;
    String genre;
    int rating;


}

//     Constructor template for making Movie an object in main
    public Movie (String title, String genre, int rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public void printTitleInfo(){
        System.out.println( this.title + "\n" + this.genre + "\n" + this.rating + "/n");


        }

    }
    public Void playIt(){
            System.out.println("Play the movie");


            }
