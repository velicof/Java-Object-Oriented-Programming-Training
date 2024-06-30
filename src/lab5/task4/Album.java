package lab5.task4;


import java.util.ArrayList;
import java.util.List;

public abstract class Album {

   protected List<Song> listaCantece = new ArrayList<>();

   abstract void addSong(Song song);

   public void removeSong(Song song){
       listaCantece.remove(song);
   }

    @Override
    public String toString() {
        return "Album{" +
                "listaCantece=" + listaCantece +
                '}';
    }
}
