package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.UpdateAccountTypeFlow;
import com.lelo.translator.AccountTypeTranslator;
import com.lelo.webdomain.dtos.AccountTypeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateAccountTypeFlowImpl implements UpdateAccountTypeFlow {
    private final AccountTypeTranslator accountTypeTranslator;

    @Autowired
    public UpdateAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator) {
        this.accountTypeTranslator = accountTypeTranslator;
    }

    @Override
    public AccountTypeDTO updateAccountType(Long id) {
        AccountTypeDTO accountTypeDTO = accountTypeTranslator.updateAccountType(id);
        return accountTypeDTO;
    }
}
