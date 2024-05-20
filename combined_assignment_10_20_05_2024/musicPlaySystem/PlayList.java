package musicPlaySystem;

import java.util.Scanner;

public class PlayList {

    public static Scanner sc = new Scanner(System.in);

    public Song insertAtIndex(Song head, int index, String musicFileName) {
        Song newSong = new Song(musicFileName);

        if (index == 0) {
            newSong.next = head;
            return newSong;
        }

        Song prev = null;
        Song current = head;
        int count = 0;
        while (current != null && count < index) {
            prev = current;
            current = current.next;
            count++;
        }

        if (count == index) {
            prev.next = newSong;
            newSong.next = current;
        }

        return head;
    }

    public Song deleteAtIndex(Song head, int index) {
        if (head == null || index < 0) {
            return head;
        }

        if (index == 0) {
            return head.next;
        }

        Song prev = null;
        Song current = head;
        int count = 0;

        while (current != null && count < index) {
            prev = current;
            current = current.next;
            count++;
        }

        if (count == index && current != null) {
            prev.next = current.next;
        }

        return head;
    }

    public void printList(Song head) {
        Song current = head;

        if (head == null) {
            System.out.println("No music found :(");
        }

        while (current != null) {
            System.out.println(current.FileName);
            current = current.next;
        }
    }
}