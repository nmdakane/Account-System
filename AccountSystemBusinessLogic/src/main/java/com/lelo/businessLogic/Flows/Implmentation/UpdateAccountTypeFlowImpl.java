package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.UpdateAccountTypeFlow;
import com.lelo.translator.AccountTypeTranslator;
import com.lelo.webdomain.dtos.AccountTypeDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateAccountTypeFlowImpl implements UpdateAccountTypeFlow {
    private final AccountTypeTranslator accountTypeTranslator;

    private static final Logger LOGGER = LoggerFactory.getLogger(UpdateAccountTypeFlowImpl.class);

    @Autowired
    public UpdateAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator) {
        this.accountTypeTranslator = accountTypeTranslator;
    }

   /* @Override
    public AccountTypeDTO updateAccountType(String name) {
        AccountTypeDTO accountTypeDTO = accountTypeTranslator.updateAccountType(name);
        LOGGER.info("Updating Account type with NMonic name {} and the returned value is {}",name,accountTypeDTO);
        return accountTypeDTO;
    }*/
}
