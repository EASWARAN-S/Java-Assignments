
public class Team {
    private Player player;
    private String name;
    private String city;
    private String division;

    public Team(String name, String city, String division, Player player) {
        this.name = name;
        this.city = city;
        this.division = division;
        this.player = player;
    }

    public Player getPlayer() {
        return this.player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDivision() {
        return this.division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public void playGame() {
        System.out.println(name + "is playing the Game");
    }

    public void hireCoach() {

        System.out.println("Team " + name + " is hiring a coach.");
    }
}