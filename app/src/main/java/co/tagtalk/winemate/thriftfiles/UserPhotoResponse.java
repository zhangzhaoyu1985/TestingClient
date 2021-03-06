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
public class UserPhotoResponse implements org.apache.thrift.TBase<UserPhotoResponse, UserPhotoResponse._Fields>, java.io.Serializable, Cloneable, Comparable<UserPhotoResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UserPhotoResponse");

  private static final org.apache.thrift.protocol.TField USER_PHOTO_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("userPhotoUrl", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ALREADY_UPLOADED_FIELD_DESC = new org.apache.thrift.protocol.TField("alreadyUploaded", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField RECEIVER_SCRIPT_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("receiverScriptUrl", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new UserPhotoResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new UserPhotoResponseTupleSchemeFactory());
  }

  public String userPhotoUrl; // required
  public boolean alreadyUploaded; // required
  public String receiverScriptUrl; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_PHOTO_URL((short)1, "userPhotoUrl"),
    ALREADY_UPLOADED((short)2, "alreadyUploaded"),
    RECEIVER_SCRIPT_URL((short)3, "receiverScriptUrl");

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
        case 1: // USER_PHOTO_URL
          return USER_PHOTO_URL;
        case 2: // ALREADY_UPLOADED
          return ALREADY_UPLOADED;
        case 3: // RECEIVER_SCRIPT_URL
          return RECEIVER_SCRIPT_URL;
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
  private static final int __ALREADYUPLOADED_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_PHOTO_URL, new org.apache.thrift.meta_data.FieldMetaData("userPhotoUrl", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ALREADY_UPLOADED, new org.apache.thrift.meta_data.FieldMetaData("alreadyUploaded", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.RECEIVER_SCRIPT_URL, new org.apache.thrift.meta_data.FieldMetaData("receiverScriptUrl", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserPhotoResponse.class, metaDataMap);
  }

  public UserPhotoResponse() {
  }

  public UserPhotoResponse(
    String userPhotoUrl,
    boolean alreadyUploaded,
    String receiverScriptUrl)
  {
    this();
    this.userPhotoUrl = userPhotoUrl;
    this.alreadyUploaded = alreadyUploaded;
    setAlreadyUploadedIsSet(true);
    this.receiverScriptUrl = receiverScriptUrl;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UserPhotoResponse(UserPhotoResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetUserPhotoUrl()) {
      this.userPhotoUrl = other.userPhotoUrl;
    }
    this.alreadyUploaded = other.alreadyUploaded;
    if (other.isSetReceiverScriptUrl()) {
      this.receiverScriptUrl = other.receiverScriptUrl;
    }
  }

  public UserPhotoResponse deepCopy() {
    return new UserPhotoResponse(this);
  }

  @Override
  public void clear() {
    this.userPhotoUrl = null;
    setAlreadyUploadedIsSet(false);
    this.alreadyUploaded = false;
    this.receiverScriptUrl = null;
  }

  public String getUserPhotoUrl() {
    return this.userPhotoUrl;
  }

  public UserPhotoResponse setUserPhotoUrl(String userPhotoUrl) {
    this.userPhotoUrl = userPhotoUrl;
    return this;
  }

  public void unsetUserPhotoUrl() {
    this.userPhotoUrl = null;
  }

  /** Returns true if field userPhotoUrl is set (has been assigned a value) and false otherwise */
  public boolean isSetUserPhotoUrl() {
    return this.userPhotoUrl != null;
  }

  public void setUserPhotoUrlIsSet(boolean value) {
    if (!value) {
      this.userPhotoUrl = null;
    }
  }

  public boolean isAlreadyUploaded() {
    return this.alreadyUploaded;
  }

  public UserPhotoResponse setAlreadyUploaded(boolean alreadyUploaded) {
    this.alreadyUploaded = alreadyUploaded;
    setAlreadyUploadedIsSet(true);
    return this;
  }

  public void unsetAlreadyUploaded() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ALREADYUPLOADED_ISSET_ID);
  }

  /** Returns true if field alreadyUploaded is set (has been assigned a value) and false otherwise */
  public boolean isSetAlreadyUploaded() {
    return EncodingUtils.testBit(__isset_bitfield, __ALREADYUPLOADED_ISSET_ID);
  }

  public void setAlreadyUploadedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ALREADYUPLOADED_ISSET_ID, value);
  }

  public String getReceiverScriptUrl() {
    return this.receiverScriptUrl;
  }

  public UserPhotoResponse setReceiverScriptUrl(String receiverScriptUrl) {
    this.receiverScriptUrl = receiverScriptUrl;
    return this;
  }

  public void unsetReceiverScriptUrl() {
    this.receiverScriptUrl = null;
  }

  /** Returns true if field receiverScriptUrl is set (has been assigned a value) and false otherwise */
  public boolean isSetReceiverScriptUrl() {
    return this.receiverScriptUrl != null;
  }

  public void setReceiverScriptUrlIsSet(boolean value) {
    if (!value) {
      this.receiverScriptUrl = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USER_PHOTO_URL:
      if (value == null) {
        unsetUserPhotoUrl();
      } else {
        setUserPhotoUrl((String)value);
      }
      break;

    case ALREADY_UPLOADED:
      if (value == null) {
        unsetAlreadyUploaded();
      } else {
        setAlreadyUploaded((Boolean)value);
      }
      break;

    case RECEIVER_SCRIPT_URL:
      if (value == null) {
        unsetReceiverScriptUrl();
      } else {
        setReceiverScriptUrl((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_PHOTO_URL:
      return getUserPhotoUrl();

    case ALREADY_UPLOADED:
      return isAlreadyUploaded();

    case RECEIVER_SCRIPT_URL:
      return getReceiverScriptUrl();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USER_PHOTO_URL:
      return isSetUserPhotoUrl();
    case ALREADY_UPLOADED:
      return isSetAlreadyUploaded();
    case RECEIVER_SCRIPT_URL:
      return isSetReceiverScriptUrl();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UserPhotoResponse)
      return this.equals((UserPhotoResponse)that);
    return false;
  }

  public boolean equals(UserPhotoResponse that) {
    if (that == null)
      return false;

    boolean this_present_userPhotoUrl = true && this.isSetUserPhotoUrl();
    boolean that_present_userPhotoUrl = true && that.isSetUserPhotoUrl();
    if (this_present_userPhotoUrl || that_present_userPhotoUrl) {
      if (!(this_present_userPhotoUrl && that_present_userPhotoUrl))
        return false;
      if (!this.userPhotoUrl.equals(that.userPhotoUrl))
        return false;
    }

    boolean this_present_alreadyUploaded = true;
    boolean that_present_alreadyUploaded = true;
    if (this_present_alreadyUploaded || that_present_alreadyUploaded) {
      if (!(this_present_alreadyUploaded && that_present_alreadyUploaded))
        return false;
      if (this.alreadyUploaded != that.alreadyUploaded)
        return false;
    }

    boolean this_present_receiverScriptUrl = true && this.isSetReceiverScriptUrl();
    boolean that_present_receiverScriptUrl = true && that.isSetReceiverScriptUrl();
    if (this_present_receiverScriptUrl || that_present_receiverScriptUrl) {
      if (!(this_present_receiverScriptUrl && that_present_receiverScriptUrl))
        return false;
      if (!this.receiverScriptUrl.equals(that.receiverScriptUrl))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_userPhotoUrl = true && (isSetUserPhotoUrl());
    list.add(present_userPhotoUrl);
    if (present_userPhotoUrl)
      list.add(userPhotoUrl);

    boolean present_alreadyUploaded = true;
    list.add(present_alreadyUploaded);
    if (present_alreadyUploaded)
      list.add(alreadyUploaded);

    boolean present_receiverScriptUrl = true && (isSetReceiverScriptUrl());
    list.add(present_receiverScriptUrl);
    if (present_receiverScriptUrl)
      list.add(receiverScriptUrl);

    return list.hashCode();
  }

  @Override
  public int compareTo(UserPhotoResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUserPhotoUrl()).compareTo(other.isSetUserPhotoUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserPhotoUrl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userPhotoUrl, other.userPhotoUrl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAlreadyUploaded()).compareTo(other.isSetAlreadyUploaded());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAlreadyUploaded()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.alreadyUploaded, other.alreadyUploaded);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReceiverScriptUrl()).compareTo(other.isSetReceiverScriptUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReceiverScriptUrl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.receiverScriptUrl, other.receiverScriptUrl);
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
    StringBuilder sb = new StringBuilder("UserPhotoResponse(");
    boolean first = true;

    sb.append("userPhotoUrl:");
    if (this.userPhotoUrl == null) {
      sb.append("null");
    } else {
      sb.append(this.userPhotoUrl);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("alreadyUploaded:");
    sb.append(this.alreadyUploaded);
    first = false;
    if (!first) sb.append(", ");
    sb.append("receiverScriptUrl:");
    if (this.receiverScriptUrl == null) {
      sb.append("null");
    } else {
      sb.append(this.receiverScriptUrl);
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

  private static class UserPhotoResponseStandardSchemeFactory implements SchemeFactory {
    public UserPhotoResponseStandardScheme getScheme() {
      return new UserPhotoResponseStandardScheme();
    }
  }

  private static class UserPhotoResponseStandardScheme extends StandardScheme<UserPhotoResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UserPhotoResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER_PHOTO_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userPhotoUrl = iprot.readString();
              struct.setUserPhotoUrlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ALREADY_UPLOADED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.alreadyUploaded = iprot.readBool();
              struct.setAlreadyUploadedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RECEIVER_SCRIPT_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.receiverScriptUrl = iprot.readString();
              struct.setReceiverScriptUrlIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, UserPhotoResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.userPhotoUrl != null) {
        oprot.writeFieldBegin(USER_PHOTO_URL_FIELD_DESC);
        oprot.writeString(struct.userPhotoUrl);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(ALREADY_UPLOADED_FIELD_DESC);
      oprot.writeBool(struct.alreadyUploaded);
      oprot.writeFieldEnd();
      if (struct.receiverScriptUrl != null) {
        oprot.writeFieldBegin(RECEIVER_SCRIPT_URL_FIELD_DESC);
        oprot.writeString(struct.receiverScriptUrl);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UserPhotoResponseTupleSchemeFactory implements SchemeFactory {
    public UserPhotoResponseTupleScheme getScheme() {
      return new UserPhotoResponseTupleScheme();
    }
  }

  private static class UserPhotoResponseTupleScheme extends TupleScheme<UserPhotoResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UserPhotoResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUserPhotoUrl()) {
        optionals.set(0);
      }
      if (struct.isSetAlreadyUploaded()) {
        optionals.set(1);
      }
      if (struct.isSetReceiverScriptUrl()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetUserPhotoUrl()) {
        oprot.writeString(struct.userPhotoUrl);
      }
      if (struct.isSetAlreadyUploaded()) {
        oprot.writeBool(struct.alreadyUploaded);
      }
      if (struct.isSetReceiverScriptUrl()) {
        oprot.writeString(struct.receiverScriptUrl);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UserPhotoResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.userPhotoUrl = iprot.readString();
        struct.setUserPhotoUrlIsSet(true);
      }
      if (incoming.get(1)) {
        struct.alreadyUploaded = iprot.readBool();
        struct.setAlreadyUploadedIsSet(true);
      }
      if (incoming.get(2)) {
        struct.receiverScriptUrl = iprot.readString();
        struct.setReceiverScriptUrlIsSet(true);
      }
    }
  }

}

