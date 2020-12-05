package movie;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(
        name = "STAFF"
)
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

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Date getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(Date hiredDate) {
        this.hiredDate = hiredDate;
    }

    public Date getResignedDate() {
        return resignedDate;
    }

    public void setResignedDate(Date resignedDate) {
        this.resignedDate = resignedDate;
    }

    public boolean isWork() {
        return isWork;
    }

    public void setWork(boolean work) {
        isWork = work;
    }
}