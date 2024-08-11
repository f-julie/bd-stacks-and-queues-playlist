import java.util.LinkedList;
import java.util.Queue;

public class Playlist {
    private Queue<Song> songList;

    /**
     * Constructor.
     */
    public Playlist() {
        this.songList = new LinkedList<>();
    }

    /**
     * Provides the next song to be played from this playlist.
     * Once a song is played it will not be available to be played again.
     * @return The next Song in the playlist, or null if the playlist is empty.
     */
    public Song getNextSong() {
        if (songList.isEmpty()) {
            return null;
        }
        return songList.remove();
    }

    /**
     * Adds a Song to the end of the playlist.
     * @param song the song to be added to the playlist.
     */
    public void addSong(Song song) {
        songList.add(song);
    }

}
