package com.lelo.businessLogic.Flows.Implmentation;

import com.lelo.businessLogic.Flows.DeletePersonFlow;
<<<<<<< HEAD
import com.lelo.translator.GoalsTranslator;
import com.lelo.translator.PersonTranslator;
import com.lelo.translator.TransactionsTranslator;
=======
import com.lelo.translator.PersonTranslator;
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeletePersonFlowImpl implements DeletePersonFlow {
    private final PersonTranslator personTranslator;
<<<<<<< HEAD
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

=======

    @Autowired
    public DeletePersonFlowImpl(PersonTranslator personTranslator) {
        this.personTranslator = personTranslator;
    }

    @Override
    public void deletePerson(Long id) {
        personTranslator.deletePerson(id);
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
    }
}
