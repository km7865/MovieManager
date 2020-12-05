package movie;

import javax.persistence.*;

@Entity
public class Seat
{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "SEAT_ID")
	private Long id;
	@Column(name = "SEAT_NUM")
	private Long seatNum;
	@Column(name = "SEAT_SPEICAL_NOTE")
	private String seatSpecialNote;
	@Column(name = "SEAT_NAME")
	private String seatName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(Long seatNum) {
		this.seatNum = seatNum;
	}

	public String getSeatSpecialNote() {
		return seatSpecialNote;
	}

	public void setSeatSpecialNote(String seatSpecialNote) {
		this.seatSpecialNote = seatSpecialNote;
	}

	public String getSeatName() {
		return seatName;
	}

	public void setSeatName(String seatName) {
		this.seatName = seatName;
	}
}
