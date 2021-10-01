package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.CreateAccountTypeFlow;
import com.lelo.translator.AccountTypeTranslator;
import com.lelo.webdomain.dtos.AccountTypeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateAccountTypeFlowImpl implements CreateAccountTypeFlow {
    private final AccountTypeTranslator accountTypeTranslator;

    @Autowired
    public CreateAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator) {
        this.accountTypeTranslator = accountTypeTranslator;
    }

    @Override
    public void createAccountType(AccountTypeDTO accountTypeDTO) {
        accountTypeTranslator.createAccountType(accountTypeDTO);
    }
}
