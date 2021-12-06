import java.util.ArrayList;

public class Playlist {
    private String playlistTitle;
    private ArrayList<Song> songs;

    public Playlist() {this.songs = new ArrayList<>();}
    public Playlist(String playlistTitle){
        this();
        this.playlistTitle = playlistTitle;
    }
    public Playlist(String playlistTitle, ArrayList<Song> songs) {
        this.playlistTitle = playlistTitle;
        this.songs = songs;
    }

    public String getPlaylistTitle() {return playlistTitle;}
    public ArrayList<Song> getSongs() {return songs;}

    public void setTitle(String playlistTitle) {this.playlistTitle = playlistTitle;}
    public void setSongs(ArrayList<Song> songs) {this.songs = songs;}

    public void addSong(Song song) {this.songs.add(song);}
    public void removeSong(String songName){
        for(int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getSongName().equals(songName)) {
                songs.remove(i);
                break;
            }
        }
    }
    public void swapSongs(Song song1, Song song2){
        int index1 = -1, index2 = -1, exist = 0;
        for(int i = 0; i < songs.size(); i++){
            if(songs.get(i).equals(song1)) {
                index1 = i;
                exist++;
            }
            if(songs.get(i).equals(song2)){
                index2 = i;
                exist++;
            }
        }
        if(exist == 2) {
            Song temp = songs.get(index1);
            songs.set(index1, songs.get(index2));
            songs.set(index2, temp);
        }
    }
    public String totalDuration() {
        int min = 0, sec = 0;
        for(Song song: songs){
            String[] s = song.getDuration().split("[:]");
            min += Integer.parseInt(s[0]);
            sec += Integer.parseInt(s[1]);
        }
        min += sec/60;
        sec = sec % 60;
        return min + " min " + sec + " sec";
    }
    public void sortSongs() {
        Song swap;
        int index;
        for(int i = 0; i < songs.size() - 1; i++) {
            swap = songs.get(i);
            index = i;
            for(int j = songs.size() - i; j < songs.size(); j++){
                if(swap.compareTo(songs.get(j)) < 0){
                    songs.set(index, songs.get(j));
                    songs.set(j, swap);
                }
            }
        }
    }

    public String toString() {
        return "Playlist consists of " + songs.toString();
    }
}
