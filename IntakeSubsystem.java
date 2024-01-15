package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.SetSpeedCommand;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;


public class IntakeSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  private final WPI_TalonSRX cim1;
  private final WPI_TalonSRX cim2; 
  //public final double speed;
{
    
    cim1 = new WPI_TalonSRX(1);
    cim2 = new WPI_TalonSRX(2);

  
}
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
  }
public void SetSpeed(double speed)
{
    cim1.set(speed);
    cim2.set(speed);
}

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
