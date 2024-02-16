package com.in28minutes.springboot.springwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    //"say-hello" = "Hello! What are you learning today?"
    // http://localhost:8080/
    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hello! What are you learning today?";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml(){
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html>");
        buffer.append("<head>");
        buffer.append("<title> My first HTML Page - Changed </title>");
        buffer.append("</head>");
        buffer.append("<body>");
        buffer.append("My first html page with body - Changed");
        buffer.append("</body>");
        buffer.append("</html>");
        return buffer.toString();
    }

    //"say-hello-jsp" => sayHello.jsp
    //META-INF/resources/WEB-INF/jsp/sayHello.jsp
    //src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp(){
        return "sayHello";
    }
}
