package movie;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Billing {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "BILLING_ID")
    private Long id;
    private Long price;
    private String bank;
    private int status;
    private Date paymentDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
}
