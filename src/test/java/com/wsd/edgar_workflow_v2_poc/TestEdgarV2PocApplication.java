package com.wsd.edgar_workflow_v2_poc;

import org.springframework.boot.SpringApplication;

public class TestEdgarV2PocApplication {

    public static void main(String[] args) {
        SpringApplication.from(EdgarWorkflowV2PocApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
