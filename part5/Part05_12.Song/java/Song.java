
public class Song {
    private String  title;
    private String  artist;
    private int length;
    public Song (String  title, String artist, int length){
        this.title=title;
        this.artist=artist;
        this.length= length;
    }
    public boolean equals(Object compared){
        // находятся ли обьекты в одном  адресе памяти
        if (this==compared){
            return true;
        }
        // принадлежит ли сравниваемый обьект к типу  Song? Если нет, тогда false
        if (!(compared instanceof  Song)){
            return false;
        }
        // конвертация обьекта в обьект Song
        Song comparedSong = (Song) compared;
        // обычное сравнение
        if (this.title.equals(comparedSong.title)&&
                this.artist.equals(comparedSong.artist)&&
                this.length==(comparedSong.length)){
            return true;
        }
        return false;
    }
}
