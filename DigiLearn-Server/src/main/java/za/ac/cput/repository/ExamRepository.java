package za.ac.cput.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.Exam;


@Repository
public interface ExamRepository extends JpaRepository<Exam,String> {
        }

