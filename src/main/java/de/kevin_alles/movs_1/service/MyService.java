package de.kevin_alles.movs_1.service;

import de.kevin_alles.movs_1.port.in.MyInPort;
import de.kevin_alles.movs_1.port.out.MyOutPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService implements MyInPort {

    MyOutPort myOutPort;

    @Autowired
    public MyService(MyOutPort m){
        this.myOutPort = m;
    }

    @Override
    public int add(int x, int y) {
        myOutPort.safeThis(x, y);
        return x + y;
    }
}
