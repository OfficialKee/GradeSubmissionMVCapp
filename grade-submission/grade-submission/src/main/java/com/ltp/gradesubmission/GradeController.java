package com.ltp.gradesubmission;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
@Controller
public class GradeController {

    List<Grade> studentGrade = new ArrayList<>();
   
       
       

    @GetMapping("/grades")
    public String getGrades(Model model){
       
       model.addAttribute("grades", studentGrade);
        
        return "grades";
    }
    @GetMapping("/shows")
    public String getShows(){
        return "shows";
    }

    @GetMapping("/")
    public String getForm(Model model, @RequestParam(required=false) String name){
     
        model.addAttribute("grade", getGradeIndex(name)== -1000 ? new Grade(): studentGrade.get(getGradeIndex(name)));

        return "form";
    }
    

    @PostMapping("/handleSubmit")
    public String submitGrade(Grade grade){
        int index = getGradeIndex(grade.getName());
        if(index == -1000){
            studentGrade.add(grade);
        }else{
            studentGrade.set(index,grade);
        }
       
        return "redirect:/grades";

    }

    public Integer getGradeIndex(String name){
        for(int i =0; i< studentGrade.size();i++){
            if(studentGrade.get(i).getName().equals(name)){
                return i;
            }
           

        }
        return -1000;

    }
}
