
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

		return "ӰƬ��ţ�" + this.movieNumber + " Ƭ����" + this.MovieName + " Ʊ�ۣ�" + this.Price + " ӰƬ��飺"
				+ this.MovieIntro;
	}

}
