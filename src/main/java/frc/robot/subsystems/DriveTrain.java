// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive.*;
import edu.wpi.first.wpilibj.motorcontrol.*;

public class DriveTrain extends SubsystemBase {
  public DifferentialDrive drive; //its up here because if it's not it gets forgotten after the brackets end :,(
  private final Joystick driverJoystick = new Joystick(0);
  private final Joystick operatorJoystick = new Joystick(1);

  public DriveTrain() 
  {
    TalonSRX leftTalonSRX = new TalonSRX(3);
    TalonSRX rightTalonSRX = new TalonSRX(4);
    PWMTalonSRX testMotorControllerLeft = new PWMTalonSRX(3);
    PWMTalonSRX testMotorControllerRight = new PWMTalonSRX(4);
    drive = new DifferentialDrive(testMotorControllerLeft, testMotorControllerRight);
  
  }

  @Override
  public void periodic() 
    {
    ArcadeDrive(driverJoystick.getRawAxis(0), driverJoystick.getRawAxis(4));
  }
  
  public void ArcadeDrive(double move, double rotate) {
    drive.arcadeDrive(move, rotate);
  }
}
