package movie;
import javax.persistence.*;
import java.util.Date;

@Entity
@DiscriminatorValue("Staff")
public class Staff extends User {
    @OneToOne
    @JoinColumn(name = "ACCOUNT_ID")
    private Account account;

    private Date hiredDate;
    private Date resignedDate;
    private boolean isWork;
}