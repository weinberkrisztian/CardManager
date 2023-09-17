package weinber.bank.cardmanager.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import weinber.bank.cardmanager.dto.CardDTO;
import weinber.bank.cardmanager.entity.Card;
import weinber.bank.cardmanager.service.CardService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(("/card"))
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;

    @GetMapping("/findByCustomerUuid")
    public ResponseEntity<List<Card>> cardsByCustomerUuid(@RequestParam("customer_uuid") UUID customerUuid) {
        List<Card> cardsByCustomerUuid = cardService.getCardsByCustomerUuid(customerUuid);
        return ResponseEntity.status(HttpStatus.OK)
                .body(cardsByCustomerUuid);
    }

    @PostMapping("/create")
    public ResponseEntity<Card> createCard(@RequestBody CardDTO cardDTO) {
        Card savedCard = cardService.saveCardFromDTO(cardDTO);
        return ResponseEntity.status(HttpStatus.OK)
                .body(savedCard);
    }
}
