package frc.robot.commands;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.*;
import frc.robot.subsystems.*;

public class Intake extends CommandBase{
 
    private final intakeSubsystem m_subsystem;
    private final BooleanSupplier intakeDo;
    private final BooleanSupplier lowerIntakeDo;
    private final BooleanSupplier clearDo;
    //private final DoubleSupplier intakeSpeed;

    XboxController joy = new XboxController(0);

    public Intake(intakeSubsystem intakeSubsystem, BooleanSupplier intakeDo, BooleanSupplier lowerIntakeDo, BooleanSupplier clearDo) {
        this.intakeDo = intakeDo;
        //this.intakeSpeed = intakeSpeed;
        this.clearDo = clearDo;
        this.lowerIntakeDo = lowerIntakeDo;
        m_subsystem = intakeSubsystem;
  
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(intakeSubsystem);
  }
    public void execute() {;
        intakeSubsystem.intake(intakeDo.getAsBoolean());
        intakeSubsystem.lowerIntake(lowerIntakeDo.getAsBoolean());
        intakeSubsystem.clear(clearDo.getAsBoolean());
    }
}
