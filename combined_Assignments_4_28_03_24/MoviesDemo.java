class Movie {
    String title;
    int durationInMinutes;

    public Movie(String title, int durationInMinutes) {
        this.title = title;
        this.durationInMinutes = durationInMinutes;
    }

    public void display() {
        System.out.println("Movie Details...");
        System.out.println("Title: " + title);
        System.out.println("Duration: " + durationInMinutes + " minutes");
    }

}

class RomComMovie extends Movie {
    int ticketsSold;

    public RomComMovie(String title, int durationInMinutes, int ticketsSold) {
        super(title, durationInMinutes);
        this.ticketsSold = ticketsSold;
    }

    public void display() {
        super.display();
        System.out.println("RomComMovie " + title + "'s profit is Rupees " + (ticketsSold * 150));
    }

}

class ThrillerMovie extends Movie {
    int budget;

    public ThrillerMovie(String title, int durationInMinutes, int budget) {
        super(title, durationInMinutes);
        this.budget = budget;
    }

    public void display() {
        super.display();
        System.out.println("RomComMovie " + title + "'s budget is Rupees " + budget);
    }

}

public class MoviesDemo {
    public static void main(String args[]) {
        Movie m1 = new RomComMovie("Oh My Kadavulae", 146, 15056);
        m1.display();
        m1 = new ThrillerMovie("Kaithi", 140, 25000000);
        m1.display();
    }
}
