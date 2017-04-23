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
public class FriendListResponse implements org.apache.thrift.TBase<FriendListResponse, FriendListResponse._Fields>, java.io.Serializable, Cloneable, Comparable<FriendListResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FriendListResponse");

  private static final org.apache.thrift.protocol.TField FRIEND_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("friendList", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new FriendListResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new FriendListResponseTupleSchemeFactory());
  }

  public List<FriendInfo> friendList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FRIEND_LIST((short)1, "friendList");

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
        case 1: // FRIEND_LIST
          return FRIEND_LIST;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FRIEND_LIST, new org.apache.thrift.meta_data.FieldMetaData("friendList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, FriendInfo.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FriendListResponse.class, metaDataMap);
  }

  public FriendListResponse() {
  }

  public FriendListResponse(
    List<FriendInfo> friendList)
  {
    this();
    this.friendList = friendList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FriendListResponse(FriendListResponse other) {
    if (other.isSetFriendList()) {
      List<FriendInfo> __this__friendList = new ArrayList<FriendInfo>(other.friendList.size());
      for (FriendInfo other_element : other.friendList) {
        __this__friendList.add(new FriendInfo(other_element));
      }
      this.friendList = __this__friendList;
    }
  }

  public FriendListResponse deepCopy() {
    return new FriendListResponse(this);
  }

  @Override
  public void clear() {
    this.friendList = null;
  }

  public int getFriendListSize() {
    return (this.friendList == null) ? 0 : this.friendList.size();
  }

  public java.util.Iterator<FriendInfo> getFriendListIterator() {
    return (this.friendList == null) ? null : this.friendList.iterator();
  }

  public void addToFriendList(FriendInfo elem) {
    if (this.friendList == null) {
      this.friendList = new ArrayList<FriendInfo>();
    }
    this.friendList.add(elem);
  }

  public List<FriendInfo> getFriendList() {
    return this.friendList;
  }

  public FriendListResponse setFriendList(List<FriendInfo> friendList) {
    this.friendList = friendList;
    return this;
  }

  public void unsetFriendList() {
    this.friendList = null;
  }

  /** Returns true if field friendList is set (has been assigned a value) and false otherwise */
  public boolean isSetFriendList() {
    return this.friendList != null;
  }

  public void setFriendListIsSet(boolean value) {
    if (!value) {
      this.friendList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FRIEND_LIST:
      if (value == null) {
        unsetFriendList();
      } else {
        setFriendList((List<FriendInfo>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FRIEND_LIST:
      return getFriendList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FRIEND_LIST:
      return isSetFriendList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FriendListResponse)
      return this.equals((FriendListResponse)that);
    return false;
  }

  public boolean equals(FriendListResponse that) {
    if (that == null)
      return false;

    boolean this_present_friendList = true && this.isSetFriendList();
    boolean that_present_friendList = true && that.isSetFriendList();
    if (this_present_friendList || that_present_friendList) {
      if (!(this_present_friendList && that_present_friendList))
        return false;
      if (!this.friendList.equals(that.friendList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_friendList = true && (isSetFriendList());
    list.add(present_friendList);
    if (present_friendList)
      list.add(friendList);

    return list.hashCode();
  }

  @Override
  public int compareTo(FriendListResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetFriendList()).compareTo(other.isSetFriendList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFriendList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.friendList, other.friendList);
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
    StringBuilder sb = new StringBuilder("FriendListResponse(");
    boolean first = true;

    sb.append("friendList:");
    if (this.friendList == null) {
      sb.append("null");
    } else {
      sb.append(this.friendList);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class FriendListResponseStandardSchemeFactory implements SchemeFactory {
    public FriendListResponseStandardScheme getScheme() {
      return new FriendListResponseStandardScheme();
    }
  }

  private static class FriendListResponseStandardScheme extends StandardScheme<FriendListResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FriendListResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FRIEND_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list80 = iprot.readListBegin();
                struct.friendList = new ArrayList<FriendInfo>(_list80.size);
                FriendInfo _elem81;
                for (int _i82 = 0; _i82 < _list80.size; ++_i82)
                {
                  _elem81 = new FriendInfo();
                  _elem81.read(iprot);
                  struct.friendList.add(_elem81);
                }
                iprot.readListEnd();
              }
              struct.setFriendListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, FriendListResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.friendList != null) {
        oprot.writeFieldBegin(FRIEND_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.friendList.size()));
          for (FriendInfo _iter83 : struct.friendList)
          {
            _iter83.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FriendListResponseTupleSchemeFactory implements SchemeFactory {
    public FriendListResponseTupleScheme getScheme() {
      return new FriendListResponseTupleScheme();
    }
  }

  private static class FriendListResponseTupleScheme extends TupleScheme<FriendListResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FriendListResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetFriendList()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetFriendList()) {
        {
          oprot.writeI32(struct.friendList.size());
          for (FriendInfo _iter84 : struct.friendList)
          {
            _iter84.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FriendListResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list85 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.friendList = new ArrayList<FriendInfo>(_list85.size);
          FriendInfo _elem86;
          for (int _i87 = 0; _i87 < _list85.size; ++_i87)
          {
            _elem86 = new FriendInfo();
            _elem86.read(iprot);
            struct.friendList.add(_elem86);
          }
        }
        struct.setFriendListIsSet(true);
      }
    }
  }

}

