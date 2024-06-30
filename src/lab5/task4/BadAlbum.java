package lab5.task4;

import java.util.ArrayList;
import java.util.List;

public class BadAlbum extends Album {

    @Override
    public void addSong(Song song) {

            if(song.name.length() == 3 && isPalindrom(song.id)) {
                listaCantece.add(song);
            }
    }
    public boolean isPalindrom(Integer number){
        Integer oglindit = 0;
        Integer temp = number;
        while(number != 0){
            oglindit = number % 10 + oglindit * 10;
            number /= 10;
        }
        return oglindit.equals(temp);
    }
}
