package App.Raftt.Carti;

import java.util.Objects;

public class ArtAlbums extends Book {

    private String paperQuality;

    public ArtAlbums( String name, double numOfPages, String paperQuality) {
        super(name, numOfPages);
        this.paperQuality = paperQuality;


    }

    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (!(o instanceof ArtAlbums)) return false;
        if (!super.equals(o)) return false;
        ArtAlbums artAlbums = (ArtAlbums) o;
        return Objects.equals(paperQuality, artAlbums.paperQuality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), paperQuality);
    }

    @Override
    public String toString() {
        return "ArtAlbums{" +
                "name='" + name + '\'' +
                ", numOfPages=" + numOfPages +
                " paperQuality='" + paperQuality + '\'' +
                '}';
    }
}

