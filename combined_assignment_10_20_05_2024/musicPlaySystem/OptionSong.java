package musicPlaySystem;

import java.util.Scanner;

public class OptionSong {
	private Scanner scanner = new Scanner(System.in);
	private final byte VIEW=2;
	private final byte ADD=1;
	private final byte DELETE=3;
	private final byte EXIT=0;
	private PlayList songList = new PlayList();
	private Song head = null;
	private int count = 0;

	public void init() {

		System.out.println();
		System.out.println(VIEW+" -> view all the music 🎼");
		System.out.println(ADD+" -> add a song at a specific place ");
		System.out.println(DELETE+" -> delete a song at specific place");
		System.out.println(EXIT+" -> Exit ");

		System.out.print("\nEnter your choice: ");
		byte choice = scanner.nextByte();
		System.out.println();
		
		if(choice==VIEW) {
			songList.printList(head);
		}
		else if(choice==ADD) {
			head = add(count, head, songList);
			count++;
		}
		else if(choice==DELETE) {
			head = delete(count, head, songList);
			count--;
		}
		else if(choice==EXIT) {
			System.out.println("Thank You");
			scanner.close();
			System.exit(0);
		}
		else {
			System.out.println("Invalid choice. Try again.");
		}
		init();
	}

	public int getIndex(String info) {
		System.out.print("Enter the index where you want to " + info + ": ");
		return scanner.nextInt();
	}

	public String getMusicName() {
		System.out.print("Enter the name of the music file you want to add: ");
		scanner.nextLine();
		return scanner.nextLine();
	}

	public Song add(int count, Song head, PlayList songList) {
		int index = getIndex("insert");
		if (index < 0 || index > count) {
			System.out.println("Index is out of bounds. Can not add.");
			return head;
		} else {
			head = songList.insertAtIndex(head, index, getMusicName());
			System.out.println("\nSong added successfully.");
			System.out.println("There are now " + (++count) + " songs in the playlist.\n");
			return head;
		}
	}

	public Song delete(int count, Song head, PlayList songList) {
		int index = getIndex("delete");
		if (index < 0 || index > count) {
			System.out.println("Index is out of bounds. Can not delete.");
			return head;
		} else {
			head = songList.deleteAtIndex(head, index);
			System.out.println("\nSong deleted successfully.");
			System.out.println("There are now " + (--count) + " songs in the playlist\n");
			return head;
		}
	}
}
}
