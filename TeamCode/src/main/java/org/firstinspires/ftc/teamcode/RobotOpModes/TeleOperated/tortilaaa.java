package org.firstinspires.ftc.teamcode.RobotOpModes.TeleOperated;

import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Core.BaseClasses.OperationModes.EctoOpMode;
import org.firstinspires.ftc.teamcode.Core.Input.JoystickExpo;
import org.firstinspires.ftc.teamcode.Mechanisms.motor;
@Disabled
@TeleOp(name = "Red")
public class tortilaaa extends EctoOpMode {

    motor chassis;
    GamepadEx driverGamepad;
    JoystickExpo leftX = new JoystickExpo(0.5, 0.2);

    @Override
    public void initRobotClasses() {
        chassis = new motor("motor", "mechanism");
        mechanismManager.addMechanism(chassis);
        driverGamepad = new GamepadEx(gamepad1);
    }

    @Override
    public void initRobot() {

    }

    @Override
    public void startRobot() {

    }

    @Override
    public void updateRobot(Double timeStep) {
        leftX.update(driverGamepad.getLeftX());
        chassis.set(leftX.get());
    }
}
