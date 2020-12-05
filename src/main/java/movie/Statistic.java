package movie;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="STATISTIC")
public class Statistic 
{
	@Id
	@Column(name = "STATISTIC_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(mappedBy="statistic")
	private List<Movie>movies = new ArrayList<Movie>();
	
	@Column(name = "TOTAL_AUDIENCES",nullable=true)
	private Long totalAudiences;
	
	
	
	
	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	public Long getTotalAudiences() {
		return totalAudiences;
	}

	public void setTotalAudiences(Long totalAudiences) {
		this.totalAudiences = totalAudiences;
	}
}
