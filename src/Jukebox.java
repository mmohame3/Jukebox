public class Jukebox implements Selector{

   private final CDPlayer cdPlayer;

   public Jukebox(CDPlayer cdPlayer){
       this.cdPlayer = cdPlayer;
   }



    @Override
    public void nextSong(){
        System.out.println("Playing next song...");
    }

    @Override
    public void prevSong(){
        System.out.println("Playing pev song...");
    }

    @Override
    public void shuffle(){
        System.out.println("shuffling...");
    }

}
