package Controllers;

import Model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class StudentsController {

    @RequestMapping(value = "/studentadd", method = RequestMethod.GET)
    public ModelAndView addStudent() {
        return new ModelAndView("studentadd", "command", new Student());
    }

    @RequestMapping(value = "/studentinfo", method = RequestMethod.POST)
    public String studentinfo(@ModelAttribute("SpringFramework") Student student, ModelMap model) {
        model.addAttribute("student", student);
        return "studentinfo";
    }

}
