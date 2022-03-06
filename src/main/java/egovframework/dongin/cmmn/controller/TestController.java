package egovframework.dongin.cmmn.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.dongin.ivory.service.TestService;
import egovframework.dongin.ivroy.vo.TestVO;

@Controller
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping(value="/main.do")
	public String mainDo() {
		return "main";
	}
	
	
    @RequestMapping(value="/testList.do")
    public String testListDo(TestVO testVO, Model model) throws Exception{
        
        model.addAttribute("list", testService.selectTest(testVO));
        
        return "test/testList";
    }
    
    @RequestMapping(value="/selectOne.do")
    public String seleteOne(Model model, HttpServletRequest request) throws Exception{
        
        int testId = Integer.parseInt(request.getParameter("testId"));
        
        TestVO testVO = testService.selectOne(testId);
        model.addAttribute("vo", testVO);
        
        
        return "test/selectOne";
    }
    
    @RequestMapping(value="/testRegister.do")
    public String testRegisterDo(){
        
    	return "test/testRegister";
    }
    
    @RequestMapping(value="/insert.do")
    public String insertTest(@ModelAttribute("testVO") TestVO testVO) throws Exception{
        
    	testService.insertTest(testVO);
    	
        return "redirect:testList.do";
    }
    
    @RequestMapping(value="/update.do")
    public String updateTest(@ModelAttribute("testVO")TestVO testVO) throws Exception{
        
        testService.updateTest(testVO);
        
        return "redirect:selectOne.do?testId="+testVO.getTestId();
    }
    
    @RequestMapping(value="/delete.do")
    public String deleteTest(HttpServletRequest request) throws Exception{
        
        int testId = Integer.parseInt(request.getParameter("testId"));
        testService.deleteTest(testId);
        
        
        return "redirect:testList.do";
    }



}
