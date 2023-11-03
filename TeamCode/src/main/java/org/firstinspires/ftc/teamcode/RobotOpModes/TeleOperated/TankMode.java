package org.firstinspires.ftc.teamcode.RobotOpModes.TeleOperated;

import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.kinematics.wpilibkinematics.ChassisSpeeds;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.Core.BaseClasses.OperationModes.EctoOpMode;
import org.firstinspires.ftc.teamcode.Mechanisms.MotorServo.MotorServo;
import org.firstinspires.ftc.teamcode.Mechanisms.Servo.Servo;
import org.firstinspires.ftc.teamcode.Mechanisms.Tanks.Tanks;
import org.firstinspires.ftc.teamcode.Mechanisms.motor;

@TeleOp(name = "ElPouRoberto", group = "Testing")
public class TankMode extends EctoOpMode {
    ElapsedTime elapsedTime = new ElapsedTime();
    Tanks tanks;
    Servo servo;
    double maxTankAngularVelocity = 1;
    GamepadEx driverGamepad;
    @Override
    public void initRobotClasses() {
        tanks = new Tanks("Tank");
        mechanismManager.addMechanism(tanks);
        driverGamepad = new GamepadEx(gamepad1);
        servo = new Servo("Servo", "Mechanism");
        mechanismManager.addMechanism(servo);
    }

    @Override
    public void initRobot() {

    }

    @Override
    public void startRobot(){ elapsedTime.startTime(); }

    //ESTE ES EL PRINCIPAL

    @Override
    public void updateRobot(Double timeStep) {
        ChassisSpeeds speeds = new ChassisSpeeds(-driverGamepad.getLeftY(), 0, driverGamepad.getRightX() * maxTankAngularVelocity);
        tanks.setPercent(speeds);
        if (driverGamepad.getButton(RobotConfiguration.Buttons.a)){
            servo.setAngle(90);
        }
        if (driverGamepad.getButton(RobotConfiguration.Buttons.b)){
            servo.setToZero();
        }
    }
}
