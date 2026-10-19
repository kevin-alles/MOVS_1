package de.kevin_alles.movs_1.adapter.out;

import de.kevin_alles.movs_1.port.out.CalcOutPort;
import org.springframework.stereotype.Service;

@Service
public class CalcOutputAdapter implements CalcOutPort {
    @Override
    public boolean logThis(String method, int x, int y) {
        System.out.printf("Logging %s(%d, %d)\n", method, x, y);
        return true;
    }
}
