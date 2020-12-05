package movie;
import javax.persistence.*;
import java.util.Date;

@Entity
@DiscriminatorValue("Staff")
@PrimaryKeyJoinColumn(name = "STAFF_ID")
public class Staff extends User {
    @OneToOne
    @JoinColumn(name = "ACCOUNT_ID")
    private Account account;

    @Column(name = "HIRED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hiredDate;

    @Column(name = "RESIGNED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date resignedDate;

    @Column(name = "IS_WORK")
    private boolean isWork;
}