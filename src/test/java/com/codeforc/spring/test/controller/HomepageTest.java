package com.codeforc.spring.test.controller;

import com.codeforc.spring.controller.HomeController;
import org.junit.Test;
import org.junit.platform.commons.util.StringUtils;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import javax.annotation.Resource;

/**
 * @author: Ifan·Huang
 **/
@RunWith(SpringRunner.class)
@WebMvcTest(HomeController.class)
public class HomepageTest {

    @Resource
    private MockMvc mockMvc;

    @Test
    public void testHomepage() throws Exception {
        ResultActions home = mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("home"));
    }

}
