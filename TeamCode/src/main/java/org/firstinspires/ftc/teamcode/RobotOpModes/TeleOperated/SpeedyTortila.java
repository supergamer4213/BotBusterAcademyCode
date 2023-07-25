package org.firstinspires.ftc.teamcode.RobotOpModes.TeleOperated;

import com.arcrobotics.ftclib.command.SequentialCommandGroup;
import com.arcrobotics.ftclib.command.button.Trigger;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.kinematics.wpilibkinematics.ChassisSpeeds;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.Core.BaseClasses.OperationModes.EctoOpMode;
import org.firstinspires.ftc.teamcode.Core.Utils.EctoMath;
import org.firstinspires.ftc.teamcode.Mechanisms.SampleMechanism.SampleMechanism;

import java.util.function.BooleanSupplier;

@TeleOp(name ="SpeedyTortilaaaa", group = "Final")
public class SpeedyTortila extends EctoOpMode {
    //Timmer
    ElapsedTime runtime = new ElapsedTime();
    //Controllers
    GamepadEx driverGamePad;
    GamepadEx operatorGamePad;

    SampleMechanism mechanism;

    Trigger sampleButton = new Trigger(() -> {return driverGamePad.getButton(RobotConfiguration.Buttons.dPadUp);});




    @Override
    public void initRobotClasses() {
        // Controllers
        driverGamePad = new GamepadEx(gamepad1);
        operatorGamePad = new GamepadEx(gamepad2);

        mechanism = new SampleMechanism("SampleMechanism", "Mechanism");
        mechanismManager.addMechanism(mechanism);

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


        //this is the update loop of the update,
        //here you can run check loops for mechanism
        //or control of them.
        telemetry.update();
        dashboard.getTelemetry().update();
    }
}
