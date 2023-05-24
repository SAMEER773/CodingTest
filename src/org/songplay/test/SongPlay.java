package org.songplay.test;

import java.util.Arrays;
import java.util.Scanner;

public class SongPlay {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("please enter the song name ex:- s1,s2,s3,s4");
			String[] a = { "s1", "s2", "s3", "s4" };
			String[] playlist = new String[3];
			while (true) {
				String song = sc.nextLine();
				if (song.equalsIgnoreCase("s3")) {
					System.out.println(Arrays.toString(playlist));
				}
				// if we played song 4 s2,s3,s4
				else if (song.equalsIgnoreCase("s4")) {

					playlist[0] = a[1];
					playlist[1] = a[2];
					playlist[2] = a[3];
					System.out.println(Arrays.toString(playlist));
				}
				// if we played song s2 s3,s4,s2
				else if (song.equalsIgnoreCase("s2")) {
					playlist[0] = a[2];
					playlist[1] = a[3];
					playlist[2] = a[1];
					System.out.println(Arrays.toString(playlist));
				}
				// if we played song s1 s4.s2,s1
				else if (song.equalsIgnoreCase("s1")) {
					playlist[0] = a[3];
					playlist[1] = a[1];
					playlist[2] = a[0];
					System.out.println(Arrays.toString(playlist));
				} else if (song.equalsIgnoreCase("1")) {
					break;
				}
			}
		}

	}
}