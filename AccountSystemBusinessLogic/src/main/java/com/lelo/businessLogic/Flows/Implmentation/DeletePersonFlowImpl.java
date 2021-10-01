package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.DeletePersonFlow;
import com.lelo.translator.PersonTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeletePersonFlowImpl implements DeletePersonFlow {
    private final PersonTranslator personTranslator;

    @Autowired
    public DeletePersonFlowImpl(PersonTranslator personTranslator) {
        this.personTranslator = personTranslator;
    }

    @Override
    public void deletePerson(Long id) {
        personTranslator.deletePerson(id);
    }
}
