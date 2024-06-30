package lab5.task4;


public class ThrillerAlbum extends Album {

    @Override
    public void addSong(Song song) {
        if((song.id % 2 == 0) && song.composer.equals("Michael Jackson")){
            listaCantece.add(song);
        }
    }
}
