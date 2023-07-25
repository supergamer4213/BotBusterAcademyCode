package org.firstinspires.ftc.teamcode.RobotOpModes.Autonomous.TestSleeveDetection;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.teamcode.Core.BaseClasses.OperationModes.EctoOpMode;

import org.openftc.easyopencv.OpenCvCamera;
import org.openftc.easyopencv.OpenCvCameraFactory;
import org.openftc.easyopencv.OpenCvCameraRotation;

//@Autonomous(name = "Signal Sleeve Test")
public class VisionTest extends EctoOpMode {

    SleeveDetection sleeveDetection = new SleeveDetection();
    OpenCvCamera camera;
    String webcamName = "Webcam 1";



    @Override
    public void initRobotClasses() {
        int cameraMonitorViewId = hardwareMap.appContext.getResources().getIdentifier("cameraMonitorViewId", "id", hardwareMap.appContext.getPackageName());
        camera = OpenCvCameraFactory.getInstance().createWebcam(hardwareMap.get(WebcamName.class, webcamName), cameraMonitorViewId);
        sleeveDetection = new SleeveDetection();
        camera.setPipeline(sleeveDetection);

        camera.openCameraDeviceAsync(new OpenCvCamera.AsyncCameraOpenListener() {
            @Override
            public void onOpened() {
                camera.startStreaming(320, 240, OpenCvCameraRotation.SIDEWAYS_LEFT);
            }

            @Override
            public void onError(int errorCode) {

            }
        });
    }

    @Override
    public void initRobot() {
        telemetry.addData("ROTATION: ", sleeveDetection.getPosition());
        telemetry.update();
    }

    @Override
    public void startRobot() {

    }

    @Override
    public void updateRobot(Double timeStep) {

    }
}