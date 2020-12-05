package movie;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;
import java.util.List;

import static movie.Role.Main;

public class JPAMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            Client client1 = new Client();
            Client client2 = new Client();
            client1.setName("고객1");
            client2.setName("고객2");

            Actor actor1 = new Actor();
            actor1.setName("정우");
            actor1.setRole(Main);
            actor1.setRoleName("대권");

            Movie movie = new Movie();
            movie.setTitle("이웃사촌");
            movie.setAgeLimit(12L);
            movie.setDirector("이환경");

            movie.getActors().add(actor1);

            em.persist(client1);
            em.persist(client2);
            em.persist(movie);
            em.flush();
            em.clear();

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
        emf.close();
    }
}
