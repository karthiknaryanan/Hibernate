package exercises;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MovieTester {
	public static void main(String[] args) {

		Movie movie = new Movie();
		movie.setMovieId("A101");
		movie.setMovieName("JamesBond");
		movie.setLanguage("English");
		movie.setReleasedIN(1990);
		movie.setRevenueInDollars(5000000);
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.Movie.xml").addAnnotatedClass(Movie.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(movie);
		session.getTransaction().commit();
		
		
	}
}
