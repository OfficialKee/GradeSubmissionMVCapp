package com.ltp.gradesubmission;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
@Controller
public class GradeController {

    List<Grade> studentGrade = Arrays.asList(
    new Grade("Harry", "Potions", "C-"),
    new Grade("Hermione", "Arithmetic", "A-"),
    new Grade("Neville", "Charmes", "B-") );
   
       
       

    @GetMapping("/grades")
    public String getGrades(Model model){
       
       model.addAttribute("grades", studentGrade);
        
        return "grades";
    }
    @GetMapping("/shows")
    public String getShows(){
        return "shows";
    }
    
}
