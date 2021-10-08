package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.UpdatePersonFlow;
import com.lelo.translator.PersonTranslator;
import com.lelo.translator.TransactionsTranslator;
import com.lelo.webdomain.dtos.PersonDTO;
import com.lelo.webdomain.dtos.TransactionsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdatePersonFlowImpl implements UpdatePersonFlow {
    private final PersonTranslator personTranslator;
    private  final TransactionsTranslator transactionsTranslator;

    @Autowired
    public UpdatePersonFlowImpl(PersonTranslator personTranslator, TransactionsTranslator transactionsTranslator) {
        this.personTranslator = personTranslator;
        this.transactionsTranslator = transactionsTranslator;
    }




    @Override
    public PersonDTO updatePerson(String email, String phone) {
        PersonDTO personDTO = personTranslator.updatePersonPhone(email,phone);
        return personDTO;
    }

    @Override
    public void updateAmount(String email, TransactionsDTO transactionsDTO) {
        transactionsDTO = transactionsTranslator.createTransaction(transactionsDTO);
        personTranslator.updateAmount(email,transactionsDTO);
    }
}
