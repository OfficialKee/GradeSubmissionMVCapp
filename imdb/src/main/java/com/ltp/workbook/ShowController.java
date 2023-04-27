
package com.ltp.workbook;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class ShowController {
    @GetMapping("/shows")
    public String getShows(Model model){
     Show BreakingBad =   new Show("Breaking Bad", "Ozymandias", 10.0);
Show AttackOnTitan1 = new Show("Attack on Titan", "Hero", 9.9);
 Show AttackOnTitan2 = new Show("Attack on Titan", "Perfect Game", 9.9);
Show StarWars = new Show("Star Wars: The Clone Wars", "Victory and Death", 9.9);
Show MrRobot = new Show("Mr. Robot", "407 Proxy Authentication Required", 9.9);

model.addAttribute("MrRobot", MrRobot);
model.addAttribute("AttackOnTitan1", AttackOnTitan1);
model.addAttribute("AttackOnTitan2", AttackOnTitan2);
model.addAttribute("StarWars", StarWars);
model.addAttribute("BreakingBad", BreakingBad);
        return "shows";

    }
    
}