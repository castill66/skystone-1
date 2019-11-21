package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name="Two Red Skystone", group="Autons")

public class AUTON_Two_Red_Skystone11691 extends BaseAuton {


    int blockCount = 0;
    
    @Override
    public void runOpMode() {

        initialize();
        waitForStart();

        while (opModeIsActive()) {

            runFirstPartOfSkystone(COMPETITION_SIDE.RED, SKYSTONE_FULL.NO);

            waitStep(0.5);
            autonTurn.AutonTurn_HighPowerAtEnd(-90,0.75,0,1.5,telemetry);

            driveForward(87,1,4,telemetry);
            autonTurn.AutonTurn_HighPowerAtEnd(0,0.25,0,2,telemetry);
            waitStep(0.5);
            autonTurn.AutonTurn_HighPowerAtEnd(0,0.25,0,2,telemetry);
            straff(2, 0.5, 2, telemetry);
            waitStep(0.5);
            autonTurn.AutonTurn_HighPowerAtEnd(0,0.25,0,2,telemetry);
            
            driveBackward(6,0.25,2,telemetry);
            double totalDistanceMoved = get_SkyStone(20, telemetry);
            //straff(2, 0.5, 2, telemetry);
            waitStep(0.5);
            driveForward(8,1,4,telemetry);
            
            autonTurn.AutonTurn_HighPowerAtEnd(-90,0.5,0,2,telemetry);
            waitStep(0.5);
            autonTurn.AutonTurn_HighPowerAtEnd(-90,0.25,0,2,telemetry);
            driveBackward(80,1,4,telemetry);
            SK_Grab_Left.goToHomePosition();
            SK_Grab_Right.goToHomePosition();
            waitStep(0.8);
            
            driveForward(16,1,4,telemetry);

            sleep(200000);
        }
    }

}    