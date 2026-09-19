package STEP_SEM3.Assignment_Problems;
import java.util.Arrays;

public class Problem_2 {
    


    private final String[] songs;
    private int count;

    public Problem_2(int capacity) {
        this.songs = new String[capacity];
        this.count = 0;
    }

    public void addSong(String song) {
        if (count < songs.length) {
            songs[count++] = song;
        }
    }

    public String[] getSongs() {
        return Arrays.copyOf(songs, count);
    }

    
    public int getSongCount() {
        return count;
    }
}

