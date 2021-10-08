package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.FetchAccountTypeFlow;
import com.lelo.translator.AccountTypeTranslator;
import com.lelo.webdomain.dtos.AccountTypeDTO;
<<<<<<< HEAD
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FetchAccountTypeFowImpl implements FetchAccountTypeFlow {
    private final AccountTypeTranslator accountTypeTranslator;

<<<<<<< HEAD
    private static final Logger LOGGER = LoggerFactory.getLogger(FetchAccountTypeFowImpl.class);

=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    @Autowired
    public FetchAccountTypeFowImpl(AccountTypeTranslator accountTypeTranslator) {
        this.accountTypeTranslator = accountTypeTranslator;
    }

    @Override
    public List<AccountTypeDTO> getAccountypes() {
        List<AccountTypeDTO> accountTypeDTOS = accountTypeTranslator.getAccountypes();
<<<<<<< HEAD
        LOGGER.info("Returned values from account types are {}", accountTypeDTOS);
=======
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
        return accountTypeDTOS;
    }
}
