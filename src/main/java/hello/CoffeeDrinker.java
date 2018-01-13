package hello;

import br.com.thescientist.Drinker;
import hello.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/coffee")
public class CoffeeDrinker {

    @RequestMapping(value = "/drink", method = RequestMethod.GET)
    public @ResponseBody String sayHello(@RequestParam(value = "name", required = true, defaultValue = "Someone") String name) {
        if (name.equals("Someone")) {
            return "I'm going to take a coffee!";
        } else {
            return name + " drank coffee!";
        }
    }


}
