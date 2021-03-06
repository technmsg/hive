/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hive.service.cli.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-8-17")
public class TPrimitiveTypeEntry implements org.apache.thrift.TBase<TPrimitiveTypeEntry, TPrimitiveTypeEntry._Fields>, java.io.Serializable, Cloneable, Comparable<TPrimitiveTypeEntry> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TPrimitiveTypeEntry");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TYPE_QUALIFIERS_FIELD_DESC = new org.apache.thrift.protocol.TField("typeQualifiers", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TPrimitiveTypeEntryStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TPrimitiveTypeEntryTupleSchemeFactory());
  }

  private TTypeId type; // required
  private TTypeQualifiers typeQualifiers; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TTypeId
     */
    TYPE((short)1, "type"),
    TYPE_QUALIFIERS((short)2, "typeQualifiers");

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
        case 1: // TYPE
          return TYPE;
        case 2: // TYPE_QUALIFIERS
          return TYPE_QUALIFIERS;
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
  private static final _Fields optionals[] = {_Fields.TYPE_QUALIFIERS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TTypeId.class)));
    tmpMap.put(_Fields.TYPE_QUALIFIERS, new org.apache.thrift.meta_data.FieldMetaData("typeQualifiers", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTypeQualifiers.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TPrimitiveTypeEntry.class, metaDataMap);
  }

  public TPrimitiveTypeEntry() {
  }

  public TPrimitiveTypeEntry(
    TTypeId type)
  {
    this();
    this.type = type;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TPrimitiveTypeEntry(TPrimitiveTypeEntry other) {
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetTypeQualifiers()) {
      this.typeQualifiers = new TTypeQualifiers(other.typeQualifiers);
    }
  }

  public TPrimitiveTypeEntry deepCopy() {
    return new TPrimitiveTypeEntry(this);
  }

  @Override
  public void clear() {
    this.type = null;
    this.typeQualifiers = null;
  }

  /**
   * 
   * @see TTypeId
   */
  public TTypeId getType() {
    return this.type;
  }

  /**
   * 
   * @see TTypeId
   */
  public void setType(TTypeId type) {
    this.type = type;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public TTypeQualifiers getTypeQualifiers() {
    return this.typeQualifiers;
  }

  public void setTypeQualifiers(TTypeQualifiers typeQualifiers) {
    this.typeQualifiers = typeQualifiers;
  }

  public void unsetTypeQualifiers() {
    this.typeQualifiers = null;
  }

  /** Returns true if field typeQualifiers is set (has been assigned a value) and false otherwise */
  public boolean isSetTypeQualifiers() {
    return this.typeQualifiers != null;
  }

  public void setTypeQualifiersIsSet(boolean value) {
    if (!value) {
      this.typeQualifiers = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((TTypeId)value);
      }
      break;

    case TYPE_QUALIFIERS:
      if (value == null) {
        unsetTypeQualifiers();
      } else {
        setTypeQualifiers((TTypeQualifiers)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case TYPE_QUALIFIERS:
      return getTypeQualifiers();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case TYPE_QUALIFIERS:
      return isSetTypeQualifiers();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TPrimitiveTypeEntry)
      return this.equals((TPrimitiveTypeEntry)that);
    return false;
  }

  public boolean equals(TPrimitiveTypeEntry that) {
    if (that == null)
      return false;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_typeQualifiers = true && this.isSetTypeQualifiers();
    boolean that_present_typeQualifiers = true && that.isSetTypeQualifiers();
    if (this_present_typeQualifiers || that_present_typeQualifiers) {
      if (!(this_present_typeQualifiers && that_present_typeQualifiers))
        return false;
      if (!this.typeQualifiers.equals(that.typeQualifiers))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_type = true && (isSetType());
    list.add(present_type);
    if (present_type)
      list.add(type.getValue());

    boolean present_typeQualifiers = true && (isSetTypeQualifiers());
    list.add(present_typeQualifiers);
    if (present_typeQualifiers)
      list.add(typeQualifiers);

    return list.hashCode();
  }

  @Override
  public int compareTo(TPrimitiveTypeEntry other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTypeQualifiers()).compareTo(other.isSetTypeQualifiers());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTypeQualifiers()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.typeQualifiers, other.typeQualifiers);
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
    StringBuilder sb = new StringBuilder("TPrimitiveTypeEntry(");
    boolean first = true;

    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (isSetTypeQualifiers()) {
      if (!first) sb.append(", ");
      sb.append("typeQualifiers:");
      if (this.typeQualifiers == null) {
        sb.append("null");
      } else {
        sb.append(this.typeQualifiers);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetType()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'type' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (typeQualifiers != null) {
      typeQualifiers.validate();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TPrimitiveTypeEntryStandardSchemeFactory implements SchemeFactory {
    public TPrimitiveTypeEntryStandardScheme getScheme() {
      return new TPrimitiveTypeEntryStandardScheme();
    }
  }

  private static class TPrimitiveTypeEntryStandardScheme extends StandardScheme<TPrimitiveTypeEntry> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TPrimitiveTypeEntry struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = org.apache.hive.service.cli.thrift.TTypeId.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TYPE_QUALIFIERS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.typeQualifiers = new TTypeQualifiers();
              struct.typeQualifiers.read(iprot);
              struct.setTypeQualifiersIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TPrimitiveTypeEntry struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.typeQualifiers != null) {
        if (struct.isSetTypeQualifiers()) {
          oprot.writeFieldBegin(TYPE_QUALIFIERS_FIELD_DESC);
          struct.typeQualifiers.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TPrimitiveTypeEntryTupleSchemeFactory implements SchemeFactory {
    public TPrimitiveTypeEntryTupleScheme getScheme() {
      return new TPrimitiveTypeEntryTupleScheme();
    }
  }

  private static class TPrimitiveTypeEntryTupleScheme extends TupleScheme<TPrimitiveTypeEntry> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TPrimitiveTypeEntry struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.type.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetTypeQualifiers()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetTypeQualifiers()) {
        struct.typeQualifiers.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TPrimitiveTypeEntry struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.type = org.apache.hive.service.cli.thrift.TTypeId.findByValue(iprot.readI32());
      struct.setTypeIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.typeQualifiers = new TTypeQualifiers();
        struct.typeQualifiers.read(iprot);
        struct.setTypeQualifiersIsSet(true);
      }
    }
  }

}

