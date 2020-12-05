package movie;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="RATING")
public class Rating extends BaseEntity
{
	@Id
	@Column(name = "RATING_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "MOV_NUM")
	private Long movNum;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "WRITE_TIME")
	private Date writeTime;		//timestampe
	@Column(name = "STAR_RATE")
	private Long starRate;
	@Column(name = "CONTENT")
	private String content;
	@Column(name = "WRITE_ID")
	private String writeId;

	public Long getMovNum() {
		return movNum;
	}

	public void setMovNum(Long movNum) {
		this.movNum = movNum;
	}

	public Date getWriteTime() {
		return writeTime;
	}

	public void setWriteTime(Date writeTime) {
		this.writeTime = writeTime;
	}

	public Long getStarRate() {
		return starRate;
	}

	public void setStarRate(Long starRate) {
		this.starRate = starRate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriteId() {
		return writeId;
	}

	public void setWriteId(String writeId) {
		this.writeId = writeId;
	}
}
