package com.example;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by trainer11 on 3/28/17.
 */
public class MathServiceTest {

    MathService mathService = new MathService();

    @Test
    public void testSettersAndGetters() {
        mathService.setX(12);
        mathService.setY(14);
        mathService.setOperation("add");
        List<Integer> listNumbers = new ArrayList<Integer>();
        listNumbers.add(10);
        listNumbers.add(17);
        mathService.setN(listNumbers);

        assert(mathService.getX() == 12);
        assert(mathService.getY() == 14);
        assert(mathService.getN() == listNumbers);
        assert(mathService.getOperation() == "add");
    }

}
