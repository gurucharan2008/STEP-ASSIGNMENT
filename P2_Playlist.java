import java.util.Arrays;

/**
 * Week 7 - Problem 2: The Playlist
 * Defensive copy — never return the private array itself
 */
class Playlist {
    private String[] songs;
    private int songCount;

    public Playlist(int maxSize) {
        songs = new String[maxSize];
        songCount = 0;
    }

    public void addSong(String title) {
        if (songCount < songs.length) {
            songs[songCount] = title;
            songCount++;
        }
    }

    // Return a COPY, not the original private array
    public String[] getSongs() {
        return Arrays.copyOf(songs, songCount);
    }

    public int getSongCount() {
        return songCount;
    }
}

public class P2_Playlist {
    public static void main(String[] args) {
        Playlist p = new Playlist(10);
        p.addSong("Song A");
        p.addSong("Song B");

        String[] copy = p.getSongs();
        System.out.println("Original list: " + Arrays.toString(copy)); // [Song A, Song B]

        // Try to hack the copy
        copy[0] = "Hacked";
        System.out.println("After modifying copy: " + Arrays.toString(p.getSongs())); // still [Song A, Song B]
        System.out.println("Song count: " + p.getSongCount()); // 2
    }
}
