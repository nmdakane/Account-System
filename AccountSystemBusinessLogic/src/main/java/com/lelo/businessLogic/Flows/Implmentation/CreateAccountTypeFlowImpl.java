package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.CreateAccountTypeFlow;
import com.lelo.translator.AccountTypeTranslator;
import com.lelo.webdomain.dtos.AccountTypeDTO;
<<<<<<< HEAD
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateAccountTypeFlowImpl implements CreateAccountTypeFlow {
    private final AccountTypeTranslator accountTypeTranslator;

<<<<<<< HEAD
    private static final Logger LOGGER = LoggerFactory.getLogger(CreateAccountTypeFlowImpl.class);

=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    @Autowired
    public CreateAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator) {
        this.accountTypeTranslator = accountTypeTranslator;
    }

    @Override
    public void createAccountType(AccountTypeDTO accountTypeDTO) {
<<<<<<< HEAD
        LOGGER.info("Account to create {}",accountTypeDTO);
=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
        accountTypeTranslator.createAccountType(accountTypeDTO);
    }
}
