package movie;

import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity {
    private Staff createStaff;
    private LocalDateTime createdDate;
    private Staff lastModifyStaff;
    private LocalDateTime lastModifiedDate;
}