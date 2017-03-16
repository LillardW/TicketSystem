
public class Movie {
	String movieNumber;
	String MovieName;
	String Price;
	String MovieIntro;

	Movie(String movieNumber, String MovieName, String Price, String MovieIntro) {
		this.movieNumber = movieNumber;
		this.MovieName = MovieName;
		this.Price = Price;
		this.MovieIntro = MovieIntro;

	}

	public String toString() {

		return "Ó°Æ¬±àºÅ£º" + this.movieNumber + " Æ¬Ãû£º" + this.MovieName + " Æ±¼Û£º" + this.Price + " Ó°Æ¬¼ò½é£º"
				+ this.MovieIntro;
	}

}
