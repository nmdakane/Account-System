package com.lelo.translator.Implementation;

import com.lelo.repo.files.AccountTypeRepository;
import com.lelo.translator.AccountTypeTranslator;
import com.lelo.webdomain.dtos.AccountTypeDTO;
<<<<<<< HEAD
import com.lelo.webdomain.persistence.AccountType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
import java.util.ArrayList;
import java.util.List;

@Component
public class AccountTypeTransImpl implements AccountTypeTranslator {
    private final AccountTypeRepository accountTypeRepository;

    @Autowired
    public AccountTypeTransImpl(AccountTypeRepository accountTypeRepository) {
        this.accountTypeRepository = accountTypeRepository;
    }

    @Override
    public List<AccountTypeDTO> getAccountypes() {
        List<AccountTypeDTO> accountTypeDTOS = new ArrayList<>();
        try{
            for(com.lelo.webdomain.persistence.AccountType accountType:accountTypeRepository.findAll()){
                accountTypeDTOS.add(new AccountTypeDTO(accountType));
            }
        }catch(Exception e){
            throw new RuntimeException("Cannot get data from database",e);
        }
        return accountTypeDTOS;
    }

    @Override
<<<<<<< HEAD
    public AccountTypeDTO getAccountType(String name) {
        com.lelo.webdomain.persistence.AccountType accountType;
        try {
            accountType = accountTypeRepository.getAccountTypeByNmonic(name);
=======
    public AccountTypeDTO getAccountType(Long id) {
        com.lelo.webdomain.persistence.AccountType accountType;
        try {
            accountType = accountTypeRepository.getOne(id);
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
        }catch(Exception e){
            throw new RuntimeException("Cannot get Account type from db",e);
        }
        return new AccountTypeDTO(accountType);
    }

    @Override
    public void createAccountType(AccountTypeDTO accountTypeDTO) {
        com.lelo.webdomain.persistence.AccountType accountType1 = new com.lelo.webdomain.persistence.AccountType();
        try {
            accountType1.setId(null);
            accountType1.setName(accountTypeDTO.getName());
            accountType1.setNmonic(accountTypeDTO.getNmonic());
<<<<<<< HEAD
            accountType1.setCreatedDate(LocalDate.now());
=======
            accountType1.setCreatedDate(accountTypeDTO.getCreatedDate());
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
            //accountType1.setTransactions(accountType.getTransactionsDTO().getTransactions().getAccountType().getTransactions());
            //accountType1.setRewards(accountType.getRewardsDTO());
           accountTypeRepository.save(accountType1);
        }catch(Exception e){
            throw new RuntimeException("Cannot create Account type in the db",e);
        }
    }

    @Override
<<<<<<< HEAD
    public void deleteAccountType(String name) {
        AccountType accountType = accountTypeRepository.getAccountTypeByNmonic(name);
        try {
            accountTypeRepository.delete(accountType);
=======
    public void deleteAccountType(Long id) {
        try {
            accountTypeRepository.deleteById(id);
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
        }catch(Exception e){
            throw new RuntimeException("Cannot delete Account type in the db",e);
        }
    }

<<<<<<< HEAD
  /*  @Override
    public AccountTypeDTO updateAccountType(String name) {
=======
    @Override
    public AccountTypeDTO updateAccountType(Long id) {
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
        com.lelo.webdomain.persistence.AccountType accountType;
        try {
            accountType = accountTypeRepository.getOne(id);
            accountTypeRepository.save(accountType);
        }catch(Exception e){
            throw new RuntimeException("Cannot delete Account type in the db",e);
        }
        return new AccountTypeDTO(accountType);
<<<<<<< HEAD
    }*/
=======
    }
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
}
