package frc.robot.commands;

import frc.robot.subsystems.IntakeSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
/** An example command that uses an example subsystem. */
public class SetSpeedCommand extends Command{
  
  private final IntakeSubsystem intakesubsytem;
  public double speed = 0.5;

  //public SetSpeedCommand(IntakeSubsystem intakeSubsystem, double speed){}

  public SetSpeedCommand(IntakeSubsystem intakesubsytem, double speed) 
  {
    this.intakesubsytem = intakesubsytem;
    this.speed = speed;
    addRequirements(intakesubsytem);
  }

  @Override
  public void initialize() 
  {
    intakesubsytem.SetSpeed(speed);
  }
  @Override
  public void execute() {
    intakesubsytem.SetSpeed(speed);
  }
  @Override
  public void end(boolean interrupted) {
    intakesubsytem.SetSpeed(0);
  }
  @Override
  public boolean isFinished() {
    return false;
  }
}


