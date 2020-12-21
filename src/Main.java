import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        CD cd1 = new CD();

        Song s1 = new Song("Song 1", cd1);
        Song s2 = new Song("Song 2" , cd1);
        cd1.setSongs(List.of(s1,s2));

        CD cd2 = new CD();

        Song s3 = new Song("Song 2", cd2);
        Song s4 = new Song("Song 3", cd2);
        cd2.setSongs(List.of(s3, s4));
        PlayList p = new PlayList(List.of(s1, s2, s3, s4));

        CDPlayer cdPlayer = new CDPlayer(p, Set.of(cd1, cd2));
        Jukebox jk = new Jukebox(cdPlayer);

        User user = new User(jk);
        user.getJukebox().nextSong();
        user.getJukebox().shuffle();



    }


}
