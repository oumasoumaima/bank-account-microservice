package org.sid.bank_account_service.repositories;

import org.sid.bank_account_service.entities.BankAccount;
import org.sid.bank_account_service.enums.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource //Demander à spring au démarrage démarre moi un web service restfull qui permet de gérer une entité de type bankaccount => Automatiquement il creer les gets post ect
public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
    @RestResource(path="/byType")
    List<BankAccount> findByType (@Param("t") AccountType type);
}
