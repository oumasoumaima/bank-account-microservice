package org.sid.bank_account_service.mappers;

import org.sid.bank_account_service.dto.BankAccountResponseDTO;
import org.sid.bank_account_service.entities.BankAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
    public class AccountMapper {
        public BankAccountResponseDTO fromBankAccount (BankAccount bankAccount) {
            BankAccountResponseDTO bankAccountResponseDT0=new BankAccountResponseDTO();
            BeanUtils.copyProperties(bankAccount,bankAccountResponseDT0);
            return bankAccountResponseDT0;
        }
}
