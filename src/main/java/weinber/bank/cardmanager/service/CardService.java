package weinber.bank.cardmanager.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import weinber.bank.cardmanager.dto.CardDTO;
import weinber.bank.cardmanager.entity.Card;
import weinber.bank.cardmanager.repository.CardRepository;
import weinber.bank.cardmanager.service.converter.CardConverter;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class CardService {

    private final CardRepository cardRepository;
    private final CardConverter cardConverter;


    public Card saveCardFromDTO(CardDTO cardDTO) {
        Card card = cardConverter.convertCardDTO(cardDTO);
        return saveCard(card);
    }

    public List<Card> getCardsByCustomerUuid(UUID customerUuid) {
        return cardRepository.findAllByCustomerUuid(customerUuid);
    }

    private Card saveCard(Card card) {
        return cardRepository.save(card);
    }
}
