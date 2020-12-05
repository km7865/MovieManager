package movie;

import javax.persistence.*;

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
}
