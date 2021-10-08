package com.lelo.translator;

import com.lelo.webdomain.dtos.AccountTypeDTO;

import java.util.List;

public interface AccountTypeTranslator {
    List<AccountTypeDTO> getAccountypes();
    AccountTypeDTO getAccountType(String name);
    void createAccountType(AccountTypeDTO accountTypeDTO);
    void deleteAccountType(String name);
    //AccountTypeDTO updateAccountType(String name);
}
