package dat159.fowler;

public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }

	double getAmount() {
		return _movie.getCharge(_daysRented);
	}
	int getPoints() {
		return _movie.getFrequentRenterPoints(_daysRented);
	}
}
