package movie;

import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity {
    private String createBy;
    private LocalDateTime createdDate;
    private String lastModifyBy;
    private LocalDateTime lastModifiedDate;
}