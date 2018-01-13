package br.com.thescientist;


import hello.CoffeeDrinker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CoffeeDrinker.class)
@AutoConfigureMockMvc
public class CoffeeDrinkerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void somebodyIsGoingToDrinkCoffeeTest() throws Exception {
        this.mockMvc.perform(get("/coffee/drink"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("I'm going to take a coffee!")));
    }

    @Test
    public void fulanoIsGoingToDrinkCoffeeTest() throws Exception {
        this.mockMvc.perform(get("/coffee/drink").param("name", "Fulano"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Fulano drank coffee!")));
    }


}