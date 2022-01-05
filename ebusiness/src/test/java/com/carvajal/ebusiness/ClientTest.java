package com.carvajal.ebusiness;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.carvajal.ebusiness.service.ClientService;
import com.carvajal.ebusiness.service.impl.ClientServiceImpl;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientTest {
    
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("clientServiceImpl")
    private ClientService clService;

    @Test
    public void loadClientsTest(){
        logger.info("Testing getAllClients Method");
        assertNotNull(clService.getAllClients(), "failed test on: "+clService.getClass().getName());
    }

}
