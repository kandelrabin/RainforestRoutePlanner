package RainforestRetail.server.repositories;

import RainforestRetail.server.models.Waypoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WaypointRepository extends JpaRepository<Waypoint, Long> {
}
