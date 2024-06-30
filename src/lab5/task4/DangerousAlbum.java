package lab5.task4;

public class DangerousAlbum extends Album{
    @Override
    public void addSong(Song song) {
        if (isPrime(song.id)) {
            listaCantece.add(song);
        }
    }

    private boolean isPrime(Integer id) {
        if (id <= 1) {
            return false;
        }
        for (int i = 2; i * i <= id; i++) {
            if (id % i == 0) {
                return false;
            }
        }
        return true;
    }

}
