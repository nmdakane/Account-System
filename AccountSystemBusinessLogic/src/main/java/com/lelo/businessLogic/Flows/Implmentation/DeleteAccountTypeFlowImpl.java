package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.DeleteAccountTypeFlow;
import com.lelo.translator.AccountTypeTranslator;
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
    public void deleteAccountType(Long id) {
        accountTypeTranslator.deleteAccountType(id);
    }
}
