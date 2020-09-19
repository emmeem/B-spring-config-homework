package com.thoughtworks.capability.gtb.demospringconfig.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("qa")
public class LevelControllerTests {
    @Autowired
    private LevelController levelController;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnAdvancedWhenLevelNumberEqual1() throws Exception {

        mockMvc.perform(get("/level"))
                .andExpect(content().string("advanced"));
    }
}
