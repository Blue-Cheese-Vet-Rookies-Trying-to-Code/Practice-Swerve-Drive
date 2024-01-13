package frc.robot.subsystems;
import com.revrobotics.*;
import com.revrobotics.CANSparkMaxLowLevel.*;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj2.command.*;

import edu.wpi.first.math.controller.PIDController;

public class shooterSubystem extends SubsystemBase {

  static CANSparkMax shooterU = new CANSparkMax(22, MotorType.kBrushless); //need actual value and motor type
  static CANSparkMax shooterL = new CANSparkMax(21, MotorType.kBrushless); //need actual value and motor type

  static Solenoid intakeSolenoid = new Solenoid(PneumaticsModuleType.CTREPCM, 3);



  /** Creates a new ExampleSubsystem. */
  public shooterSubystem() {
  }

  @Override
  public void periodic() {
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }

  public static void shoot(boolean doIntake){
    if (doIntake){
      shooterU.set(0.75);
      shooterL.set(0.75);
    }
    else{
        shooterU.set(0);
        shooterL.set(0);
    }
  } 
}