/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author Administrator
 */
@Controller
public class HomeControler {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "home";
    }

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String show() {
        return "show";
    }

//    @RequestMapping(value = "/addstudent", method = RequestMethod.GET)
//    public ModelAndView addStudent() {
//        return new ModelAndView("addstudent", "command", new Student());
//    }
//
//    @RequestMapping(value = "/studentinfo", method = RequestMethod.POST)
//    public String studentinfo(@ModelAttribute("SpringFramework") Student student, ModelMap model) {
//        model.addAttribute("student", student);
//        return "studentinfo";
//    }

}
