package de.kevin_alles.movs_1.adapter.in;

import de.kevin_alles.movs_1.port.in.CalcInPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcInputAdapter {
    final CalcInPort service;

    @Autowired
    public CalcInputAdapter(CalcInPort s){
        this.service = s;
    }

    @GetMapping("/add")
    int addThis(int x, int y){
        return service.add(x, y);
    }

    @GetMapping("/sub")
    int subThis(int x, int y){
        return service.sub(x, y);
    }

    @GetMapping("/mult")
    int multThis(int x, int y){
        return service.mult(x, y);
    }

    @GetMapping("/div")
    double divThis(int x, int y){
        if (y == 0)
            throw new ArithmeticException();
        return service.div(x, y);
    }
}
