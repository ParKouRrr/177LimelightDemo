// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */
  public DriveTrain() 
  {
    TalonSRX leftTalonSRX = new TalonSRX(3);
    TalonSRX rightTalonSRX = new TalonSRX(4);
    //MotorController testMotorController()

    //DifferentialDrive drive = new DifferentialDrive;
  }

  @Override
  public void periodic(

  ) {
    // This method will be called once per scheduler run
  }
  
  public void arcadeDrive(double move, double rotate) {
    //drive.arcadeDrive(move, rotate);
  }
}
