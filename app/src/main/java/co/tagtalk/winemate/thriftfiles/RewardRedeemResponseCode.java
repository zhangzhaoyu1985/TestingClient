/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package co.tagtalk.winemate.thriftfiles;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum RewardRedeemResponseCode implements org.apache.thrift.TEnum {
  SUCCESS(1),
  FAILED(2),
  ACCOUNT_UNACTIVATED(3);

  private final int value;

  private RewardRedeemResponseCode(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static RewardRedeemResponseCode findByValue(int value) { 
    switch (value) {
      case 1:
        return SUCCESS;
      case 2:
        return FAILED;
      case 3:
        return ACCOUNT_UNACTIVATED;
      default:
        return null;
    }
  }
}