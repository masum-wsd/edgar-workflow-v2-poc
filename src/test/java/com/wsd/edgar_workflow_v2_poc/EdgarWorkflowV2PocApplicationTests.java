package com.wsd.edgar_workflow_v2_poc;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class EdgarWorkflowV2PocApplicationTests {

    @Test
    void contextLoads() {
    }

}
