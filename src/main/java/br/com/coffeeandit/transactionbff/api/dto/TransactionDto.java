package br.com.coffeeandit.transactionbff.api.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode
public class TransactionDto {

    private UUID uuid;
}
