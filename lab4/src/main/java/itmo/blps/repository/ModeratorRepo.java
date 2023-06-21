package itmo.blps.repository;

import itmo.blps.entity.ModeratorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ModeratorRepo extends JpaRepository<ModeratorEntity, Integer> {
    Optional<ModeratorEntity> findByLogin(String login);
}