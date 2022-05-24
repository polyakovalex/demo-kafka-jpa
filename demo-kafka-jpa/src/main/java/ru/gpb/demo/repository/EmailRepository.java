package ru.gpb.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gpb.demo.entity.EmailEntity;

@Repository
public interface EmailRepository extends JpaRepository<EmailEntity, Long> {

}
