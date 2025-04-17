package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping("/base")
    public String base() {
        // 获取设置的系统属性的值
        String propertyValue = System.getProperty("com.example.property");
        System.out.println(propertyValue);

        return "Base page";
    }
}
