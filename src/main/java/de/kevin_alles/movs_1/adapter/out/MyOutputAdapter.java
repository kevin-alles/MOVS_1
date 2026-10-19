package de.kevin_alles.movs_1.adapter.out;

import de.kevin_alles.movs_1.port.out.MyOutPort;
import org.springframework.stereotype.Service;


@Service
public class MyOutputAdapter implements MyOutPort {

    @Override
    public boolean safeThis(int x, int y) {
        System.out.printf("MyOutputAdapter::safeThis: x=%d, y=%d\n", x, y);
        return true;
    }
}
