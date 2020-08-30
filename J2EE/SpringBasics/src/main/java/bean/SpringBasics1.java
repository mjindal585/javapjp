package bean;

 public class SpringBasics1 {
	private String movieId;
	private String movieName;
	private String movieActor;
	public SpringBasics1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SpringBasics1(String movieId, String movieName, String movieActor) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieActor = movieActor;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieActor() {
		return movieActor;
	}
	public void setMovieActor(String movieActor) {
		this.movieActor = movieActor;
	}
	@Override
	public String toString() {
		return "SpringBasics1 [movieId=" + movieId + ", movieName=" + movieName + ", movieActor=" + movieActor + "]";
	}
	

}
