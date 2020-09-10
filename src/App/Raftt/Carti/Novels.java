package App.Raftt.Carti;


import java.util.Objects;

public class Novels extends Book {

    private String category ;
    private String type;

    public Novels( String name, double numOfPages, String type ) {
        super(name, numOfPages);
        this.type = type;

    }

    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (!(o instanceof Novels)) return false;
        if (!super.equals(o)) return false;
        Novels novels = (Novels) o;
        return Objects.equals(type, novels.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }

    @Override
    public String toString() {
        return "Novels{" +

                "name='" + name + '\'' +
                ", numOfPages=" + numOfPages +
                " type='" + type + '\'' +
                '}';
    }
}







