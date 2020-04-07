package com.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class MusicPlayer {

	// Create a Song class having Title and Duration for a song.
	// The program will have an Album class containing a list of songs.
	// The albums will be stored in an ArrayList
	// Songs from different albums can be added to the playlist and will appear in
	// the list in the order
	// they are added.
	// Once the songs have been added to the playlist, create a menu of options to:-
	// Quit,Skip forward to the next song, skip backwards to a previous song. Replay
	// the current song.
	// List the songs in the playlist
	// A song must exist in an album before it can be added to the playlist (so you
	// can only play songs that
	// you own).
	// Hint: To replay a song, consider what happened when we went back and forth
	// from a city before we
	// started tracking the direction we were going.
	// As an optional extra, provide an option to remove the current song from the
	// playlist
	// (hint: listiterator.remove()

	//private static ArrayList<Album> albums = new ArrayList<Album>();
	private static List<Album> albums = new ArrayList<Album>();

	public static void main(String[] args) {

		Album album = new Album("Deep bass", "lany");

		album.addSong("angle eyes", 4.51);
		album.addSong("In the end", 3.29);
		album.addSong("Mean it", 4.4);
		album.addSong("Thick and thin", 5.5);
		album.addSong("Disco nights", 3.5);
		album.addSong("Mailbu", 4.20);
		album.addSong("Tattoo togather", 4.55);
		albums.add(album);

		album = new Album("Sur", "Lucky Ali");
		album.addSong("o sanam", 3.45);
		album.addSong("janne kya ", 4.45);
		album.addSong("AA bhi ja", 3.21);
		album.addSong("Dekha hai aisa bhi", 4.10);
		album.addSong("Ek pal ka jeena ", 4.25);
		album.addSong("kitni haseen zindgi hai ye", 4.00);
		albums.add(album);

		//LinkedList<Song> playList = new LinkedList<Song>();
		List<Song> playList = new ArrayList<Song>();
		albums.get(0).addToPlayList("Mean it", playList);
		albums.get(0).addToPlayList("In the end", playList);
		albums.get(0).addToPlayList("Tattoo ", playList);

		albums.get(1).addToPlayList(2, playList);
		albums.get(1).addToPlayList("Ek pal ka jeena ", playList);
		albums.get(1).addToPlayList(5, playList);
		albums.get(1).addToPlayList(1, playList);
		albums.get(1).addToPlayList(24, playList);

		play(playList);

	}

	// private static void play(LinkedList<Song> playList) {
	private static void play(List<Song> playList) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;
		ListIterator<Song> listIterator = playList.listIterator();
		if (playList.size() == 0) {
			System.out.println("No songs in playlist");
			return;
		} else {
			System.out.println("Now playing " + listIterator.next().toString());
			printMenu();
		}

		while (!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();

			switch (action) {
			case 0:
				System.out.println("Playlist complete.");
				quit = true;
				break;
			case 1:
				if (!forward) {
					if (listIterator.hasNext()) {
						listIterator.next();
					}
					forward = true;
				}
				if (listIterator.hasNext()) {
					System.out.println("Now playing " + listIterator.next().toString());
				} else {
					System.out.println("We have reached the end of the playlist");
					forward = false;
				}
				break;

			case 2:
				if (forward) {
					if (listIterator.hasPrevious()) {
						listIterator.previous();
					}
					forward = false;
				}
				if (listIterator.hasPrevious()) {
					System.out.println("Now playing " + listIterator.previous().toString());
				} else {
					System.out.println("We are at the start of the playlist");
					forward = true;
				}
				break;
			case 3:
				if (forward) {
					if (listIterator.hasPrevious()) {
						System.out.println("Now replaying " + listIterator.previous().toString());
						forward = false;
					} else {
						System.out.println("We are at the start of the list");
					}
				} else {
					if (listIterator.hasNext()) {
						System.out.println("Now replaying " + listIterator.next().toString());
						forward = true;
					} else {
						System.out.println("We have reached the end of the list");
					}
				}
				break;
			case 4:
				printList(playList);
				break;
			case 5:
				printMenu();
				break;

			case 6:
				if (playList.size() > 0) {
					listIterator.remove();
					if (listIterator.hasNext()) {
						System.out.println("Now playing " + listIterator.next());
					} else if (listIterator.hasPrevious()) {
						System.out.println("Now playing " + listIterator.previous());
					}
				}
				break;

			}
		}
	}

	private static void printMenu() {
		System.out.println("Available actions:\npress");
		System.out.println("0 - to quit\n" + "1 - to play next song\n" + "2 - to play previous song\n"
				+ "3 - to replay the current song\n" + "4 - list songs in the playlist\n"
				+ "5 - print available actions.\n" + "6 - delete current song from playlist");

	}

	// private static void printList(LinkedList<Song> playList) {
	private static void printList(List<Song> playList) {
		Iterator<Song> iterator = playList.iterator();
		System.out.println("================================");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("================================");
	}

}
