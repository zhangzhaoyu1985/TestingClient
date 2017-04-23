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
public class RewardRedeemRequest implements org.apache.thrift.TBase<RewardRedeemRequest, RewardRedeemRequest._Fields>, java.io.Serializable, Cloneable, Comparable<RewardRedeemRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RewardRedeemRequest");

  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField REWARD_REDEEM_ITEMS_FIELD_DESC = new org.apache.thrift.protocol.TField("RewardRedeemItems", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("address", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField TRACKING_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("trackingNumber", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RewardRedeemRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RewardRedeemRequestTupleSchemeFactory());
  }

  public int userId; // required
  public List<RewardRedeemSingleItem> RewardRedeemItems; // required
  public Address address; // required
  public String trackingNumber; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_ID((short)1, "userId"),
    REWARD_REDEEM_ITEMS((short)2, "RewardRedeemItems"),
    ADDRESS((short)3, "address"),
    TRACKING_NUMBER((short)4, "trackingNumber");

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
        case 2: // REWARD_REDEEM_ITEMS
          return REWARD_REDEEM_ITEMS;
        case 3: // ADDRESS
          return ADDRESS;
        case 4: // TRACKING_NUMBER
          return TRACKING_NUMBER;
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
    tmpMap.put(_Fields.REWARD_REDEEM_ITEMS, new org.apache.thrift.meta_data.FieldMetaData("RewardRedeemItems", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RewardRedeemSingleItem.class))));
    tmpMap.put(_Fields.ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("address", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Address.class)));
    tmpMap.put(_Fields.TRACKING_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("trackingNumber", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RewardRedeemRequest.class, metaDataMap);
  }

  public RewardRedeemRequest() {
  }

  public RewardRedeemRequest(
    int userId,
    List<RewardRedeemSingleItem> RewardRedeemItems,
    Address address,
    String trackingNumber)
  {
    this();
    this.userId = userId;
    setUserIdIsSet(true);
    this.RewardRedeemItems = RewardRedeemItems;
    this.address = address;
    this.trackingNumber = trackingNumber;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RewardRedeemRequest(RewardRedeemRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.userId = other.userId;
    if (other.isSetRewardRedeemItems()) {
      List<RewardRedeemSingleItem> __this__RewardRedeemItems = new ArrayList<RewardRedeemSingleItem>(other.RewardRedeemItems.size());
      for (RewardRedeemSingleItem other_element : other.RewardRedeemItems) {
        __this__RewardRedeemItems.add(new RewardRedeemSingleItem(other_element));
      }
      this.RewardRedeemItems = __this__RewardRedeemItems;
    }
    if (other.isSetAddress()) {
      this.address = new Address(other.address);
    }
    if (other.isSetTrackingNumber()) {
      this.trackingNumber = other.trackingNumber;
    }
  }

  public RewardRedeemRequest deepCopy() {
    return new RewardRedeemRequest(this);
  }

  @Override
  public void clear() {
    setUserIdIsSet(false);
    this.userId = 0;
    this.RewardRedeemItems = null;
    this.address = null;
    this.trackingNumber = null;
  }

  public int getUserId() {
    return this.userId;
  }

  public RewardRedeemRequest setUserId(int userId) {
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

  public int getRewardRedeemItemsSize() {
    return (this.RewardRedeemItems == null) ? 0 : this.RewardRedeemItems.size();
  }

  public java.util.Iterator<RewardRedeemSingleItem> getRewardRedeemItemsIterator() {
    return (this.RewardRedeemItems == null) ? null : this.RewardRedeemItems.iterator();
  }

  public void addToRewardRedeemItems(RewardRedeemSingleItem elem) {
    if (this.RewardRedeemItems == null) {
      this.RewardRedeemItems = new ArrayList<RewardRedeemSingleItem>();
    }
    this.RewardRedeemItems.add(elem);
  }

  public List<RewardRedeemSingleItem> getRewardRedeemItems() {
    return this.RewardRedeemItems;
  }

  public RewardRedeemRequest setRewardRedeemItems(List<RewardRedeemSingleItem> RewardRedeemItems) {
    this.RewardRedeemItems = RewardRedeemItems;
    return this;
  }

  public void unsetRewardRedeemItems() {
    this.RewardRedeemItems = null;
  }

  /** Returns true if field RewardRedeemItems is set (has been assigned a value) and false otherwise */
  public boolean isSetRewardRedeemItems() {
    return this.RewardRedeemItems != null;
  }

  public void setRewardRedeemItemsIsSet(boolean value) {
    if (!value) {
      this.RewardRedeemItems = null;
    }
  }

  public Address getAddress() {
    return this.address;
  }

  public RewardRedeemRequest setAddress(Address address) {
    this.address = address;
    return this;
  }

  public void unsetAddress() {
    this.address = null;
  }

  /** Returns true if field address is set (has been assigned a value) and false otherwise */
  public boolean isSetAddress() {
    return this.address != null;
  }

  public void setAddressIsSet(boolean value) {
    if (!value) {
      this.address = null;
    }
  }

  public String getTrackingNumber() {
    return this.trackingNumber;
  }

  public RewardRedeemRequest setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    return this;
  }

  public void unsetTrackingNumber() {
    this.trackingNumber = null;
  }

  /** Returns true if field trackingNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetTrackingNumber() {
    return this.trackingNumber != null;
  }

  public void setTrackingNumberIsSet(boolean value) {
    if (!value) {
      this.trackingNumber = null;
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

    case REWARD_REDEEM_ITEMS:
      if (value == null) {
        unsetRewardRedeemItems();
      } else {
        setRewardRedeemItems((List<RewardRedeemSingleItem>)value);
      }
      break;

    case ADDRESS:
      if (value == null) {
        unsetAddress();
      } else {
        setAddress((Address)value);
      }
      break;

    case TRACKING_NUMBER:
      if (value == null) {
        unsetTrackingNumber();
      } else {
        setTrackingNumber((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_ID:
      return getUserId();

    case REWARD_REDEEM_ITEMS:
      return getRewardRedeemItems();

    case ADDRESS:
      return getAddress();

    case TRACKING_NUMBER:
      return getTrackingNumber();

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
    case REWARD_REDEEM_ITEMS:
      return isSetRewardRedeemItems();
    case ADDRESS:
      return isSetAddress();
    case TRACKING_NUMBER:
      return isSetTrackingNumber();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RewardRedeemRequest)
      return this.equals((RewardRedeemRequest)that);
    return false;
  }

  public boolean equals(RewardRedeemRequest that) {
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

    boolean this_present_RewardRedeemItems = true && this.isSetRewardRedeemItems();
    boolean that_present_RewardRedeemItems = true && that.isSetRewardRedeemItems();
    if (this_present_RewardRedeemItems || that_present_RewardRedeemItems) {
      if (!(this_present_RewardRedeemItems && that_present_RewardRedeemItems))
        return false;
      if (!this.RewardRedeemItems.equals(that.RewardRedeemItems))
        return false;
    }

    boolean this_present_address = true && this.isSetAddress();
    boolean that_present_address = true && that.isSetAddress();
    if (this_present_address || that_present_address) {
      if (!(this_present_address && that_present_address))
        return false;
      if (!this.address.equals(that.address))
        return false;
    }

    boolean this_present_trackingNumber = true && this.isSetTrackingNumber();
    boolean that_present_trackingNumber = true && that.isSetTrackingNumber();
    if (this_present_trackingNumber || that_present_trackingNumber) {
      if (!(this_present_trackingNumber && that_present_trackingNumber))
        return false;
      if (!this.trackingNumber.equals(that.trackingNumber))
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

    boolean present_RewardRedeemItems = true && (isSetRewardRedeemItems());
    list.add(present_RewardRedeemItems);
    if (present_RewardRedeemItems)
      list.add(RewardRedeemItems);

    boolean present_address = true && (isSetAddress());
    list.add(present_address);
    if (present_address)
      list.add(address);

    boolean present_trackingNumber = true && (isSetTrackingNumber());
    list.add(present_trackingNumber);
    if (present_trackingNumber)
      list.add(trackingNumber);

    return list.hashCode();
  }

  @Override
  public int compareTo(RewardRedeemRequest other) {
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
    lastComparison = Boolean.valueOf(isSetRewardRedeemItems()).compareTo(other.isSetRewardRedeemItems());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRewardRedeemItems()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.RewardRedeemItems, other.RewardRedeemItems);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAddress()).compareTo(other.isSetAddress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAddress()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.address, other.address);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTrackingNumber()).compareTo(other.isSetTrackingNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTrackingNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.trackingNumber, other.trackingNumber);
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
    StringBuilder sb = new StringBuilder("RewardRedeemRequest(");
    boolean first = true;

    sb.append("userId:");
    sb.append(this.userId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("RewardRedeemItems:");
    if (this.RewardRedeemItems == null) {
      sb.append("null");
    } else {
      sb.append(this.RewardRedeemItems);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("address:");
    if (this.address == null) {
      sb.append("null");
    } else {
      sb.append(this.address);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("trackingNumber:");
    if (this.trackingNumber == null) {
      sb.append("null");
    } else {
      sb.append(this.trackingNumber);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (address != null) {
      address.validate();
    }
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

  private static class RewardRedeemRequestStandardSchemeFactory implements SchemeFactory {
    public RewardRedeemRequestStandardScheme getScheme() {
      return new RewardRedeemRequestStandardScheme();
    }
  }

  private static class RewardRedeemRequestStandardScheme extends StandardScheme<RewardRedeemRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RewardRedeemRequest struct) throws org.apache.thrift.TException {
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
          case 2: // REWARD_REDEEM_ITEMS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list120 = iprot.readListBegin();
                struct.RewardRedeemItems = new ArrayList<RewardRedeemSingleItem>(_list120.size);
                RewardRedeemSingleItem _elem121;
                for (int _i122 = 0; _i122 < _list120.size; ++_i122)
                {
                  _elem121 = new RewardRedeemSingleItem();
                  _elem121.read(iprot);
                  struct.RewardRedeemItems.add(_elem121);
                }
                iprot.readListEnd();
              }
              struct.setRewardRedeemItemsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ADDRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.address = new Address();
              struct.address.read(iprot);
              struct.setAddressIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TRACKING_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.trackingNumber = iprot.readString();
              struct.setTrackingNumberIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, RewardRedeemRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(USER_ID_FIELD_DESC);
      oprot.writeI32(struct.userId);
      oprot.writeFieldEnd();
      if (struct.RewardRedeemItems != null) {
        oprot.writeFieldBegin(REWARD_REDEEM_ITEMS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.RewardRedeemItems.size()));
          for (RewardRedeemSingleItem _iter123 : struct.RewardRedeemItems)
          {
            _iter123.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.address != null) {
        oprot.writeFieldBegin(ADDRESS_FIELD_DESC);
        struct.address.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.trackingNumber != null) {
        oprot.writeFieldBegin(TRACKING_NUMBER_FIELD_DESC);
        oprot.writeString(struct.trackingNumber);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RewardRedeemRequestTupleSchemeFactory implements SchemeFactory {
    public RewardRedeemRequestTupleScheme getScheme() {
      return new RewardRedeemRequestTupleScheme();
    }
  }

  private static class RewardRedeemRequestTupleScheme extends TupleScheme<RewardRedeemRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RewardRedeemRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUserId()) {
        optionals.set(0);
      }
      if (struct.isSetRewardRedeemItems()) {
        optionals.set(1);
      }
      if (struct.isSetAddress()) {
        optionals.set(2);
      }
      if (struct.isSetTrackingNumber()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetUserId()) {
        oprot.writeI32(struct.userId);
      }
      if (struct.isSetRewardRedeemItems()) {
        {
          oprot.writeI32(struct.RewardRedeemItems.size());
          for (RewardRedeemSingleItem _iter124 : struct.RewardRedeemItems)
          {
            _iter124.write(oprot);
          }
        }
      }
      if (struct.isSetAddress()) {
        struct.address.write(oprot);
      }
      if (struct.isSetTrackingNumber()) {
        oprot.writeString(struct.trackingNumber);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RewardRedeemRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.userId = iprot.readI32();
        struct.setUserIdIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list125 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.RewardRedeemItems = new ArrayList<RewardRedeemSingleItem>(_list125.size);
          RewardRedeemSingleItem _elem126;
          for (int _i127 = 0; _i127 < _list125.size; ++_i127)
          {
            _elem126 = new RewardRedeemSingleItem();
            _elem126.read(iprot);
            struct.RewardRedeemItems.add(_elem126);
          }
        }
        struct.setRewardRedeemItemsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.address = new Address();
        struct.address.read(iprot);
        struct.setAddressIsSet(true);
      }
      if (incoming.get(3)) {
        struct.trackingNumber = iprot.readString();
        struct.setTrackingNumberIsSet(true);
      }
    }
  }

}
