package frc.robot.subsystems;
import com.revrobotics.*;
import com.revrobotics.CANSparkMaxLowLevel.*;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj2.command.*;

import edu.wpi.first.math.controller.PIDController;

public class intakeSubsystem extends SubsystemBase {

  static CANSparkMax intake = new CANSparkMax(31, MotorType.kBrushless);
  static CANSparkMax indexL = new CANSparkMax(21, MotorType.kBrushless);
  static CANSparkMax indexR = new CANSparkMax(22, MotorType.kBrushless);

  static Solenoid intakeSolenoid = new Solenoid(PneumaticsModuleType.CTREPCM, 3);



  /** Creates a new ExampleSubsystem. */
  public intakeSubsystem() {
  }

  @Override
  public void periodic() {
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }

  public static void lowerIntake(boolean doLower){
    if (doLower){
      intakeSolenoid.set(true);
    }
    else {
      intakeSolenoid.set(false);
    }
  }

  public static void intake(boolean doIntake){
    if (doIntake){
      indexL.set(0.75);
      indexR.set(0.75);
      intake.set(0.75);
    }
    else{
      indexL.set(0);
      indexR.set(0);
      intake.set(0);
    }
  } 
  
  public static void clear(boolean doClear){
    if (doClear){
      indexL.set(-0.75);
      indexR.set(-0.75);
      intake.set(-0.75);
    }
  } 
}