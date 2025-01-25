public class Movie {
    String title;
    String studio;
    String rating;
    Movie(String title,String studio, String rating){
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }
    Movie (String title, String studio){
        this.title=title;
        this.studio=studio;
        this.rating="PG";

    }
    public String toString(){
        return "Фильм: " + title + ", Студия" + studio + ", Рейтинг " + rating;
    }
}
