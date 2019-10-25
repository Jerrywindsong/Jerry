package com.iot.shop.controller;

import com.iot.shop.dto.BookDTO;
import com.iot.shop.dto.ResponseDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
@ResponseBody
@RequestMapping("/example")
public class ExampleController {

    @RequestMapping("/get_book_info")
    public Object getBookInfo() {
        BookDTO data = new BookDTO("我是玄幻小说", 15, "玄幻", "一本玄幻小说");
        return new ResponseDTO(true, "", data);
    }

    @GetMapping("/")
    public String hello() {
        return "hello";
    }
}
