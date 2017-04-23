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
public class NewsFeedRequest implements org.apache.thrift.TBase<NewsFeedRequest, NewsFeedRequest._Fields>, java.io.Serializable, Cloneable, Comparable<NewsFeedRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("NewsFeedRequest");

  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField COUNTRY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("countryId", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new NewsFeedRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new NewsFeedRequestTupleSchemeFactory());
  }

  public int userId; // required
  /**
   * 
   * @see CountryId
   */
  public CountryId countryId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_ID((short)1, "userId"),
    /**
     * 
     * @see CountryId
     */
    COUNTRY_ID((short)2, "countryId");

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
        case 1: // USER_ID
          return USER_ID;
        case 2: // COUNTRY_ID
          return COUNTRY_ID;
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
  private static final int __USERID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.COUNTRY_ID, new org.apache.thrift.meta_data.FieldMetaData("countryId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, CountryId.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(NewsFeedRequest.class, metaDataMap);
  }

  public NewsFeedRequest() {
  }

  public NewsFeedRequest(
    int userId,
    CountryId countryId)
  {
    this();
    this.userId = userId;
    setUserIdIsSet(true);
    this.countryId = countryId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NewsFeedRequest(NewsFeedRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.userId = other.userId;
    if (other.isSetCountryId()) {
      this.countryId = other.countryId;
    }
  }

  public NewsFeedRequest deepCopy() {
    return new NewsFeedRequest(this);
  }

  @Override
  public void clear() {
    setUserIdIsSet(false);
    this.userId = 0;
    this.countryId = null;
  }

  public int getUserId() {
    return this.userId;
  }

  public NewsFeedRequest setUserId(int userId) {
    this.userId = userId;
    setUserIdIsSet(true);
    return this;
  }

  public void unsetUserId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __USERID_ISSET_ID);
  }

  /** Returns true if field userId is set (has been assigned a value) and false otherwise */
  public boolean isSetUserId() {
    return EncodingUtils.testBit(__isset_bitfield, __USERID_ISSET_ID);
  }

  public void setUserIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __USERID_ISSET_ID, value);
  }

  /**
   * 
   * @see CountryId
   */
  public CountryId getCountryId() {
    return this.countryId;
  }

  /**
   * 
   * @see CountryId
   */
  public NewsFeedRequest setCountryId(CountryId countryId) {
    this.countryId = countryId;
    return this;
  }

  public void unsetCountryId() {
    this.countryId = null;
  }

  /** Returns true if field countryId is set (has been assigned a value) and false otherwise */
  public boolean isSetCountryId() {
    return this.countryId != null;
  }

  public void setCountryIdIsSet(boolean value) {
    if (!value) {
      this.countryId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USER_ID:
      if (value == null) {
        unsetUserId();
      } else {
        setUserId((Integer)value);
      }
      break;

    case COUNTRY_ID:
      if (value == null) {
        unsetCountryId();
      } else {
        setCountryId((CountryId)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_ID:
      return getUserId();

    case COUNTRY_ID:
      return getCountryId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USER_ID:
      return isSetUserId();
    case COUNTRY_ID:
      return isSetCountryId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof NewsFeedRequest)
      return this.equals((NewsFeedRequest)that);
    return false;
  }

  public boolean equals(NewsFeedRequest that) {
    if (that == null)
      return false;

    boolean this_present_userId = true;
    boolean that_present_userId = true;
    if (this_present_userId || that_present_userId) {
      if (!(this_present_userId && that_present_userId))
        return false;
      if (this.userId != that.userId)
        return false;
    }

    boolean this_present_countryId = true && this.isSetCountryId();
    boolean that_present_countryId = true && that.isSetCountryId();
    if (this_present_countryId || that_present_countryId) {
      if (!(this_present_countryId && that_present_countryId))
        return false;
      if (!this.countryId.equals(that.countryId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_userId = true;
    list.add(present_userId);
    if (present_userId)
      list.add(userId);

    boolean present_countryId = true && (isSetCountryId());
    list.add(present_countryId);
    if (present_countryId)
      list.add(countryId.getValue());

    return list.hashCode();
  }

  @Override
  public int compareTo(NewsFeedRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUserId()).compareTo(other.isSetUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userId, other.userId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCountryId()).compareTo(other.isSetCountryId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCountryId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.countryId, other.countryId);
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
    StringBuilder sb = new StringBuilder("NewsFeedRequest(");
    boolean first = true;

    sb.append("userId:");
    sb.append(this.userId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("countryId:");
    if (this.countryId == null) {
      sb.append("null");
    } else {
      sb.append(this.countryId);
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

  private static class NewsFeedRequestStandardSchemeFactory implements SchemeFactory {
    public NewsFeedRequestStandardScheme getScheme() {
      return new NewsFeedRequestStandardScheme();
    }
  }

  private static class NewsFeedRequestStandardScheme extends StandardScheme<NewsFeedRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, NewsFeedRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.userId = iprot.readI32();
              struct.setUserIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COUNTRY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.countryId = co.tagtalk.winemate.thriftfiles.CountryId.findByValue(iprot.readI32());
              struct.setCountryIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, NewsFeedRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(USER_ID_FIELD_DESC);
      oprot.writeI32(struct.userId);
      oprot.writeFieldEnd();
      if (struct.countryId != null) {
        oprot.writeFieldBegin(COUNTRY_ID_FIELD_DESC);
        oprot.writeI32(struct.countryId.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class NewsFeedRequestTupleSchemeFactory implements SchemeFactory {
    public NewsFeedRequestTupleScheme getScheme() {
      return new NewsFeedRequestTupleScheme();
    }
  }

  private static class NewsFeedRequestTupleScheme extends TupleScheme<NewsFeedRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, NewsFeedRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUserId()) {
        optionals.set(0);
      }
      if (struct.isSetCountryId()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUserId()) {
        oprot.writeI32(struct.userId);
      }
      if (struct.isSetCountryId()) {
        oprot.writeI32(struct.countryId.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, NewsFeedRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.userId = iprot.readI32();
        struct.setUserIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.countryId = co.tagtalk.winemate.thriftfiles.CountryId.findByValue(iprot.readI32());
        struct.setCountryIdIsSet(true);
      }
    }
  }

}

