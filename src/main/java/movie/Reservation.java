package movie;


import javax.persistence.*;

@Entity
public class Reservation {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "RESERVATION_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name="CLIENT_ID")
    private Client client;

    @ManyToOne
    @JoinColumn(name="SCHEDULE_ID")
    private Schedule schedule;

    @ManyToOne
    @JoinColumn(name="SEAT_ID")
    private Seat seat;

    @OneToOne
    @JoinColumn(name = "BILLING_ID")
    private Billing billing;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
        if (!client.getReservations().contains(this)) {
            client.getReservations().add(this);
        }
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Billing getBilling() {
        return billing;
    }

    public void setBilling(Billing billing) {
        this.billing = billing;
    }
}
