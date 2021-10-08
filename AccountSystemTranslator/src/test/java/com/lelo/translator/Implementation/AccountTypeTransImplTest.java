package com.lelo.translator.Implementation;

import com.lelo.repo.files.AccountTypeRepository;
import com.lelo.translator.AccountTypeTranslator;
import com.lelo.webdomain.dtos.AccountTypeDTO;
import com.lelo.webdomain.persistence.AccountType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AccountTypeTransImplTest {

    @Mock
    private AccountTypeRepository accountTypeRepository;

    private AccountTypeTransImpl testacc;

    @BeforeEach
    void setUp() {
        testacc = new AccountTypeTransImpl(accountTypeRepository);
    }

    @Test
    void getAccountypes() {
        testacc.getAccountypes();
        verify(accountTypeRepository).findAll();
    }

    @Test
    void getAccountType() {
         testacc.getAccountType("Miles");
        verify(accountTypeRepository).getAccountTypeByNmonic("Miles");
    }

    @Test
    void createAccountType() {
        AccountTypeDTO account = new AccountTypeDTO("DOLLARS",
                "dollars account");
        testacc.createAccountType(account);
        verify(accountTypeRepository).save(account.buildAccountType(account));
    }

    @Test
    void deleteAccountType() {
        testacc.deleteAccountType("Miles");
        AccountType accountType = accountTypeRepository.getAccountTypeByNmonic("Miles");
        //verify(accountTypeRepository).getAccountTypeByNmonic("Miles");
        verify(accountTypeRepository).delete(accountType);
    }
}