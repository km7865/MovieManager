package movie;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
            client1.setCallNum("010-8568-5959");
            client2.setCallNum("010-1111-1111");
            client1.setPassword("1234");
            client2.setPassword("123890");
            client1.setRRN("123456-1234567");
            client2.setRRN("133336-1857233");
            client1.setEmail("20130155@kumoh.ac.kr");
            client2.setEmail("20140299@kumoh.ac.kr");

            Actor actor1 = new Actor();
            actor1.setName("정우");
            actor1.setRole(Main);
            actor1.setRoleName("대권");

            Movie movie = new Movie();
            movie.setTitle("이웃사촌");
            movie.setAgeLimit(12L);
            movie.setDirector("이환경");
            movie.setStory("백수가장 좌천위기 도청팀장 대권(정우)은 팀원들과 함께 해외에서 입국하자마자 자택 격리된 정치인 가족을 24시간 감시하라는 미션을 받는다.");
            movie.setRunTime(90L);
            movie.setCreateBy("김동원");
            movie.setCreatedDate(new Date());
            movie.setOpenDate(new Date());

            movie.getActors().add(actor1);

            Schedule schedule = new Schedule();
            schedule.setMovie(movie);
            Date now = new Date();
            schedule.setSchStartTime(new Date(System.currentTimeMillis()));
            schedule.setSchEndTime(new Date(System.currentTimeMillis() + 6000000));
            schedule.setCreateBy("김주현");
            schedule.setCreatedDate(new Date());

            ScreenHall screenHall = new ScreenHall();
            screenHall.setShName("제1관");
            screenHall.setShNumOfSeat(100L);
            screenHall.setShSpecialNote("금오공대점의 제1관입니다.");
            screenHall.setTheName("금오공대점");
            screenHall.getSchedules().add(schedule);

            Seat seat1 = new Seat();
            Seat seat2 = new Seat();
            seat1.setSeatNum(1L);
            seat1.setSeatSpecialNote("A열 1번자리");
            seat2.setSeatNum(2L);
            seat2.setSeatSpecialNote("B열 1번자리");

            Reservation reservation1 = new Reservation();
            Reservation reservation2 = new Reservation();

            Billing billing1 = new Billing();
            Billing billing2 = new Billing();
            billing1.setBank("농협은행");
            billing1.setPrice(10000L);
            billing1.setPaymentDate(new Date());
            billing1.setStatus(Status.PAIED);

            billing2.setBank("신한은행");
            billing2.setPrice(8000L);
            billing2.setPaymentDate(new Date());
            billing2.setStatus(Status.PAIED);

            reservation1.setClient(client1);
            reservation1.setSchedule(schedule);
            reservation1.setSeat(seat1);
            reservation1.setBilling(billing1);

            reservation2.setClient(client2);
            reservation2.setSchedule(schedule);
            reservation2.setSeat(seat2);
            reservation2.setBilling(billing2);

            em.persist(client1);
            em.persist(client2);
            em.persist(movie);
            em.persist(screenHall);
            em.persist(schedule);
            em.persist(seat1);
            em.persist(seat2);
            em.persist(reservation1);
            em.persist(reservation2);
            em.persist(billing1);
            em.persist(billing2);
            em.flush();
            em.clear();

            Client c = em.find(Client.class, client1.getId());
            System.out.println(c.getReservations().get(0).getSchedule().getMovie().getTitle());

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
