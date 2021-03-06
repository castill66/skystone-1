package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name="Red 1 Skystone Full", group="Autons")

public class AUTON_Red_1_Skystone11691_Full extends BaseAuton {

    int blockCount = 0;

    @Override
    public void runOpMode() {

        initialize();
        waitForStart();

        while (opModeIsActive()) {

            runFirstPartOfSkystone(COMPETITION_SIDE.RED, SKYSTONE_FULL.YES,false, true, false, SK_Block11691.SKYSTONE_ARM_LOCATION.Left);

            driveBackward       (13,1,5.5);

            turn_HighPowerAtEnd(0,0.75,0,4);

            waitStep(0.1);
            turn_HighPowerAtEnd(0,0.25,0,0.5);
            waitStep(0.1);

            DriveByBumperSwitches(0.25, 2);

            foundationDN();
            this.SK_Grab_Right.goToClawOpenPosition();
            this.SK_Grab_Left.goToClawOpenPosition();
            SK_Grab_Left.goToHomePosition();
            SK_Grab_Right.goToHomePosition();
            driveBackward  (6,1,1.0);
            turn_HighPowerAtEnd(-90,0.5,0.25,3);
            driveBackward  (30,0.75,1.5);

            // Drive under the bridge
            foundationUP();
            waitStep(0.8);
            driveForward(10,0.75,1.5);
            straff(-8,0.75,1);
            turn_HighPowerAtEnd(-90,0.75,0,1.5);

            driveForward(35,0.75,1.5);

            uninitialize();
            sleep(200000);
        }
    }
}
