package movie;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ScreenHall
{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "SCREEN_HALL_ID")
	private Long id;
	@Column(name = "SH_NAME")
	private String shName;
	@Column(name = "SH_NUM_OF_SEAT")
	private Long shNumOfSeat;
	@Column(name = "SH_SPECIAL_NOTE")
	private String shSpecialNote;
	@Column(name = "THE_NAME")
	private String theName;

	@OneToMany
	@JoinColumn(name = "SCHEDULE_ID")
	private List<Schedule> schedules = new ArrayList<Schedule>();

	public List<Schedule> getSchedules() {
		return schedules;
	}

	public void setSchedules(List<Schedule> schedules) {
		this.schedules = schedules;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getShName() {
		return shName;
	}

	public void setShName(String shName) {
		this.shName = shName;
	}

	public Long getShNumOfSeat() {
		return shNumOfSeat;
	}

	public void setShNumOfSeat(Long shNumOfSeat) {
		this.shNumOfSeat = shNumOfSeat;
	}

	public String getShSpecialNote() {
		return shSpecialNote;
	}

	public void setShSpecialNote(String shSpecialNote) {
		this.shSpecialNote = shSpecialNote;
	}

	public String getTheName() {
		return theName;
	}

	public void setTheName(String theName) {
		this.theName = theName;
	}
}
