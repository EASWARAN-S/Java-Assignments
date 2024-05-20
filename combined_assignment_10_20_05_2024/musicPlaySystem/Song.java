package musicPlaySystem;

public class Song {
    String FileName;
    Song next;

    public Song(String musicFileName) {
        this.FileName = musicFileName;
        this.next = null;
    }
}
