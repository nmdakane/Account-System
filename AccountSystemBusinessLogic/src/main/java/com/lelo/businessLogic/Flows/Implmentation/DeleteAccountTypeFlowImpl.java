package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.DeleteAccountTypeFlow;
import com.lelo.translator.AccountTypeTranslator;
<<<<<<< HEAD
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteAccountTypeFlowImpl implements DeleteAccountTypeFlow {
    private final AccountTypeTranslator accountTypeTranslator;

<<<<<<< HEAD

=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    @Autowired
    public DeleteAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator) {
        this.accountTypeTranslator = accountTypeTranslator;
    }

    @Override
<<<<<<< HEAD
    public void deleteAccountType(String name) {
        accountTypeTranslator.deleteAccountType(name);
=======
    public void deleteAccountType(Long id) {
        accountTypeTranslator.deleteAccountType(id);
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    }
}
