import java.util.List;

public class CD {
    private List<Song> songs;

    protected List<Song> getSongs(){
        return songs;
    }

    protected void setSongs(List<Song> songs){
        this.songs = songs;
    }
}
