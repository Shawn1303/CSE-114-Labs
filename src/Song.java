public class Song implements Comparable{
    private String songName;
    private String artistName;
    private String duration;

    public Song(String songName, String artistName, String duration) {
        this.songName = songName;
        this.artistName = artistName;
        this.duration = duration;
    }

    public String getSongName() {return songName;}
    public String getArtistName() {return artistName;}
    public String getDuration() {return duration;}

    public void setSongName(String songName) {this.songName = songName;}
    public void setArtistName(String artistName) {this.artistName = artistName;}
    public void setDuration(String duration) {this.duration = duration;}


    public boolean equals(Object o) {
        if(o instanceof Song) {
            return this.artistName.equals(((Song) o).getArtistName()) && this.songName.equals(((Song) o).getSongName()) && this.duration.equals(((Song) o).getDuration());
        }
        return false;
    }

    public int compareTo(Object o) {
        if (o instanceof Song) {
            if (this.songName.equals(((Song) o).getSongName())) {
                return this.artistName.compareTo(((Song) o).getArtistName());
            } else {
                return this.songName.compareTo(((Song) o).getSongName());
            }
        }
        return 0;
    }

    public String toString() {
        return "Song name: " + songName + " by " + artistName + " (" + duration + ")" + "\n";
    }
}
