package frc.lib.util;
import java.util.function.BooleanSupplier;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
public class TunableOption implements BooleanSupplier {
    // TODO Consider using raw NetworkTables and subscribe to updates, instead of using SmartDashboard
  private static final String tableKey = "TunableOptions";

  private String key;
  private boolean defaultValue;

  public TunableOption(String name, boolean defaultValue) {
    if (name.indexOf("/") >= 0) {
      key = name;
    } else {
      key = tableKey + "/" + name;
    }
    this.defaultValue = defaultValue;
    SmartDashboard.putBoolean(key, defaultValue);
  }

  public boolean get() {
    return SmartDashboard.getBoolean(key, defaultValue);
  }

  @Override
  public boolean getAsBoolean() {
    return get();
  }
}

