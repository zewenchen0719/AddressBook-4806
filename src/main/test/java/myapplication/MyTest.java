package myapplication;

import myapplication.AddressBook.AddressBook;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@AutoConfigureMockMvc
public class MyTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testResult() throws Exception {
        this.mockMvc.perform(get("/ZewenWebPage")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("zewen 1833 123456\n" +
                        "zewen 1833 123456\n" +
                        "zewen 1833 123456")));
    }
}