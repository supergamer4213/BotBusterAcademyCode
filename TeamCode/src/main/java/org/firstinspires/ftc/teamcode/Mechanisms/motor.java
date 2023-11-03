package org.firstinspires.ftc.teamcode.Mechanisms;

import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.arcrobotics.ftclib.hardware.motors.MotorEx;

import org.firstinspires.ftc.teamcode.Core.BaseClasses.EctoMechanism;

public class motor extends EctoMechanism {

    MotorEx motorLeft;


    public void set(double voltage){
        motorLeft.set(voltage);
    }

    public motor(String moduleName, String moduleType) {
        super(moduleName, moduleType);
    }

    @Override
    public void initMechanism() {
        motorLeft = new MotorEx(hardwareMap, "motor");
        motorLeft.setZeroPowerBehavior(Motor.ZeroPowerBehavior.BRAKE);
    }

    @Override
    public void startMechanism() {

    }

    @Override
    public void updateMechanism() {

    }

    @Override
    public void stopMechanism() {

    }
}
