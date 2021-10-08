package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.DeleteAccountTypeFlow;
import com.lelo.translator.AccountTypeTranslator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteAccountTypeFlowImpl implements DeleteAccountTypeFlow {
    private final AccountTypeTranslator accountTypeTranslator;


    @Autowired
    public DeleteAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator) {
        this.accountTypeTranslator = accountTypeTranslator;
    }

    @Override
    public void deleteAccountType(String name) {
        accountTypeTranslator.deleteAccountType(name);
    }
}
