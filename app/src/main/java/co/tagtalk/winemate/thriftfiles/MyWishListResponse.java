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
public class MyWishListResponse implements org.apache.thrift.TBase<MyWishListResponse, MyWishListResponse._Fields>, java.io.Serializable, Cloneable, Comparable<MyWishListResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MyWishListResponse");

  private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField WISH_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("wishList", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MyWishListResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MyWishListResponseTupleSchemeFactory());
  }

  public boolean success; // required
  public List<BottleInfo> wishList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SUCCESS((short)1, "success"),
    WISH_LIST((short)2, "wishList");

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
        case 1: // SUCCESS
          return SUCCESS;
        case 2: // WISH_LIST
          return WISH_LIST;
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
  private static final int __SUCCESS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("success", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.WISH_LIST, new org.apache.thrift.meta_data.FieldMetaData("wishList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BottleInfo.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MyWishListResponse.class, metaDataMap);
  }

  public MyWishListResponse() {
  }

  public MyWishListResponse(
    boolean success,
    List<BottleInfo> wishList)
  {
    this();
    this.success = success;
    setSuccessIsSet(true);
    this.wishList = wishList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MyWishListResponse(MyWishListResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    this.success = other.success;
    if (other.isSetWishList()) {
      List<BottleInfo> __this__wishList = new ArrayList<BottleInfo>(other.wishList.size());
      for (BottleInfo other_element : other.wishList) {
        __this__wishList.add(new BottleInfo(other_element));
      }
      this.wishList = __this__wishList;
    }
  }

  public MyWishListResponse deepCopy() {
    return new MyWishListResponse(this);
  }

  @Override
  public void clear() {
    setSuccessIsSet(false);
    this.success = false;
    this.wishList = null;
  }

  public boolean isSuccess() {
    return this.success;
  }

  public MyWishListResponse setSuccess(boolean success) {
    this.success = success;
    setSuccessIsSet(true);
    return this;
  }

  public void unsetSuccess() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SUCCESS_ISSET_ID);
  }

  /** Returns true if field success is set (has been assigned a value) and false otherwise */
  public boolean isSetSuccess() {
    return EncodingUtils.testBit(__isset_bitfield, __SUCCESS_ISSET_ID);
  }

  public void setSuccessIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SUCCESS_ISSET_ID, value);
  }

  public int getWishListSize() {
    return (this.wishList == null) ? 0 : this.wishList.size();
  }

  public java.util.Iterator<BottleInfo> getWishListIterator() {
    return (this.wishList == null) ? null : this.wishList.iterator();
  }

  public void addToWishList(BottleInfo elem) {
    if (this.wishList == null) {
      this.wishList = new ArrayList<BottleInfo>();
    }
    this.wishList.add(elem);
  }

  public List<BottleInfo> getWishList() {
    return this.wishList;
  }

  public MyWishListResponse setWishList(List<BottleInfo> wishList) {
    this.wishList = wishList;
    return this;
  }

  public void unsetWishList() {
    this.wishList = null;
  }

  /** Returns true if field wishList is set (has been assigned a value) and false otherwise */
  public boolean isSetWishList() {
    return this.wishList != null;
  }

  public void setWishListIsSet(boolean value) {
    if (!value) {
      this.wishList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SUCCESS:
      if (value == null) {
        unsetSuccess();
      } else {
        setSuccess((Boolean)value);
      }
      break;

    case WISH_LIST:
      if (value == null) {
        unsetWishList();
      } else {
        setWishList((List<BottleInfo>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SUCCESS:
      return isSuccess();

    case WISH_LIST:
      return getWishList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SUCCESS:
      return isSetSuccess();
    case WISH_LIST:
      return isSetWishList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MyWishListResponse)
      return this.equals((MyWishListResponse)that);
    return false;
  }

  public boolean equals(MyWishListResponse that) {
    if (that == null)
      return false;

    boolean this_present_success = true;
    boolean that_present_success = true;
    if (this_present_success || that_present_success) {
      if (!(this_present_success && that_present_success))
        return false;
      if (this.success != that.success)
        return false;
    }

    boolean this_present_wishList = true && this.isSetWishList();
    boolean that_present_wishList = true && that.isSetWishList();
    if (this_present_wishList || that_present_wishList) {
      if (!(this_present_wishList && that_present_wishList))
        return false;
      if (!this.wishList.equals(that.wishList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_success = true;
    list.add(present_success);
    if (present_success)
      list.add(success);

    boolean present_wishList = true && (isSetWishList());
    list.add(present_wishList);
    if (present_wishList)
      list.add(wishList);

    return list.hashCode();
  }

  @Override
  public int compareTo(MyWishListResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSuccess()).compareTo(other.isSetSuccess());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSuccess()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, other.success);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWishList()).compareTo(other.isSetWishList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWishList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.wishList, other.wishList);
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
    StringBuilder sb = new StringBuilder("MyWishListResponse(");
    boolean first = true;

    sb.append("success:");
    sb.append(this.success);
    first = false;
    if (!first) sb.append(", ");
    sb.append("wishList:");
    if (this.wishList == null) {
      sb.append("null");
    } else {
      sb.append(this.wishList);
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

  private static class MyWishListResponseStandardSchemeFactory implements SchemeFactory {
    public MyWishListResponseStandardScheme getScheme() {
      return new MyWishListResponseStandardScheme();
    }
  }

  private static class MyWishListResponseStandardScheme extends StandardScheme<MyWishListResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MyWishListResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SUCCESS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.success = iprot.readBool();
              struct.setSuccessIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // WISH_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list104 = iprot.readListBegin();
                struct.wishList = new ArrayList<BottleInfo>(_list104.size);
                BottleInfo _elem105;
                for (int _i106 = 0; _i106 < _list104.size; ++_i106)
                {
                  _elem105 = new BottleInfo();
                  _elem105.read(iprot);
                  struct.wishList.add(_elem105);
                }
                iprot.readListEnd();
              }
              struct.setWishListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MyWishListResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
      oprot.writeBool(struct.success);
      oprot.writeFieldEnd();
      if (struct.wishList != null) {
        oprot.writeFieldBegin(WISH_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.wishList.size()));
          for (BottleInfo _iter107 : struct.wishList)
          {
            _iter107.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MyWishListResponseTupleSchemeFactory implements SchemeFactory {
    public MyWishListResponseTupleScheme getScheme() {
      return new MyWishListResponseTupleScheme();
    }
  }

  private static class MyWishListResponseTupleScheme extends TupleScheme<MyWishListResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MyWishListResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSuccess()) {
        optionals.set(0);
      }
      if (struct.isSetWishList()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSuccess()) {
        oprot.writeBool(struct.success);
      }
      if (struct.isSetWishList()) {
        {
          oprot.writeI32(struct.wishList.size());
          for (BottleInfo _iter108 : struct.wishList)
          {
            _iter108.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MyWishListResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.success = iprot.readBool();
        struct.setSuccessIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list109 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.wishList = new ArrayList<BottleInfo>(_list109.size);
          BottleInfo _elem110;
          for (int _i111 = 0; _i111 < _list109.size; ++_i111)
          {
            _elem110 = new BottleInfo();
            _elem110.read(iprot);
            struct.wishList.add(_elem110);
          }
        }
        struct.setWishListIsSet(true);
      }
    }
  }

}
