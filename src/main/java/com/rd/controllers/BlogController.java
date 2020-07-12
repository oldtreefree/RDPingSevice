package com.rd.controllers;

import com.rd.models.IpServerList;
import com.rd.rep.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BlogController {

    @Autowired
    private PostRepository postRepository;


    @GetMapping("/servers")
    public String blogMain(Model model){
        Iterable<IpServerList> servers = postRepository.findAll();
        model.addAttribute("servers", servers);
        return "servers";
    }

    @GetMapping("/addserver")
    public String addSerser(Model model){
        return "addserver";
    }

    @PostMapping("/addserver")
    public String addserver(@RequestParam String ip_address, @RequestParam String module, Model model){
        IpServerList ipServerList = new IpServerList(ip_address, module);
        postRepository.save(ipServerList);
        return "redirect:/servers";
    }

}
