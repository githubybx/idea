package com.example.demo.Login;

import com.example.demo.User.User;
import com.example.demo.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @Autowired
    UserService service;

    @RequestMapping("/toLogin")
    public String Login() {
        return "Login";
    }

    @RequestMapping("/JudgeLogin")
    public ModelAndView judjeLogin(@RequestParam("sname") String sname, @RequestParam("pass") String pass, ModelAndView modelAndView) {
        User user = service.SelectBySnameAndPass(sname, pass);
        if (user == null) {
            System.out.println("登录失败");
            modelAndView.setViewName("failed");
            return modelAndView;
        } else {
            System.out.println("登陆成功");
            modelAndView.setViewName("success");
            return modelAndView;
        }
    }
}
