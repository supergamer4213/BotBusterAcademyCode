package org.firstinspires.ftc.teamcode.Mechanisms.MotorServo;

import com.arcrobotics.ftclib.controller.wpilibcontroller.ProfiledPIDController;
import com.arcrobotics.ftclib.hardware.motors.MotorEx;
import com.arcrobotics.ftclib.trajectory.TrapezoidProfile;

import org.firstinspires.ftc.teamcode.Core.BaseClasses.EctoMechanism;
import org.firstinspires.ftc.teamcode.Core.Utils.EctoMath;

public class MotorServo extends EctoMechanism {

    MotorEx motor;
    ProfiledPIDController controller = new ProfiledPIDController(
            0.5, 0, 0,
            new TrapezoidProfile.Constraints(100,100)
    );

    double SetPoint = 0;

    public MotorServo(String moduleName) {
        super(moduleName, "mechanism");
    }

    double getPose(){
        return EctoMath.ticksToRads(motor.getCurrentPosition(),28 , 13.7);
    }

    public void set(double set){
        controller.setGoal(set);
    }
    @Override
    public void initMechanism() {
        controller.reset();
        motor = new MotorEx(hardwareMap, "Servo");

    }

    @Override
    public void startMechanism() {

    }

    @Override
    public void updateMechanism() {
        double out = controller.calculate(getPose());
        motor.set(out);
    }

    @Override
    public void stopMechanism() {

    }
}
