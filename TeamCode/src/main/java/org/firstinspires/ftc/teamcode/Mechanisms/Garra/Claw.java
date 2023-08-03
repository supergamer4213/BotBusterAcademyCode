package org.firstinspires.ftc.teamcode.Mechanisms.Garra;

import android.os.SystemClock;
import com.arcrobotics.ftclib.hardware.ServoEx;
import com.arcrobotics.ftclib.hardware.SimpleServo;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.ServoController;
import com.qualcomm.robotcore.hardware.ServoImplEx;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.teamcode.Core.BaseClasses.EctoMechanism;


public class Claw extends EctoMechanism {

    ServoEx arm1;
    ServoEx arm2;


    Motor box;

    private double maxAngle, minAngle;


    private final double maxPosition = 1;
    private final double minPosition = 0;


    public Claw(String moduleName, String moduleType) { super(moduleName, moduleType);}

    public void setArm(double angle) {
        arm1.setPosition(angle);
        arm2.setPosition(angle);
    }

    public void setBox(double Speed) {
        box.set(Speed);

    }

    @Override
    public void initMechanism(){
        arm1 = new SimpleServo(hardwareMap, "arm1", 0, 180, AngleUnit.DEGREES);
        arm2 = new SimpleServo(hardwareMap, "arm2", 0, 180, AngleUnit.DEGREES);
        arm1.setInverted(true);
        box = new Motor(hardwareMap, "arm");
    }
    @Override
    public void startMechanism(){
    }

    @Override
    public void updateMechanism(){
    }
    @Override
    public void stopMechanism(){

      }
    }