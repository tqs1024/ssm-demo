package top.harmonytqs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import top.harmonytqs.service.DemoService;

/**
 * @Author : 谭庆山
 * @Date : 2021/8/31 22:09
 * @Description TODO
 */
@Controller
public class DemoController {

    @Autowired
    private DemoService service;

    @GetMapping("index")
    public String index() {
        return "index";
    }

    @GetMapping("name/{id}")
    @ResponseBody
    public String getNameById(@PathVariable("id") Integer id) {
        return service.findNameById(id);
    }
}
