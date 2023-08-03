package org.firstinspires.ftc.teamcode.RobotOpModes.TeleOperated;

import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Core.BaseClasses.OperationModes.EctoOpMode;
import org.firstinspires.ftc.teamcode.Mechanisms.Garra.Claw;


@TeleOp
public class ControlArm extends EctoOpMode {

    Claw claw;
    GamepadEx control;

    @Override
    public void initRobotClasses() {
        claw = new Claw("claw", "Mechanism");
        control = new GamepadEx(gamepad1);
        mechanismManager.addMechanism(claw);

    }

    @Override
    public void initRobot() {
        ;
    }

    @Override
    public void startRobot() {
        ;
    }

    @Override
    public void updateRobot(Double timeStep) {
        if (control.getButton(GamepadKeys.Button.A)) {
            claw.setArm(90);
        }
        if (control.getButton(GamepadKeys.Button.B)) {
            claw.setArm(0);

        }
    }
}
