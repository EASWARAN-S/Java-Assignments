public class Player {
    private String name;
    private String position;
    private int jerseyNumber;

    public void playGame() {
        System.out.println(name + "is playing the Game");
    }

    public void train() {
        System.out.println(name + "is under Training");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }
}
