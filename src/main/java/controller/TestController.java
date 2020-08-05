package main.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: chengpf
 * @package main.java.controller
 * @Description:
 * @Version V1.0
 * @Date 2020/8/5 0005 15:42
 */
@Controller
public class TestController {

    /**
     *
     * @return
     */
    @RequestMapping("test")
    public ModelAndView test() {

        System.out.println("hello world");

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "hello world");
        modelAndView.setViewName("/WEB-INF/jsp/hello.jsp");

        return modelAndView;
    }

}
