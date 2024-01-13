package frc.robot.subsystems;
import com.revrobotics.*;
import com.revrobotics.CANSparkMaxLowLevel.*;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj2.command.*;

import edu.wpi.first.math.controller.PIDController;

public class intakeSubsystem extends SubsystemBase {

  static CANSparkMax intakeU = new CANSparkMax(22, MotorType.kBrushless); //need actual value and motor type
  static CANSparkMax intakeL = new CANSparkMax(21, MotorType.kBrushless); //need actual value and motor type

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
      intakeU.set(0.75);
      intakeL.set(0.75);
    }
    else{
        intakeU.set(0);
        intakeL.set(0);
    }
  } 
  
  public static void clear(boolean doClear){
    if (doClear){
      intakeL.set(-0.75);
      intakeU.set(-0.75);
    }
  } 
}