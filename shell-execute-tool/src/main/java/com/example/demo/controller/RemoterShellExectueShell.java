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
    @RequestMapping(value = "/execFile", method = RequestMethod.GET)
    public String execFile(@RequestParam(value = "ipAddress", required = true) String ipAddres,
                       @RequestParam(value = "userName", required = true) String userName,
                       @RequestParam(value = "passWord", required = true) String passWord,
                       @RequestParam(value = "shellPath", required = true) String shellPath,
                       @RequestParam(value = "charSet", required = false, defaultValue = "utf-8") String charSet) {
        //add debug info
        System.out.println("ipAddres: "+ipAddres);
        System.out.println("userName: "+userName);
        System.out.println("passWord: "+passWord);
        System.out.println("shellPath: "+shellPath);
        System.out.println("charSet: "+charSet);

        RemoteShellTool tool = new RemoteShellTool(ipAddres, userName,
                passWord, charSet);
        String result = tool.exec("sh " + shellPath);
        System.err.println(result);
        return result;
    }
//    @RequestMapping(value = "/execCmd", method = RequestMethod.GET)
//    public String execCmd(@RequestParam(value = "ipAddress", required = true) String ipAddres,
//                           @RequestParam(value = "userName", required = true) String userName,
//                           @RequestParam(value = "passWord", required = true) String passWord,
//                           @RequestParam(value = "cmd", required = true) String cmd,
//                           @RequestParam(value = "charSet", required = false, defaultValue = "utf-8") String charSet) {
//        //add debug info
//        System.out.println("ipAddres: "+ipAddres);
//        System.out.println("userName: "+userName);
//        System.out.println("passWord: "+passWord);
//        System.out.println("cmd: "+cmd);
//        System.out.println("charSet: "+charSet);
//
//        RemoteShellTool tool = new RemoteShellTool(ipAddres, userName,
//                passWord, charSet);
//        String result = tool.exec(cmd.trim());
//        System.err.println(result);
//        return result;
//    }
}
