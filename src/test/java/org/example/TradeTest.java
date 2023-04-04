package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)

public class TradeTest {
    double initialPrice;
    Trade trade;

     @BeforeEach
     void setup(){
         initialPrice = 15.25;
         trade = new Trade("t1", "APPL", 100, initialPrice);
     }
    @Test
    void testSetPriceForNegativeValues() {
        //setup
        double negativePrice = -15.25;

        //act
        trade.setPrice(negativePrice);

        //assert
        assertEquals(initialPrice, trade.getPrice());
    }

    @Test
    void testSetPriceForPositiveValues(){
        //setup
        double positivePrice = 25.6;

        //act
        trade.setPrice(positivePrice);

        //assert
        assertEquals(positivePrice, trade.getPrice());
    }

    @Test
    void testToSeeIfInitialPriceCanBeNegative(){
         //setup
         double initialNegativePrice = -30.3;
         Trade trade2 = new Trade("t2", "Aoop", 101, initialNegativePrice);

         //act
//        trade.setPrice(newPrice);

        //assert
        Assertions.assertNotEquals(initialNegativePrice, trade2.getPrice());

    }
}
