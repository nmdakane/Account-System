package com.lelo.businessLogic.Flows;

import com.lelo.webdomain.dtos.AccountTypeDTO;

public interface UpdateAccountTypeFlow {
    AccountTypeDTO updateAccountType(Long id);
}
