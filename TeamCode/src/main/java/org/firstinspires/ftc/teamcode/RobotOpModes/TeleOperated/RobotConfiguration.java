package org.firstinspires.ftc.teamcode.RobotOpModes.TeleOperated;

import com.acmerobotics.dashboard.config.Config;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;

import org.firstinspires.ftc.teamcode.Core.Utils.EctoMath;

@Config
public class RobotConfiguration {

    public static final class RobotConstants {
        public static final class Chassis {
            public static final String leftMotorId = "left";
            public static final double leftMotorTPR = 22.2;
            public static final String rightMotorId = "right";
            public static final double rightMotorTPR = 24.2;
            public static final double trackWidth = 0.369;
            public static final double wheelDiameter = 0.09;
            public static final double wheelCircumference = 2 * Math.PI * (wheelDiameter / 2);
            public static final double maxSpeed = 2.71;
            public static final double modifier = 0.25;//0.25
        }

        public static final class Arm {
            public static final String leftMotorId = "armLeft";
            public static final String rightMotorId = "armRight";
            public static final boolean invertMotor = true;
            public static final double gearRatio = 125.0 / 15.0;
            public static final double maxVel = 1.57;
            public static final double maxAccel = 4;
            public static final double tpr = 288.0;
            public static final double p = 4.2;
            public static final double i = 0.0001;
            public static final double d = 0;
            public static final double tol = 0.05;
        }

        public static final class Elevator {
            public static final String masterMotorId = "masterMotor";
            public static final String slaveMotorId = "slaveMotor";
            public static final String slaveMotor1Id = "slaveMotor1";

            public static final double upperSoftLimit = 1.0;
            public static final double lowerSoftLimit = 0.0;
            public static final String touchSensorId = "touchSensor";
            public static final double Kp = 0.0;
            public static final double Ki = 0.0;
            public static final double Kd = 0.0;
            public static final double Ks = 0.0;
            public static final double KG = 0.0;
            public static final double Kv = 0.0;
            public static final double Ka = 0.0;
            public static final double maxVel = 0.0;
            public static final double maxAccel = 0.0;

            public static final double tol = 0.1;

            public static final double pulleyDiameter = 0.0;
            public static final double internalMotorGearRatio = 1;
            public static final double gearBoxGearRatio = 1.0;
            public static final double motorTickPerRev = 28.0;


        }

        public static final class Intake{
            public static final String masterId = "intake";
        }
        public static final class Manipulator {
            public static final String leftServoId = "left";
            public static final String rightServoId = "right";
            public static final double minAngle = EctoMath.degToRad(-135.0);
            public static final double maxAngle = EctoMath.degToRad(135.0);
            public static final boolean isInverted = true;
        }

        public static final class RobotStates {
            public static final RobotState intakePose = new RobotState(0.083 + EctoMath.degToRad(9.0),1.25 - EctoMath.degToRad(5));
            public static final RobotState lowPose = new RobotState(1.1, 0.25);
            public static final RobotState midPose = new RobotState(1.571, 0.25);
            public static final RobotState highPose = new RobotState(2.35, 0.25);
            public static final RobotState stratingConfiguration = new RobotState(0.0, 0.19);
        }

        public static final double nominalVoltage = 12;
        public static final double nominalDt = 10;

    }


    public static class Buttons {

        public static GamepadKeys.Button a = GamepadKeys.Button.A;
        public static GamepadKeys.Button b = GamepadKeys.Button.B;
        public static GamepadKeys.Button x = GamepadKeys.Button.X;
        public static GamepadKeys.Button y = GamepadKeys.Button.Y;

        public static GamepadKeys.Button leftBumper = GamepadKeys.Button.LEFT_BUMPER;
        public static GamepadKeys.Button rightBumper = GamepadKeys.Button.RIGHT_BUMPER;

        public static GamepadKeys.Trigger leftTrigger = GamepadKeys.Trigger.LEFT_TRIGGER;
        public static GamepadKeys.Trigger rightTrigger = GamepadKeys.Trigger.RIGHT_TRIGGER;

        public static GamepadKeys.Button leftStickButton = GamepadKeys.Button.LEFT_STICK_BUTTON;
        public static GamepadKeys.Button rightStickButton = GamepadKeys.Button.RIGHT_STICK_BUTTON;

        public static GamepadKeys.Button dPadDown = GamepadKeys.Button.DPAD_DOWN;
        public static GamepadKeys.Button dPadLeft = GamepadKeys.Button.DPAD_LEFT;
        public static GamepadKeys.Button dPadUp = GamepadKeys.Button.DPAD_UP;
        public static GamepadKeys.Button dPadRight = GamepadKeys.Button.DPAD_RIGHT;

        public static GamepadKeys.Button start = GamepadKeys.Button.START;
        public static GamepadKeys.Button back = GamepadKeys.Button.BACK;
    }

}

