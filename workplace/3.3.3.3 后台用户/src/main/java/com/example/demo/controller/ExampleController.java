package com.example.demo.controller;

import com.example.demo.dto.BookDTO;
import com.example.demo.dto.ResponseDTO;
import net.minidev.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/example")
public class ExampleController {

    @GetMapping("/get_book")
    public ResponseDTO getBook() {
        BookDTO data = new BookDTO("遮天", 50, "辰东", "这是一本玄幻小说");
        return new ResponseDTO(true, "", data);
    }

    @PostMapping("/set_book")
    public ResponseDTO setBook(@RequestBody JSONObject jsonObject) {
        // 前端提交的数据为json格式 存放在jsonObject对象中
        System.out.println(jsonObject.toJSONString());
        System.out.println(jsonObject.get("name"));
        System.out.println(jsonObject.get("price"));
        System.out.println(jsonObject.get("author"));
        System.out.println(jsonObject.get("brief"));
        return new ResponseDTO(true, "", "");
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
