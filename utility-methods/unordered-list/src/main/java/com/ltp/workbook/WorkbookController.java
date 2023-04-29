package com.ltp.workbook;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.core.sym.Name;

@Controller
public class WorkbookController {
    
    @GetMapping("/")
    public String getName(Model model) {
        model.addAttribute("Name", "Shikee");
        return "name-list";
    }
}
