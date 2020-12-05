package movie;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "THEATER")
public class Theater
{
	@Id
	@Column(name = "THEATER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "ADDRESS")
	private String address;
	@Temporal(TemporalType.DATE)
	@Column(name = "CLOSED_DATE")
	private Date closedDate; //date
	@Column(name = "THE_INCOME")
	private Long theIncome;
	@Column(name = "NUM_OF_EMP")
	private Long numOfEmp;


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getClosedDate() {
		return closedDate;
	}

	public void setClosedDate(Date closedDate) {
		this.closedDate = closedDate;
	}

	public Long getTheIncome() {
		return theIncome;
	}

	public void setTheIncome(Long theIncome) {
		this.theIncome = theIncome;
	}

	public Long getNumOfEmp() {
		return numOfEmp;
	}

	public void setNumOfEmp(Long numOfEmp) {
		this.numOfEmp = numOfEmp;
	}
}

