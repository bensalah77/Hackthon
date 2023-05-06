package Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.Hackthon.Model.User;
import com.example.Hackthon.Model.Proposition;

import java.util.List;

public interface PropositionRepository extends JpaRepository<Proposition, Long> {

@Query("SELECT p FROM Proposition p WHERE p.user.id = :userId")
List<Proposition> findByUserId(@Param("userId") Long userId);
        }


