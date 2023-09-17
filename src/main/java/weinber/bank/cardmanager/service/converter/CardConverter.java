package weinber.bank.cardmanager.service.converter;

import org.springframework.stereotype.Service;
import weinber.bank.cardmanager.dto.CardDTO;
import weinber.bank.cardmanager.entity.Card;

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

@Service
public class CardConverter {

    public Card convertCardDTO(CardDTO cardDTO) {
        return Card.builder()
                .uuid(Optional.ofNullable(cardDTO.getUuid()).orElse(UUID.randomUUID()))
                .customerUuid(cardDTO.getCustomerUuid())
                .cardNumber(cardDTO.getCardNumber())
                .cardType(cardDTO.getCardType())
                .totalLimit(cardDTO.getTotalLimit())
                .amountUsed(cardDTO.getAmountUsed())
                .availableAmount(cardDTO.getAvailableAmount())
                .createDate(Instant.now())
                .build();
    }
}