package com.org.company.hr.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Amber on 22-12-2019.
 */
@RestController
public class HeartBeat
{
    @RequestMapping("heartbeat")
    public String heartbeat()
    {
        return "Always up and running for you";
    }
}
