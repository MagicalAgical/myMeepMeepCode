package com.example.meepmeeptest;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.core.colorscheme.scheme.ColorSchemeBlueDark;
import com.noahbres.meepmeep.core.colorscheme.scheme.ColorSchemeBlueLight;
import com.noahbres.meepmeep.core.colorscheme.scheme.ColorSchemeRedDark;
import com.noahbres.meepmeep.core.colorscheme.scheme.ColorSchemeRedLight;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class MeepMeepTest {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(800);

        RoadRunnerBotEntity redRight = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setColorScheme(new ColorSchemeRedDark())
                .setConstraints(75, 75, Math.toRadians(180), Math.toRadians(180), 15)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(35, -58, Math.toRadians(90)))

                                .forward(46.5)
                                .lineToLinearHeading(new Pose2d(23,-10,Math.toRadians(90)))
                                .waitSeconds(.3)

                                .back(3)

                                .lineToLinearHeading(new Pose2d(62,-12,Math.toRadians(0)))
                                .waitSeconds(.3)



                                .lineToLinearHeading(new Pose2d(23,-10,Math.toRadians(90)))
                                .waitSeconds(.3)

                                .back(3)

                                .lineToLinearHeading(new Pose2d(62,-12,Math.toRadians(0)))
                                .waitSeconds(.3)



                                .lineToLinearHeading(new Pose2d(23,-10,Math.toRadians(90)))
                                .waitSeconds(.3)

                                .back(3)

                                .lineToLinearHeading(new Pose2d(62,-12,Math.toRadians(0)))
                                .waitSeconds(.3)



                                .lineToLinearHeading(new Pose2d(23,-10,Math.toRadians(90)))
                                .waitSeconds(.3)

                                .back(3)

                                .lineToLinearHeading(new Pose2d(62,-12,Math.toRadians(0)))
                                .waitSeconds(.3)



                                .lineToLinearHeading(new Pose2d(23,-10,Math.toRadians(90)))
                                .waitSeconds(.3)

                                .back(3)
                                .lineToLinearHeading(new Pose2d(62,-12,Math.toRadians(0)))
                                .waitSeconds(.3)



                                .lineToLinearHeading(new Pose2d(23,-10,Math.toRadians(90)))
                                .waitSeconds(.3)

                                .back(3)


                                .strafeTo(new Vector2d(59,-12))

                                .lineToLinearHeading(new Pose2d(59,-24.5,Math.toRadians(90)))






                                .build()






                );

        RoadRunnerBotEntity blueLeft = new DefaultBotBuilder(meepMeep)
                // We set this bot to be red
                .setColorScheme(new ColorSchemeBlueDark())
                .setConstraints(75, 75, Math.toRadians(180), Math.toRadians(180), 15)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-35, 58, Math.toRadians(270)))

                                .forward(46.5)
                                .lineToLinearHeading(new Pose2d(-24,10,Math.toRadians(270)))
                                .waitSeconds(.3)

                                .back(3)

                                .lineToLinearHeading(new Pose2d(-62,12,Math.toRadians(180)))
                                .waitSeconds(.3)



                                .lineToLinearHeading(new Pose2d(-24,10,Math.toRadians(270)))
                                .waitSeconds(.3)

                                .back(3)

                                .lineToLinearHeading(new Pose2d(-62,12,Math.toRadians(180)))
                                .waitSeconds(.3)



                                .lineToLinearHeading(new Pose2d(-24,10,Math.toRadians(270)))
                                .waitSeconds(.3)

                                .back(3)

                                .lineToLinearHeading(new Pose2d(-62,12,Math.toRadians(180)))
                                .waitSeconds(.3)



                                .lineToLinearHeading(new Pose2d(-24,10,Math.toRadians(270)))
                                .waitSeconds(.3)

                                .back(3)

                                .lineToLinearHeading(new Pose2d(-62,12,Math.toRadians(180)))
                                .waitSeconds(.3)



                                .lineToLinearHeading(new Pose2d(-24,10,Math.toRadians(270)))
                                .waitSeconds(.3)

                                .back(3)

                                .lineToLinearHeading(new Pose2d(-62,12,Math.toRadians(180)))
                                .waitSeconds(.3)



                                .lineToLinearHeading(new Pose2d(-24,10,Math.toRadians(270)))
                                .waitSeconds(.3)

                                .back(3)

                                .strafeTo(new Vector2d(-12.5,11.5))

                                .lineToLinearHeading(new Pose2d(-12.5,22.5,Math.toRadians(270)))



                                .build()
                );



        RoadRunnerBotEntity redLeft = new DefaultBotBuilder(meepMeep)
                // We set this bot to be red
                .setColorScheme(new ColorSchemeRedLight())
                .setConstraints(75, 75, Math.toRadians(180), Math.toRadians(180), 15)
                .followTrajectorySequence(drive ->
                                drive.trajectorySequenceBuilder(new Pose2d(-35, -58, Math.toRadians(90)))
                                        .forward(46.5)
                                        .lineToLinearHeading(new Pose2d(-23,-10,Math.toRadians(90)))
                                        .waitSeconds(.3)

                                        .back(3)

                                        .lineToLinearHeading(new Pose2d(-62,-12,Math.toRadians(180)))
                                        .waitSeconds(.3)



                                        .lineToLinearHeading(new Pose2d(-23,-10,Math.toRadians(90)))
                                        .waitSeconds(.3)

                                        .back(3)

                                        .lineToLinearHeading(new Pose2d(-62,-12,Math.toRadians(180)))
                                        .waitSeconds(.3)



                                        .lineToLinearHeading(new Pose2d(-23,-10,Math.toRadians(90)))
                                        .waitSeconds(.3)

                                        .back(3)

                                        .lineToLinearHeading(new Pose2d(-62,-12,Math.toRadians(180)))
                                        .waitSeconds(.3)



                                        .lineToLinearHeading(new Pose2d(-23,-10,Math.toRadians(90)))
                                        .waitSeconds(.3)

                                        .back(3)

                                        .lineToLinearHeading(new Pose2d(-62,-12,Math.toRadians(180)))
                                        .waitSeconds(.3)



                                        .lineToLinearHeading(new Pose2d(-23,-10,Math.toRadians(90)))
                                        .waitSeconds(.3)

                                        .back(3)
                                        .lineToLinearHeading(new Pose2d(-62,-12,Math.toRadians(180)))
                                        .waitSeconds(.3)



                                        .lineToLinearHeading(new Pose2d(-23,-10,Math.toRadians(90)))
                                        .waitSeconds(.3)

                                        .back(3)
                                        
                                        .strafeTo(new Vector2d(-35,-13))
                                                .build()



                );

        RoadRunnerBotEntity blueRight = new DefaultBotBuilder(meepMeep)
                // We set this bot to be red
                .setColorScheme(new ColorSchemeBlueLight())
                .setConstraints(75, 75, Math.toRadians(180), Math.toRadians(180), 15)
                .followTrajectorySequence(drive ->
                                drive.trajectorySequenceBuilder(new Pose2d(35, 58, Math.toRadians(270)))
                                        .forward(46.5)
                                        .lineToLinearHeading(new Pose2d(24,10,Math.toRadians(270)))
                                        .waitSeconds(.3)

                                        .back(3)

                                        .lineToLinearHeading(new Pose2d(62,12,Math.toRadians(0)))
                                        .waitSeconds(.3)



                                        .lineToLinearHeading(new Pose2d(24,10,Math.toRadians(270)))
                                        .waitSeconds(.3)

                                        .back(3)

                                        .lineToLinearHeading(new Pose2d(62,12,Math.toRadians(0)))
                                        .waitSeconds(.3)



                                        .lineToLinearHeading(new Pose2d(24,10,Math.toRadians(270)))
                                        .waitSeconds(.3)

                                        .back(3)

                                        .lineToLinearHeading(new Pose2d(62,12,Math.toRadians(0)))
                                        .waitSeconds(.3)



                                        .lineToLinearHeading(new Pose2d(24,10,Math.toRadians(270)))
                                        .waitSeconds(.3)

                                        .back(3)

                                        .lineToLinearHeading(new Pose2d(62,12,Math.toRadians(0)))
                                        .waitSeconds(.3)



                                        .lineToLinearHeading(new Pose2d(24,10,Math.toRadians(270)))
                                        .waitSeconds(.3)

                                        .back(3)

                                        .lineToLinearHeading(new Pose2d(62,12,Math.toRadians(0)))
                                        .waitSeconds(.3)



                                        .lineToLinearHeading(new Pose2d(24,10,Math.toRadians(270)))
                                        .waitSeconds(.3)

                                        .back(3)

                                        .strafeTo(new Vector2d(58,12))

                                        .lineToLinearHeading(new Pose2d(59,23,Math.toRadians(270)))

                                        .build()
                );




        meepMeep.setBackground(MeepMeep.Background.FIELD_POWERPLAY_OFFICIAL)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(redRight)
                .addEntity(blueLeft)
                .addEntity(redLeft)
                .addEntity(blueRight)
                .start();
    }
}

/*.forward(46.5)
        .lineToLinearHeading(new Pose2d(23,-7,Math.toRadians(90)))
        .waitSeconds(.5)

        .lineToLinearHeading(new Pose2d(62,-12,Math.toRadians(0)))
        .waitSeconds(.5)

        .lineToLinearHeading(new Pose2d(23,-7,Math.toRadians(90)))
        .waitSeconds(.5)

        .lineToLinearHeading(new Pose2d(62,-12,Math.toRadians(0)))
        .waitSeconds(.5)

        .lineToLinearHeading(new Pose2d(23,-7,Math.toRadians(90)))
        .waitSeconds(.5)

        .lineToLinearHeading(new Pose2d(62,-12,Math.toRadians(0)))
        .waitSeconds(.5)

        .lineToLinearHeading(new Pose2d(23,-7,Math.toRadians(90)))
        .waitSeconds(.5)

        .lineToLinearHeading(new Pose2d(62,-12,Math.toRadians(0)))
        .waitSeconds(.5)

        .lineToLinearHeading(new Pose2d(23,-7,Math.toRadians(90)))
        .waitSeconds(.5)

        .lineToLinearHeading(new Pose2d(62,-12,Math.toRadians(0)))
        .waitSeconds(.5)

        .lineToLinearHeading(new Pose2d(23,-7,Math.toRadians(90)))
        .waitSeconds(.5)

        .lineToLinearHeading(new Pose2d(62,-12,Math.toRadians(0)))
        .build()


 */