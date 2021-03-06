package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name="Blue 2 Skystones Full", group="Autons")

public class AUTON_Blue_2_Skystones11691_Full extends BaseAuton {

    int blockCount = 0;

    @Override
    public void runOpMode() {

        initialize();
        waitForStart();

        while (opModeIsActive()) {

            runTwoSkystonesFull(COMPETITION_SIDE.BLUE);

            uninitialize();
            sleep(200000);
        }
    }
}
