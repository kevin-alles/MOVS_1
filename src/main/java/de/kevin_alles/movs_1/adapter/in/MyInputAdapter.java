package de.kevin_alles.movs_1.adapter.in;

import de.kevin_alles.movs_1.port.in.MyInPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyInputAdapter {
    final MyInPort service;

    @Autowired
    public MyInputAdapter(MyInPort s){
        this.service = s;
    }

    @GetMapping
    int calcThis(int x, int y){
        int erg = service.add(x, y);
        return erg;
    }
}
