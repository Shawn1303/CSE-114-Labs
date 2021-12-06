import java.util.ArrayList;

public class User {
    private String userName;
    private ArrayList<Playlist> playlists;

    public User(String userName) {
        this.userName = userName;
        this.playlists = new ArrayList<>();
    }
    public User(String userName, ArrayList<Playlist> playlists) {
        this.userName = userName;
        this.playlists = playlists;
    }

    public String getUsername() {return userName;}
    public ArrayList<Playlist> getPlaylist() {return playlists;}

    public void setUserName(String userName) {this.userName = userName;}
    public void setPlayList(ArrayList<Playlist> playlists) {this.playlists = playlists;}

    public void addPlaylist(Playlist playlist) {this.playlists.add(playlist);}
    public void removePlayList(String playlistTitle) {
        for(int i = 0; i < playlists.size(); i++) {
            if(playlists.get(i).getPlaylistTitle().equals(playlistTitle)) {
                playlists.remove(i);
                break;
            }
        }
    }
    public Playlist getPlaylist(String playlistTitle) {
        for (Playlist playlist : playlists) {
            if (playlist.getPlaylistTitle().equals(playlistTitle)) {
                return playlist;
            }
        }
        return null;
    }

    public void makeCollaborativePlaylist(String playlistTitle, User friend) {
        Playlist playlist = null;
        for (Playlist value : playlists) {
            if (value.getPlaylistTitle().equals(playlistTitle)) {
                playlist = value;
            }
        }
        friend.addPlaylist(playlist);
    }

    public String toString(){
        return "User is: " + userName + "\n Playlist: " + playlists.toString();
    }

    public boolean equals(Object o) {
        if(o instanceof User){
                return this.userName.equals(((User) o).getUsername());
        }
        return false;
    }
}
