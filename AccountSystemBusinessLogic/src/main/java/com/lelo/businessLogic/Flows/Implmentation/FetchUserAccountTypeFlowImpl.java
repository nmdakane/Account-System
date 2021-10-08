package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.FetchUserAccountTypeFlow;
import com.lelo.translator.AccountTypeTranslator;
import com.lelo.webdomain.dtos.AccountTypeDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FetchUserAccountTypeFlowImpl implements FetchUserAccountTypeFlow {
    private final AccountTypeTranslator accountTypeTranslator;

    private static final Logger LOGGER = LoggerFactory.getLogger(FetchUserAccountTypeFlowImpl.class);


    @Autowired
    public FetchUserAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator) {
        this.accountTypeTranslator = accountTypeTranslator;
    }

    @Override
    public AccountTypeDTO getAccountType(String name) {
        AccountTypeDTO accountTypeDTO = accountTypeTranslator.getAccountType(name);
        LOGGER.info("Account type details with the NMONIC {} is {}",name, accountTypeDTO);
        return accountTypeDTO;
    }
}
