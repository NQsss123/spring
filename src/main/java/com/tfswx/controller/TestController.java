package com.tfswx.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/helloword")
    public String helloword() {
        return "hello word";
    }

    @GetMapping("/mut")
    public int Multiply(){
        int a;
        int b;
        int c;
        int d;
        for(a=1;a<10;a++){
            for(b=1;b<=a;b++){
                System.out.print(a+"*"+b+"="+a*b+"\t");
            }
            System.out.println();
        }
        System.out.println("\n");
        for(c=9; c>0; c--){
            for(d=1; d<=c; d++){
                System.out.print(c+"*"+d+"="+c*d+"\t");
            }
            System.out.println();
        }
        return 0;
    }
}