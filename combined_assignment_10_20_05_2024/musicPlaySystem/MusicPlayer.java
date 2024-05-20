package musicPlaySystem;

public class MusicPlayer {

    public void start() {
        System.out.println("Welcome to  Playlist");
        new OptionSong().init();
    }

    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();
        mp.start();
    }
}
