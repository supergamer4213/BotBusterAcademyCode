package org.firstinspires.ftc.teamcode.Mechanisms.Tanks;

import com.acmerobotics.roadrunner.kinematics.Kinematics;
import com.arcrobotics.ftclib.hardware.motors.MotorEx;
import com.arcrobotics.ftclib.kinematics.wpilibkinematics.ChassisSpeeds;
import com.arcrobotics.ftclib.kinematics.wpilibkinematics.DifferentialDriveKinematics;
import com.arcrobotics.ftclib.kinematics.wpilibkinematics.DifferentialDriveWheelSpeeds;

import org.firstinspires.ftc.teamcode.Core.BaseClasses.EctoMechanism;

public class Tanks extends EctoMechanism {
    MotorEx[] left, right;
    DifferentialDriveKinematics kinematics = new DifferentialDriveKinematics(0.3);

    public Tanks(String moduleName) {
        super(moduleName, "Mechanism");
    }

    void setWheelSpeeds(double left, double right){
        for(int i = 0; i < Math.min(this.left.length, this.right.length); i++){
            this.left[i].set(left);
            this.right[i].set(right);
        }

    }
    public void setPercent(ChassisSpeeds chassisSpeeds){
        DifferentialDriveWheelSpeeds wheelSpeeds = kinematics.toWheelSpeeds(chassisSpeeds);
        setWheelSpeeds(wheelSpeeds.leftMetersPerSecond, wheelSpeeds.rightMetersPerSecond);

    }
    @Override
    public void initMechanism() {
        left = new MotorEx[]{ new MotorEx(hardwareMap, "left1")};
        right = new MotorEx[]{ new MotorEx(hardwareMap, "right1")};
        for(MotorEx motor : right){
            motor.setInverted(true);
        }
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
