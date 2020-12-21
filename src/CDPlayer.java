import java.util.Set;

public class CDPlayer {
    private final PlayList playList;
    private final Set<CD> cds;

    public CDPlayer(PlayList playList, Set<CD> cds){
        this.playList = playList;
        this.cds = cds;
    }

}
