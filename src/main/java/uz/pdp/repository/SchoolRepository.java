package uz.pdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.entity.School;

public interface SchoolRepository extends JpaRepository<School,Integer> {
}
