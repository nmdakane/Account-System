package com.lelo.translator;

import com.lelo.webdomain.dtos.AccountTypeDTO;

import java.util.List;

public interface AccountTypeTranslator {
    List<AccountTypeDTO> getAccountypes();
    AccountTypeDTO getAccountType(Long id);
    void createAccountType(AccountTypeDTO accountTypeDTO);
    void deleteAccountType(Long id);
    AccountTypeDTO updateAccountType(Long id);
}
