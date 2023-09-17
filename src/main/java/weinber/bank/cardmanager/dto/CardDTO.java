package weinber.bank.cardmanager.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class CardDTO {
    @JsonProperty
    private UUID uuid;
    @JsonProperty("customer_uuid")
    private UUID customerUuid;
    @JsonProperty("card_number")
    private String cardNumber;
    @JsonProperty("card_type")
    private String cardType;
    @JsonProperty("total_limit")
    private int totalLimit;
    @JsonProperty("amount_used")
    private int amountUsed;
    @JsonProperty("available_amount")
    private int availableAmount;
    @JsonIgnore
    private Instant createDate;
}
