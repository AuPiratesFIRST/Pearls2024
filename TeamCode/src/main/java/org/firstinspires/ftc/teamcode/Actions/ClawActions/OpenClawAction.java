package org.firstinspires.ftc.teamcode.Actions.ClawActions;

import androidx.annotation.NonNull;

import com.acmerobotics.dashboard.telemetry.TelemetryPacket;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.Actions.BaseAction;
import org.firstinspires.ftc.teamcode.Subsystems.ClawSubsystem;

public class OpenClawAction extends BaseAction {
    private final ClawSubsystem claw;

    public OpenClawAction(ClawSubsystem claw, Telemetry telemetry) {
        super(telemetry);
        this.claw = claw;
    }

    @Override
    public boolean run(@NonNull TelemetryPacket packet) {
        claw.setPosition(1.0);
        logTelemetry("Claw Action", "Opened");
        return false; // Action completes instantly
    }
}
