package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.UpdateAccountTypeFlow;
import com.lelo.translator.AccountTypeTranslator;
import com.lelo.webdomain.dtos.AccountTypeDTO;
<<<<<<< HEAD
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateAccountTypeFlowImpl implements UpdateAccountTypeFlow {
    private final AccountTypeTranslator accountTypeTranslator;

<<<<<<< HEAD
    private static final Logger LOGGER = LoggerFactory.getLogger(UpdateAccountTypeFlowImpl.class);

=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    @Autowired
    public UpdateAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator) {
        this.accountTypeTranslator = accountTypeTranslator;
    }

<<<<<<< HEAD
   /* @Override
    public AccountTypeDTO updateAccountType(String name) {
        AccountTypeDTO accountTypeDTO = accountTypeTranslator.updateAccountType(name);
        LOGGER.info("Updating Account type with NMonic name {} and the returned value is {}",name,accountTypeDTO);
        return accountTypeDTO;
    }*/
=======
    @Override
    public AccountTypeDTO updateAccountType(Long id) {
        AccountTypeDTO accountTypeDTO = accountTypeTranslator.updateAccountType(id);
        return accountTypeDTO;
    }
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
}
