package com.grade.controller;

import com.grade.entity.Studentinfo;
import com.grade.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StuController {
  @Autowired
  private StuService stuService;
  @RequestMapping("/getAllSelect")
    public String getAllSelect(Model model){
      List<Studentinfo>stuList=stuService.getAllSelect();
      System.out.println(stuList);
      model.addAttribute("stuList",stuList);

      return "StuList";
  }
  @RequestMapping("/insertSelective")
  public String insertSelective(Studentinfo s){
    stuService.insertSelective(s);
    return  "redirect:getAllSelect";
  }


}
