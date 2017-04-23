/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package co.tagtalk.winemate.thriftfiles;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-03-06")
public class WineryInfoResponseSingleItem implements org.apache.thrift.TBase<WineryInfoResponseSingleItem, WineryInfoResponseSingleItem._Fields>, java.io.Serializable, Cloneable, Comparable<WineryInfoResponseSingleItem> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("WineryInfoResponseSingleItem");

  private static final org.apache.thrift.protocol.TField WINE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("wineId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField WINE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("wineName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField WINE_PIC_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("winePicUrl", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField YEAR_FIELD_DESC = new org.apache.thrift.protocol.TField("year", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new WineryInfoResponseSingleItemStandardSchemeFactory());
    schemes.put(TupleScheme.class, new WineryInfoResponseSingleItemTupleSchemeFactory());
  }

  public int wineId; // required
  public String wineName; // required
  public String winePicUrl; // required
  public String year; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    WINE_ID((short)1, "wineId"),
    WINE_NAME((short)2, "wineName"),
    WINE_PIC_URL((short)3, "winePicUrl"),
    YEAR((short)4, "year");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // WINE_ID
          return WINE_ID;
        case 2: // WINE_NAME
          return WINE_NAME;
        case 3: // WINE_PIC_URL
          return WINE_PIC_URL;
        case 4: // YEAR
          return YEAR;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __WINEID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.WINE_ID, new org.apache.thrift.meta_data.FieldMetaData("wineId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.WINE_NAME, new org.apache.thrift.meta_data.FieldMetaData("wineName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.WINE_PIC_URL, new org.apache.thrift.meta_data.FieldMetaData("winePicUrl", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.YEAR, new org.apache.thrift.meta_data.FieldMetaData("year", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(WineryInfoResponseSingleItem.class, metaDataMap);
  }

  public WineryInfoResponseSingleItem() {
  }

  public WineryInfoResponseSingleItem(
    int wineId,
    String wineName,
    String winePicUrl,
    String year)
  {
    this();
    this.wineId = wineId;
    setWineIdIsSet(true);
    this.wineName = wineName;
    this.winePicUrl = winePicUrl;
    this.year = year;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public WineryInfoResponseSingleItem(WineryInfoResponseSingleItem other) {
    __isset_bitfield = other.__isset_bitfield;
    this.wineId = other.wineId;
    if (other.isSetWineName()) {
      this.wineName = other.wineName;
    }
    if (other.isSetWinePicUrl()) {
      this.winePicUrl = other.winePicUrl;
    }
    if (other.isSetYear()) {
      this.year = other.year;
    }
  }

  public WineryInfoResponseSingleItem deepCopy() {
    return new WineryInfoResponseSingleItem(this);
  }

  @Override
  public void clear() {
    setWineIdIsSet(false);
    this.wineId = 0;
    this.wineName = null;
    this.winePicUrl = null;
    this.year = null;
  }

  public int getWineId() {
    return this.wineId;
  }

  public WineryInfoResponseSingleItem setWineId(int wineId) {
    this.wineId = wineId;
    setWineIdIsSet(true);
    return this;
  }

  public void unsetWineId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __WINEID_ISSET_ID);
  }

  /** Returns true if field wineId is set (has been assigned a value) and false otherwise */
  public boolean isSetWineId() {
    return EncodingUtils.testBit(__isset_bitfield, __WINEID_ISSET_ID);
  }

  public void setWineIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __WINEID_ISSET_ID, value);
  }

  public String getWineName() {
    return this.wineName;
  }

  public WineryInfoResponseSingleItem setWineName(String wineName) {
    this.wineName = wineName;
    return this;
  }

  public void unsetWineName() {
    this.wineName = null;
  }

  /** Returns true if field wineName is set (has been assigned a value) and false otherwise */
  public boolean isSetWineName() {
    return this.wineName != null;
  }

  public void setWineNameIsSet(boolean value) {
    if (!value) {
      this.wineName = null;
    }
  }

  public String getWinePicUrl() {
    return this.winePicUrl;
  }

  public WineryInfoResponseSingleItem setWinePicUrl(String winePicUrl) {
    this.winePicUrl = winePicUrl;
    return this;
  }

  public void unsetWinePicUrl() {
    this.winePicUrl = null;
  }

  /** Returns true if field winePicUrl is set (has been assigned a value) and false otherwise */
  public boolean isSetWinePicUrl() {
    return this.winePicUrl != null;
  }

  public void setWinePicUrlIsSet(boolean value) {
    if (!value) {
      this.winePicUrl = null;
    }
  }

  public String getYear() {
    return this.year;
  }

  public WineryInfoResponseSingleItem setYear(String year) {
    this.year = year;
    return this;
  }

  public void unsetYear() {
    this.year = null;
  }

  /** Returns true if field year is set (has been assigned a value) and false otherwise */
  public boolean isSetYear() {
    return this.year != null;
  }

  public void setYearIsSet(boolean value) {
    if (!value) {
      this.year = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case WINE_ID:
      if (value == null) {
        unsetWineId();
      } else {
        setWineId((Integer)value);
      }
      break;

    case WINE_NAME:
      if (value == null) {
        unsetWineName();
      } else {
        setWineName((String)value);
      }
      break;

    case WINE_PIC_URL:
      if (value == null) {
        unsetWinePicUrl();
      } else {
        setWinePicUrl((String)value);
      }
      break;

    case YEAR:
      if (value == null) {
        unsetYear();
      } else {
        setYear((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case WINE_ID:
      return getWineId();

    case WINE_NAME:
      return getWineName();

    case WINE_PIC_URL:
      return getWinePicUrl();

    case YEAR:
      return getYear();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case WINE_ID:
      return isSetWineId();
    case WINE_NAME:
      return isSetWineName();
    case WINE_PIC_URL:
      return isSetWinePicUrl();
    case YEAR:
      return isSetYear();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof WineryInfoResponseSingleItem)
      return this.equals((WineryInfoResponseSingleItem)that);
    return false;
  }

  public boolean equals(WineryInfoResponseSingleItem that) {
    if (that == null)
      return false;

    boolean this_present_wineId = true;
    boolean that_present_wineId = true;
    if (this_present_wineId || that_present_wineId) {
      if (!(this_present_wineId && that_present_wineId))
        return false;
      if (this.wineId != that.wineId)
        return false;
    }

    boolean this_present_wineName = true && this.isSetWineName();
    boolean that_present_wineName = true && that.isSetWineName();
    if (this_present_wineName || that_present_wineName) {
      if (!(this_present_wineName && that_present_wineName))
        return false;
      if (!this.wineName.equals(that.wineName))
        return false;
    }

    boolean this_present_winePicUrl = true && this.isSetWinePicUrl();
    boolean that_present_winePicUrl = true && that.isSetWinePicUrl();
    if (this_present_winePicUrl || that_present_winePicUrl) {
      if (!(this_present_winePicUrl && that_present_winePicUrl))
        return false;
      if (!this.winePicUrl.equals(that.winePicUrl))
        return false;
    }

    boolean this_present_year = true && this.isSetYear();
    boolean that_present_year = true && that.isSetYear();
    if (this_present_year || that_present_year) {
      if (!(this_present_year && that_present_year))
        return false;
      if (!this.year.equals(that.year))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_wineId = true;
    list.add(present_wineId);
    if (present_wineId)
      list.add(wineId);

    boolean present_wineName = true && (isSetWineName());
    list.add(present_wineName);
    if (present_wineName)
      list.add(wineName);

    boolean present_winePicUrl = true && (isSetWinePicUrl());
    list.add(present_winePicUrl);
    if (present_winePicUrl)
      list.add(winePicUrl);

    boolean present_year = true && (isSetYear());
    list.add(present_year);
    if (present_year)
      list.add(year);

    return list.hashCode();
  }

  @Override
  public int compareTo(WineryInfoResponseSingleItem other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetWineId()).compareTo(other.isSetWineId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWineId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.wineId, other.wineId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWineName()).compareTo(other.isSetWineName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWineName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.wineName, other.wineName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWinePicUrl()).compareTo(other.isSetWinePicUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWinePicUrl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.winePicUrl, other.winePicUrl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetYear()).compareTo(other.isSetYear());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetYear()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.year, other.year);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("WineryInfoResponseSingleItem(");
    boolean first = true;

    sb.append("wineId:");
    sb.append(this.wineId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("wineName:");
    if (this.wineName == null) {
      sb.append("null");
    } else {
      sb.append(this.wineName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("winePicUrl:");
    if (this.winePicUrl == null) {
      sb.append("null");
    } else {
      sb.append(this.winePicUrl);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("year:");
    if (this.year == null) {
      sb.append("null");
    } else {
      sb.append(this.year);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class WineryInfoResponseSingleItemStandardSchemeFactory implements SchemeFactory {
    public WineryInfoResponseSingleItemStandardScheme getScheme() {
      return new WineryInfoResponseSingleItemStandardScheme();
    }
  }

  private static class WineryInfoResponseSingleItemStandardScheme extends StandardScheme<WineryInfoResponseSingleItem> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, WineryInfoResponseSingleItem struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // WINE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.wineId = iprot.readI32();
              struct.setWineIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // WINE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.wineName = iprot.readString();
              struct.setWineNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // WINE_PIC_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.winePicUrl = iprot.readString();
              struct.setWinePicUrlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // YEAR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.year = iprot.readString();
              struct.setYearIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, WineryInfoResponseSingleItem struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(WINE_ID_FIELD_DESC);
      oprot.writeI32(struct.wineId);
      oprot.writeFieldEnd();
      if (struct.wineName != null) {
        oprot.writeFieldBegin(WINE_NAME_FIELD_DESC);
        oprot.writeString(struct.wineName);
        oprot.writeFieldEnd();
      }
      if (struct.winePicUrl != null) {
        oprot.writeFieldBegin(WINE_PIC_URL_FIELD_DESC);
        oprot.writeString(struct.winePicUrl);
        oprot.writeFieldEnd();
      }
      if (struct.year != null) {
        oprot.writeFieldBegin(YEAR_FIELD_DESC);
        oprot.writeString(struct.year);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class WineryInfoResponseSingleItemTupleSchemeFactory implements SchemeFactory {
    public WineryInfoResponseSingleItemTupleScheme getScheme() {
      return new WineryInfoResponseSingleItemTupleScheme();
    }
  }

  private static class WineryInfoResponseSingleItemTupleScheme extends TupleScheme<WineryInfoResponseSingleItem> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, WineryInfoResponseSingleItem struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetWineId()) {
        optionals.set(0);
      }
      if (struct.isSetWineName()) {
        optionals.set(1);
      }
      if (struct.isSetWinePicUrl()) {
        optionals.set(2);
      }
      if (struct.isSetYear()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetWineId()) {
        oprot.writeI32(struct.wineId);
      }
      if (struct.isSetWineName()) {
        oprot.writeString(struct.wineName);
      }
      if (struct.isSetWinePicUrl()) {
        oprot.writeString(struct.winePicUrl);
      }
      if (struct.isSetYear()) {
        oprot.writeString(struct.year);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, WineryInfoResponseSingleItem struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.wineId = iprot.readI32();
        struct.setWineIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.wineName = iprot.readString();
        struct.setWineNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.winePicUrl = iprot.readString();
        struct.setWinePicUrlIsSet(true);
      }
      if (incoming.get(3)) {
        struct.year = iprot.readString();
        struct.setYearIsSet(true);
      }
    }
  }

}
