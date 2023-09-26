package cl.lapila.cards.repository;

import cl.lapila.cards.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICardRepository extends JpaRepository<Card, Integer> {
}
