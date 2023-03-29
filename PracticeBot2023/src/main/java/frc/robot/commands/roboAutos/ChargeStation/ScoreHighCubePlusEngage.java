// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.roboAutos.ChargeStation;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Chassis;
import frc.robot.subsystems.Gyro;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class ScoreHighCubePlusEngage extends SequentialCommandGroup {
  /** Creates a new ScoreHighCubePlusEngage. */
  frc.robot.utils.PIDController turnController, turnResetController;
  public ScoreHighCubePlusEngage(frc.robot.subsystems.Elevator elevator, frc.robot.subsystems.IntakeAlternate intake, Chassis chassis, Gyro gyro) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    turnController = new frc.robot.utils.PIDController(.0043, .008, 0, 90, .35, .45, 0);
    turnResetController = new frc.robot.utils.PIDController(.0043, .008, 0, 90, .35, .45, 0);
    addCommands(
    );
  }
}
