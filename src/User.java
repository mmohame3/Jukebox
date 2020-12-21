public class User {
    private final Jukebox jukebox;

    public User(Jukebox jukebox){
        this.jukebox = jukebox;
    }

    protected Jukebox getJukebox(){
        return jukebox;
    }
}
