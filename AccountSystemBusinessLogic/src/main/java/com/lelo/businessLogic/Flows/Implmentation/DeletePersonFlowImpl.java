package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.DeletePersonFlow;
import com.lelo.translator.GoalsTranslator;
import com.lelo.translator.PersonTranslator;
import com.lelo.translator.TransactionsTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeletePersonFlowImpl implements DeletePersonFlow {
    private final PersonTranslator personTranslator;
    private final GoalsTranslator goalsTranslator;
    private final TransactionsTranslator transactionsTranslator;

    @Autowired
    public DeletePersonFlowImpl(PersonTranslator personTranslator, GoalsTranslator goalsTranslator, TransactionsTranslator transactionsTranslator) {
        this.personTranslator = personTranslator;
        this.goalsTranslator = goalsTranslator;
        this.transactionsTranslator = transactionsTranslator;
    }

    @Override
    public void deletePerson(String email) {
        goalsTranslator.deleteGoals(email);
        transactionsTranslator.deleteTransactionsByEmail(email);
        personTranslator.deletePerson(email);

    }
}
