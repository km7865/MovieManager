package movie;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="MOVIE")
public class Movie extends BaseEntity {
	@Id
	@Column(name = "MOVIE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(name = "TITLE")
    private String title;
	//배우정보List
	@ElementCollection //디폴트 : LAZY
	@CollectionTable(name="ACTOR",
			joinColumns = @JoinColumn(name = "ACTOR_ID"))
    private List<Actor> actors = new ArrayList<Actor>();
	
	
	@Column(name = "DIRECTOR")
    private String director;
	@Column(name = "STORY")
    private String story;
	@Column(name = "OPEN_DATE")
    @Temporal(TemporalType.DATE)
    private Date openDate;	//date
	@Column(name = "AGE_LIMIT")
    private Long ageLimit;
	@Column(name = "RUN_TIME")
    private Long runTime;
	
	//다대일
	@ManyToOne
	@JoinColumn(name="STATISTIC_ID")
    private Statistic statistic;
	
	//스케쥴 
	@OneToMany(mappedBy = "movie")
	private List<Schedule> schedules = new ArrayList<Schedule>();

	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public Long getAgeLimit() {
		return ageLimit;
	}

	public void setAgeLimit(Long ageLimit) {
		this.ageLimit = ageLimit;
	}

	public Long getRunTime() {
		return runTime;
	}

	public void setRunTime(Long runTime) {
		this.runTime = runTime;
	}

	public Statistic getStatistic() {
		return statistic;
	}

	public void setStatistic(Statistic statistic) {
		this.statistic = statistic;
	}
}
