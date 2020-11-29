package pl.martenn.jpaczkomaty.price;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.martenn.jpaczkomaty.pack.PackSize;

@Service
@RequiredArgsConstructor
public class PriceService implements SizePriceStrategy{

    private final PriceStrategyFactory strategyFactory;

    public int price() {
        return 10;
    }

    public void setPackSize(PackSize size) {
       strategyFactory.getPriceStrategy(size);
    }

}
