package MockTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.chetan.springbootstarter.controller.DemoController;

@RunWith(JUnit4ClassRunner.class)
public class DemoControllerTest {

	private MockMvc mockMvc;
	
	@InjectMocks
	private DemoController demoController;
	
	@Before
	public void setup() throws Exception{
		mockMvc = MockMvcBuilders.standaloneSetup(demoController).build();
	}
	
	@Test
	public void getMessageTest() throws Exception{
		
		mockMvc.perform(MockMvcRequestBuilders.get("/api"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().string("Hey Chetan, Hows you doing ? This is your first springboot application"));
	}
}
