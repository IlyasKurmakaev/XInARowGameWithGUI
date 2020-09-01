package com.KurmOS.gameModules.playerStepManagment;

/**
 * Created by Ilyas on 07.11.2017.
 */
public interface IPaintMakeStep {
    void initializeStep(int id);

    void paintStep(int id, int x, int y, boolean winner);
}
