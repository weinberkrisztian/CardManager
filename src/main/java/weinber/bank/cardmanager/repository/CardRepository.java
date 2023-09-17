package weinber.bank.cardmanager.repository;

import org.springframework.data.repository.CrudRepository;
import weinber.bank.cardmanager.entity.Card;

import java.util.List;
import java.util.UUID;

public interface CardRepository extends CrudRepository<Card, UUID> {

    List<Card> findAllByCustomerUuid(UUID customerUuid);
}
