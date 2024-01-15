// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.SetSpeedCommand;
import frc.robot.subsystems.IntakeSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  private static final double speed = 0;

  // The robot's subsystems and commands are defined here...
  private final IntakeSubsystem intakesubsytem = new IntakeSubsystem();
  
  private final Joystick joy = new Joystick(0);


  public RobotContainer() {
    
    configureBindings();
  }

  
  private void configureBindings() 
  {
    new JoystickButton(joy, 3).whileTrue(new SetSpeedCommand(intakesubsytem, speed));
  }

  //public Command getAutonomousCommand() {
  //}
}
