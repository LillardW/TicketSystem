
public class Place {
	private String movieNumber;
	private String account;
	private String place;

	public Place(String movieNumber, String account, String place) {
		this.account = account;
		this.movieNumber = movieNumber;
		this.place = place;
	}

	public String getMovieNumber() {
		return movieNumber;
	}

	public void setMovieNumber(String movieNumber) {
		this.movieNumber = movieNumber;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

}