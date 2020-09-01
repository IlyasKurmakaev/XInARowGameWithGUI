package com.KurmOS.core.lineWinStrategy;

import com.KurmOS.core.coreUtills.WinContainer;
import com.KurmOS.core.Field;

/**
 * Created by Ilyas on 02.11.2017.
 */
public interface ICalculateWinStrategy {
    public void calculateLine(int x, int y, WinContainer winContainer, Field field, int id, int xInARow);

}
