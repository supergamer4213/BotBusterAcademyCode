package org.firstinspires.ftc.teamcode.RobotOpModes.TeleOperated;

public class RobotState {
    public double arm;
    public double manipulatorAngle;

    public RobotState(double arm, double manipulatorAngle) {
        this.arm = arm;
        this.manipulatorAngle = manipulatorAngle;
    }

    public RobotState(){}
}

