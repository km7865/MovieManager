package movie;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("Client")
public class Client extends User {
    @OneToMany(mappedBy = "client")
    private List<Reservation> reservations = new ArrayList<Reservation>();

    public void addReservation(Reservation reservation) {
        this.reservations.add(reservation);
        if (reservation.getClient() != this) {
            reservation.setClient(this);
        }
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
