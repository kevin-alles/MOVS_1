package de.kevin_alles.movs_1.service;

import de.kevin_alles.movs_1.port.in.CalcInPort;
import de.kevin_alles.movs_1.port.out.CalcOutPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalcService implements CalcInPort {

    final CalcOutPort coutp;

    @Autowired
    public CalcService(CalcOutPort coutp){
        this.coutp = coutp;
    }

    @Override
    public int add(int x, int y) {
        coutp.logThis("add", x, y);
        return x + y;
    }

    @Override
    public int sub(int x, int y) {
        coutp.logThis("sub", x, y);
        return x - y;
    }

    @Override
    public int mult(int x, int y) {
        coutp.logThis("mult", x, y);
        return x * y;
    }

    @Override
    public double div(int x, int y) {
        coutp.logThis("div", x, y);
        return (double) x / y;
    }
}
