public class Movie {

    private String name;
    private int yearReleased;

    public Movie(String name, int yearReleased) {
        this.name = name;
        this.yearReleased = yearReleased;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    @Override
    public String toString() {
        return "Movie Name: "+name + ", YearReleased: "+yearReleased+".";
    }
}
