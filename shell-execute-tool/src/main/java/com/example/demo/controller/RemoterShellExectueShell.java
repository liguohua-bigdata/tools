package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import utils.RemoteShellTool;

/**
 * Created by 李国华 on 2017/9/27.
 */
@RestController
public class RemoterShellExectueShell {
    @RequestMapping(value = "/exec", method = RequestMethod.GET)
    public String exec(@RequestParam(value = "ipAddress", required = true) String ipAddres,
                       @RequestParam(value = "userName", required = true) String userName,
                       @RequestParam(value = "passWord", required = true) String passWord,
                       @RequestParam(value = "shellPath", required = true) String shellPath,
                       @RequestParam(value = "charSet", required = false, defaultValue = "utf-8") String charSet) {
        System.err.println("hhhhhhhhhhhhhhhhhhhhhhh"+ipAddres);
        System.err.println("hhhhhhhhhhhhhhhhhhhhhhh"+userName);
        System.err.println("hhhhhhhhhhhhhhhhhhhhhhh"+passWord);
        System.err.println("hhhhhhhhhhhhhhhhhhhhhhh"+shellPath);
        System.err.println("hhhhhhhhhhhhhhhhhhhhhhh"+charSet);


        RemoteShellTool tool = new RemoteShellTool(ipAddres, userName,
                passWord, charSet);
        String result = tool.exec("sh " + shellPath);
        System.err.println(result);
        return result;
    }
}
