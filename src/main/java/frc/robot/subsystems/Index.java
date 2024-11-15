package frc.robot.subsystems;


import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Index extends SubsystemBase {
  public static SparkMax leftSide;
  public static SparkMax rightSide;

  public Index() {
    leftSide = new SparkMax(Constants.Indexer.leftSide, MotorType.kBrushless);
    rightSide = new SparkMax(Constants.Indexer.rightSide, MotorType.kBrushless);
  }
}
