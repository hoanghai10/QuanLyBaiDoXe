/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlbaiguixe.model;

/**
 *
 * @author hthkt
 */
public class VE {
    public String MAVE;
    public String TINHTRANGVE;

    public VE(String MAVE, String TINHTRANGVE) {
        this.MAVE = MAVE;
        this.TINHTRANGVE = TINHTRANGVE;
    }

    public String getMAVE() {
        return MAVE;
    }

    public void setMAVE(String MAVE) {
        this.MAVE = MAVE;
    }

    public String getTINHTRANGVE() {
        return TINHTRANGVE;
    }

    public void setTINHTRANGVE(String TINHTRANGVE) {
        this.TINHTRANGVE = TINHTRANGVE;
    }

    @Override
    public String toString() {
        return MAVE.toString();
    }
    
    

    public VE() {
    }
}
