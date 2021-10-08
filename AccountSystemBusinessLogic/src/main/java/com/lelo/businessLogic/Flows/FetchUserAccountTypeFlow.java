package com.lelo.businessLogic.Flows;

import com.lelo.webdomain.dtos.AccountTypeDTO;

public interface FetchUserAccountTypeFlow {
    AccountTypeDTO getAccountType(String name);
}
