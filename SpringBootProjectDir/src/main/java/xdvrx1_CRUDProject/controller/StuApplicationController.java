package xdvrx1_CRUDProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StuApplicationController {

	@Autowired
	private StudentService service; 
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Student> listStudent = service.listAll();
		model.addAttribute("listStudent", listStudent);
		
		return "index";
	}
		
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveStuData(@ModelAttribute("student") Student student) {
		service.save(student);
		
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditStuPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_student");
		Student student = service.get(id);
		mav.addObject("student", student);
		
		return mav;
	}
	
}
