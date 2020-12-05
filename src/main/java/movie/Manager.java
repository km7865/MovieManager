package movie;

import javax.persistence.*;
import java.util.Date;

@Entity
@DiscriminatorValue("Manager")
@PrimaryKeyJoinColumn(name = "MANAGER_ID")
public class Manager extends User {
    @OneToOne
    @JoinColumn(name = "ACCOUNT_ID")
    private Account account;
    private Date hiredDate;
    private Date resignedDate;
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
