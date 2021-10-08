package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.UpdatePersonFlow;
import com.lelo.translator.PersonTranslator;
<<<<<<< HEAD
import com.lelo.translator.TransactionsTranslator;
import com.lelo.webdomain.dtos.PersonDTO;
import com.lelo.webdomain.dtos.TransactionsDTO;
=======
import com.lelo.webdomain.dtos.PersonDTO;
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdatePersonFlowImpl implements UpdatePersonFlow {
    private final PersonTranslator personTranslator;
<<<<<<< HEAD
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
=======

    @Autowired
    public UpdatePersonFlowImpl(PersonTranslator personTranslator) {
        this.personTranslator = personTranslator;
    }

    @Override
    public PersonDTO updatePerson(Long id) {
        PersonDTO personDTO = personTranslator.updatePerson(id);
        return personDTO;
    }
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
}
