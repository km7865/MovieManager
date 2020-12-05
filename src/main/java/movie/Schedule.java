package movie;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="SCHEDULE")
public class Schedule extends BaseEntity
{
	@Id
	@Column(name = "SCHEDULE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "MOV_NUM")
	private Long movNum;

	@Column(name = "SH_NUM")
	private Long shNum;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SCH_START_TIME")
	private Date schStartTime; //timestampe

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SCH_END_TIME")
	private Date schEndTime;	//timestampe
	
	//영화
	@ManyToOne
	@JoinColumn(name="MOVIE_ID")
	private Movie movie;
	
	//영화
	@ManyToOne
	@JoinColumn(name="SCREEN_HALL_ID")
	private ScreenHall screenHall;
	
	//예매
	@OneToMany(mappedBy = "schedule")
	private List<Reservation> reservations = new ArrayList<Reservation>();

	public Long getMovNum() {
		return movNum;
	}

	public void setMovNum(Long movNum) {
		this.movNum = movNum;
	}

	public Long getShNum() {
		return shNum;
	}

	public void setShNum(Long shNum) {
		this.shNum = shNum;
	}

	public Date getSchStartTime() {
		return schStartTime;
	}

	public void setSchStartTime(Date schStartTime) {
		this.schStartTime = schStartTime;
	}

	public Date getSchEndTime() {
		return schEndTime;
	}

	public void setSchEndTime(Date schEndTime) {
		this.schEndTime = schEndTime;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public ScreenHall getScreenHall() {
		return screenHall;
	}

	public void setScreenHall(ScreenHall screenHall) {
		this.screenHall = screenHall;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
}
