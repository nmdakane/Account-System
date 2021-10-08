package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.FetchUserAccountTypeFlow;
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
public class FetchUserAccountTypeFlowImpl implements FetchUserAccountTypeFlow {
    private final AccountTypeTranslator accountTypeTranslator;

<<<<<<< HEAD
    private static final Logger LOGGER = LoggerFactory.getLogger(FetchUserAccountTypeFlowImpl.class);


=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    @Autowired
    public FetchUserAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator) {
        this.accountTypeTranslator = accountTypeTranslator;
    }

    @Override
<<<<<<< HEAD
    public AccountTypeDTO getAccountType(String name) {
        AccountTypeDTO accountTypeDTO = accountTypeTranslator.getAccountType(name);
        LOGGER.info("Account type details with the NMONIC {} is {}",name, accountTypeDTO);
=======
    public AccountTypeDTO getAccountType(Long id) {
        AccountTypeDTO accountTypeDTO = accountTypeTranslator.getAccountType(id);
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
        return accountTypeDTO;
    }
}
