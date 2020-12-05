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
}
