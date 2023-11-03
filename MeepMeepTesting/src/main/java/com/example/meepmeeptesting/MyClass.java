package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class MyClass {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(500);

        RoadRunnerBotEntity myBot = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(60, 60, Math.toRadians(180), Math.toRadians(180), 10)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(33.6, -59.2, 0))
                                .lineToConstantHeading(new Vector2d(33.6,-23.4))
                                .splineToConstantHeading(new Vector2d(38.6,-11.8),Math.toRadians(0))

                                .waitSeconds(1)
                                .lineTo(new Vector2d(31,-11.8))
                                .waitSeconds(1)

                                .splineToConstantHeading(new Vector2d(38.6,-11.8),Math.toRadians(0))
                                .waitSeconds(1)
                                .lineTo(new Vector2d(31,-11.8))
                                .waitSeconds(1)

                                .splineToConstantHeading(new Vector2d(38.6,-11.8),Math.toRadians(0))
                                .waitSeconds(1)
                                .lineTo(new Vector2d(31,-11.8))
                                .waitSeconds(1)

                                .splineToConstantHeading(new Vector2d(38.6,-11.8),Math.toRadians(0))
                                .waitSeconds(1)
                                .lineTo(new Vector2d(31,-11.8))
                                .waitSeconds(1)

                                .splineToConstantHeading(new Vector2d(38.6,-11.8),Math.toRadians(0))
                                .waitSeconds(1)
                                .lineTo(new Vector2d(31,-11.8))
                                .waitSeconds(1)

                                .splineToConstantHeading(new Vector2d(38.6,-11.8),Math.toRadians(0))
                                .waitSeconds(1)
                                .lineTo(new Vector2d(31,-11.8))
                                .waitSeconds(1)
                                .turn(Math.toRadians(180))
                                .lineTo(new Vector2d(-37.8,-11.8))
                                .waitSeconds(1)
                                .lineTo(new Vector2d(-31,-11.8))
                                .waitSeconds(1)

                                .lineTo(new Vector2d(-37.8,-11.8))
                                .waitSeconds(1)
                                .lineTo(new Vector2d(-31,-11.8))
                                .waitSeconds(1)
                                .lineTo(new Vector2d(-56.4,-11.8))
                                .build()
                );

        meepMeep.setBackground(MeepMeep.Background.FIELD_POWERPLAY_OFFICIAL)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(myBot)
                .start();
    }
}
