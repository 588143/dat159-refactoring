package dat159.fowler;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    //private int _priceCode;
    private Price _price;

    public Movie(String title, int priceCode) {
        _title = title;
        //_priceCode =getPriceCode();
    }

    public int getPriceCode() {
        return _price._getPriceCode();
    }

    public void setPriceCode(int arg) {
        switch(arg) {
        case CHILDRENS:
        	_price=new ChildrensPrice();
        	break;
        case REGULAR:
        	_price=new NewReleasePrice();
            break;
        case NEW_RELEASE:
        	_price=new RegularPrice();
        	break;
        }
    }
    double getCharge(int daysRented) {
    	return _price._getCharge(daysRented);
    }

    public String getTitle() {
        return _title;
    }
   
    int getFrequentRenterPoints(int daysRented) {
		 int frequentRenterPoints = 0;
   	if ((getPriceCode() == Movie.NEW_RELEASE) &&
   			daysRented > 1) frequentRenterPoints=2;
   	else frequentRenterPoints=1;
   	return frequentRenterPoints;
}
}
