package org.firstinspires.ftc.teamcode.Mechanisms.Servo;

import com.arcrobotics.ftclib.hardware.ServoEx;
import com.arcrobotics.ftclib.hardware.SimpleServo;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.teamcode.Core.BaseClasses.EctoMechanism;

public class Servo extends EctoMechanism {

    public  ServoEx servo;

    public Servo(String moduleName, String moduleType) {
        super(moduleName, moduleType);
    }

    public  void setToZero(){
        servo.setPosition(0);
    }

    public  void setAngle (double x){
        servo.rotateByAngle(x, AngleUnit.DEGREES);
    }

    @Override
    public void initMechanism() {
        servo = new SimpleServo(hardwareMap, "servo", 0, 270, AngleUnit.DEGREES);
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
