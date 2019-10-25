package com.example.demo.controller;

import com.example.demo.dto.BookDTO;
import com.example.demo.dto.ResponseDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/example")
public class ExampleController {

    @GetMapping("/get_book")
    public ResponseDTO getBook() {
        BookDTO data = new BookDTO("遮天", 50, "辰东", "这是一本玄幻小说");
        return new ResponseDTO(true, "", data);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
