package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.FetchAccountTypeFlow;
import com.lelo.translator.AccountTypeTranslator;
import com.lelo.webdomain.dtos.AccountTypeDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FetchAccountTypeFowImpl implements FetchAccountTypeFlow {
    private final AccountTypeTranslator accountTypeTranslator;

    private static final Logger LOGGER = LoggerFactory.getLogger(FetchAccountTypeFowImpl.class);

    @Autowired
    public FetchAccountTypeFowImpl(AccountTypeTranslator accountTypeTranslator) {
        this.accountTypeTranslator = accountTypeTranslator;
    }

    @Override
    public List<AccountTypeDTO> getAccountypes() {
        List<AccountTypeDTO> accountTypeDTOS = accountTypeTranslator.getAccountypes();
        LOGGER.info("Returned values from account types are {}", accountTypeDTOS);
        return accountTypeDTOS;
    }
}
