package com.lelo.businessLogic.Flows;

import com.lelo.webdomain.dtos.AccountTypeDTO;

import java.util.List;

public interface FetchAccountTypeFlow {
    List<AccountTypeDTO> getAccountypes();
}
