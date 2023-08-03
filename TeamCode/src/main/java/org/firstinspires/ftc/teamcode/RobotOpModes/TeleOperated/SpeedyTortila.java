package org.firstinspires.ftc.teamcode.RobotOpModes.TeleOperated;

import com.arcrobotics.ftclib.command.button.Trigger;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.Core.BaseClasses.OperationModes.EctoOpMode;
import org.firstinspires.ftc.teamcode.Mechanisms.SampleMechanism.Tank;

@TeleOp(name ="Green", group = "Final")
public class SpeedyTortila extends EctoOpMode {
    //Timmer
    ElapsedTime runtime = new ElapsedTime();
    //Controllers
    GamepadEx driverGamePad;
    

    Tank chassis;

    Trigger sampleButton = new Trigger(() -> {
        return driverGamePad.getButton(RobotConfiguration.Buttons.dPadUp);
    });


    @Override
    public void initRobotClasses() {
        // Controllers
        driverGamePad = new GamepadEx(gamepad1);
        

        chassis = new Tank("SampleMechanism", "Mechanism");
        mechanismManager.addMechanism(chassis);

    }

    @Override
    public void initRobot() {
        ;
    }

    @Override
    public void startRobot() {
        runtime.startTime();
    }

    @Override
    public void updateRobot(Double timeStep) {
        commandScheduler.run();
        chassis.set(driverGamePad.getRightY(), driverGamePad.getLeftY());
        telemetry.update();
        dashboard.getTelemetry().update();
    }

}