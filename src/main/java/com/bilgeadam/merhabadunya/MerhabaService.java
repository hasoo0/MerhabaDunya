package com.bilgeadam.merhabadunya;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MerhabaService {

    @GetMapping("/Merhaba")
    public String selamla()
    {
        return "Merhaba BilgeAdam Java Grubu";
    }


    // @RequestMapping(value = "/gonder",method = RequestMethod.GET )
    @GetMapping("/gonder")
    public String ugurla()
    {
        String mesaj = "Gule Gule";

        return mesaj;
    }

}
