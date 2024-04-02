interface Playable {
    public void pause();

    public void play();

    public void stop();
}

class CdPlayer implements Playable {
    public void pause() {
        System.out.println("CdPlayer is paused");
    }

    public void play() {
        System.out.println("CdPlayer is playing");
    }

    public void stop() {
        System.out.println("CdPlayer is stopped");
    }
}

class Mp3Player implements Playable {
    public void pause() {
        System.out.println("MP3Player is paused");
    }

    public void play() {
        System.out.println("MP3Player is playing");
    }

    public void stop() {
        System.out.println("MP3Player is stopped");
    }
}

class StreamingPlayer implements Playable {
    public void pause() {
        System.out.println("StreamingPlayer is paused");
    }

    public void play() {
        System.out.println("StreamingPlayer is playing");
    }

    public void stop() {
        System.out.println("StreamingPlayer is stopped");
    }
}

public class Musicmain {
    public static void main(String[] args) {
        CdPlayer cd = new CdPlayer();
        cd.pause();
        cd.play();
        cd.stop();
        Mp3Player mp = new Mp3Player();
        mp.pause();
        mp.play();
        mp.stop();
        StreamingPlayer sp = new StreamingPlayer();
        sp.pause();
        sp.play();
        sp.stop();
    }
}