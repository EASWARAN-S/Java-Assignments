abstract class Movie {
    String title;
    int durationInMinutes;

    public Movie(String title, int durationInMinutes) {
        this.title = title;
        this.durationInMinutes = durationInMinutes;
    }

    abstract public void display();

    abstract public void getDetails();
}

class RomComMovie extends Movie {
    int ticketsSold;

    public RomComMovie(String title, int durationInMinutes, int ticketsSold) {
        super(title, durationInMinutes);
        this.ticketsSold = ticketsSold;
    }

    public void display() {

        System.out.println("RomComMovie " + title + "'s profit is Rupees " + (ticketsSold * 150));
    }

    public void getDetails() {
        System.out.println("Title of the Movie is " + title);
        System.out.println("Film Duration is " + durationInMinutes);
        System.out.println("Tickets sold is " + ticketsSold);
    }
}

class ThrillerMovie extends Movie {
    int budget;

    public ThrillerMovie(String title, int durationInMinutes, int budget) {
        super(title, durationInMinutes);
        this.budget = budget;
    }

    public void display() {

        System.out.println("Thriller Movie " + title + "'s budget is Rupees " + budget);
    }

    public void getDetails() {
        System.out.println("Title of the Movie is " + title);
        System.out.println("Film Duration is " + durationInMinutes);

    }

}

public class MoviesDemo {
    public static void main(String args[]) {
        Movie m1 = new RomComMovie("Oh My Kadavulae", 146, 15056);
        m1.display();
        m1.getDetails();
        m1 = new ThrillerMovie("Kaithi", 140, 25000000);
        m1.display();
        m1.getDetails();
    }
}
