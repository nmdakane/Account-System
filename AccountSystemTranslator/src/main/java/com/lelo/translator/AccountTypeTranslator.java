package com.lelo.translator;

import com.lelo.webdomain.dtos.AccountTypeDTO;

import java.util.List;

public interface AccountTypeTranslator {
    List<AccountTypeDTO> getAccountypes();
<<<<<<< HEAD
    AccountTypeDTO getAccountType(String name);
    void createAccountType(AccountTypeDTO accountTypeDTO);
    void deleteAccountType(String name);
    //AccountTypeDTO updateAccountType(String name);
=======
    AccountTypeDTO getAccountType(Long id);
    void createAccountType(AccountTypeDTO accountTypeDTO);
    void deleteAccountType(Long id);
    AccountTypeDTO updateAccountType(Long id);
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
}
