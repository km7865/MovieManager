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

	//예매
	@OneToMany(mappedBy = "schedule")
	private List<Reservation> reservations = new ArrayList<Reservation>();

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

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
}
