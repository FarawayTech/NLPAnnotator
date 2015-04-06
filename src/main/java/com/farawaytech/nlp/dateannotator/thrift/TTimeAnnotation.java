/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.farawaytech.nlp.dateannotator.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-4-6")
public class TTimeAnnotation implements org.apache.thrift.TBase<TTimeAnnotation, TTimeAnnotation._Fields>, java.io.Serializable, Cloneable, Comparable<TTimeAnnotation> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTimeAnnotation");

  private static final org.apache.thrift.protocol.TField START_TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("startToken", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField END_TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("endToken", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TEMPORAL_FIELD_DESC = new org.apache.thrift.protocol.TField("temporal", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TTimeAnnotationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TTimeAnnotationTupleSchemeFactory());
  }

  public String startToken; // required
  public String endToken; // required
  public String temporal; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    START_TOKEN((short)1, "startToken"),
    END_TOKEN((short)2, "endToken"),
    TEMPORAL((short)3, "temporal");

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
        case 1: // START_TOKEN
          return START_TOKEN;
        case 2: // END_TOKEN
          return END_TOKEN;
        case 3: // TEMPORAL
          return TEMPORAL;
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
    tmpMap.put(_Fields.START_TOKEN, new org.apache.thrift.meta_data.FieldMetaData("startToken", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.END_TOKEN, new org.apache.thrift.meta_data.FieldMetaData("endToken", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TEMPORAL, new org.apache.thrift.meta_data.FieldMetaData("temporal", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTimeAnnotation.class, metaDataMap);
  }

  public TTimeAnnotation() {
  }

  public TTimeAnnotation(
    String startToken,
    String endToken,
    String temporal)
  {
    this();
    this.startToken = startToken;
    this.endToken = endToken;
    this.temporal = temporal;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTimeAnnotation(TTimeAnnotation other) {
    if (other.isSetStartToken()) {
      this.startToken = other.startToken;
    }
    if (other.isSetEndToken()) {
      this.endToken = other.endToken;
    }
    if (other.isSetTemporal()) {
      this.temporal = other.temporal;
    }
  }

  public TTimeAnnotation deepCopy() {
    return new TTimeAnnotation(this);
  }

  @Override
  public void clear() {
    this.startToken = null;
    this.endToken = null;
    this.temporal = null;
  }

  public String getStartToken() {
    return this.startToken;
  }

  public TTimeAnnotation setStartToken(String startToken) {
    this.startToken = startToken;
    return this;
  }

  public void unsetStartToken() {
    this.startToken = null;
  }

  /** Returns true if field startToken is set (has been assigned a value) and false otherwise */
  public boolean isSetStartToken() {
    return this.startToken != null;
  }

  public void setStartTokenIsSet(boolean value) {
    if (!value) {
      this.startToken = null;
    }
  }

  public String getEndToken() {
    return this.endToken;
  }

  public TTimeAnnotation setEndToken(String endToken) {
    this.endToken = endToken;
    return this;
  }

  public void unsetEndToken() {
    this.endToken = null;
  }

  /** Returns true if field endToken is set (has been assigned a value) and false otherwise */
  public boolean isSetEndToken() {
    return this.endToken != null;
  }

  public void setEndTokenIsSet(boolean value) {
    if (!value) {
      this.endToken = null;
    }
  }

  public String getTemporal() {
    return this.temporal;
  }

  public TTimeAnnotation setTemporal(String temporal) {
    this.temporal = temporal;
    return this;
  }

  public void unsetTemporal() {
    this.temporal = null;
  }

  /** Returns true if field temporal is set (has been assigned a value) and false otherwise */
  public boolean isSetTemporal() {
    return this.temporal != null;
  }

  public void setTemporalIsSet(boolean value) {
    if (!value) {
      this.temporal = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case START_TOKEN:
      if (value == null) {
        unsetStartToken();
      } else {
        setStartToken((String)value);
      }
      break;

    case END_TOKEN:
      if (value == null) {
        unsetEndToken();
      } else {
        setEndToken((String)value);
      }
      break;

    case TEMPORAL:
      if (value == null) {
        unsetTemporal();
      } else {
        setTemporal((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case START_TOKEN:
      return getStartToken();

    case END_TOKEN:
      return getEndToken();

    case TEMPORAL:
      return getTemporal();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case START_TOKEN:
      return isSetStartToken();
    case END_TOKEN:
      return isSetEndToken();
    case TEMPORAL:
      return isSetTemporal();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TTimeAnnotation)
      return this.equals((TTimeAnnotation)that);
    return false;
  }

  public boolean equals(TTimeAnnotation that) {
    if (that == null)
      return false;

    boolean this_present_startToken = true && this.isSetStartToken();
    boolean that_present_startToken = true && that.isSetStartToken();
    if (this_present_startToken || that_present_startToken) {
      if (!(this_present_startToken && that_present_startToken))
        return false;
      if (!this.startToken.equals(that.startToken))
        return false;
    }

    boolean this_present_endToken = true && this.isSetEndToken();
    boolean that_present_endToken = true && that.isSetEndToken();
    if (this_present_endToken || that_present_endToken) {
      if (!(this_present_endToken && that_present_endToken))
        return false;
      if (!this.endToken.equals(that.endToken))
        return false;
    }

    boolean this_present_temporal = true && this.isSetTemporal();
    boolean that_present_temporal = true && that.isSetTemporal();
    if (this_present_temporal || that_present_temporal) {
      if (!(this_present_temporal && that_present_temporal))
        return false;
      if (!this.temporal.equals(that.temporal))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_startToken = true && (isSetStartToken());
    list.add(present_startToken);
    if (present_startToken)
      list.add(startToken);

    boolean present_endToken = true && (isSetEndToken());
    list.add(present_endToken);
    if (present_endToken)
      list.add(endToken);

    boolean present_temporal = true && (isSetTemporal());
    list.add(present_temporal);
    if (present_temporal)
      list.add(temporal);

    return list.hashCode();
  }

  @Override
  public int compareTo(TTimeAnnotation other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStartToken()).compareTo(other.isSetStartToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.startToken, other.startToken);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEndToken()).compareTo(other.isSetEndToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.endToken, other.endToken);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTemporal()).compareTo(other.isSetTemporal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTemporal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.temporal, other.temporal);
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
    StringBuilder sb = new StringBuilder("TTimeAnnotation(");
    boolean first = true;

    sb.append("startToken:");
    if (this.startToken == null) {
      sb.append("null");
    } else {
      sb.append(this.startToken);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("endToken:");
    if (this.endToken == null) {
      sb.append("null");
    } else {
      sb.append(this.endToken);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("temporal:");
    if (this.temporal == null) {
      sb.append("null");
    } else {
      sb.append(this.temporal);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (startToken == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'startToken' was not present! Struct: " + toString());
    }
    if (endToken == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'endToken' was not present! Struct: " + toString());
    }
    if (temporal == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'temporal' was not present! Struct: " + toString());
    }
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

  private static class TTimeAnnotationStandardSchemeFactory implements SchemeFactory {
    public TTimeAnnotationStandardScheme getScheme() {
      return new TTimeAnnotationStandardScheme();
    }
  }

  private static class TTimeAnnotationStandardScheme extends StandardScheme<TTimeAnnotation> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TTimeAnnotation struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // START_TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.startToken = iprot.readString();
              struct.setStartTokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // END_TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.endToken = iprot.readString();
              struct.setEndTokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TEMPORAL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.temporal = iprot.readString();
              struct.setTemporalIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TTimeAnnotation struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.startToken != null) {
        oprot.writeFieldBegin(START_TOKEN_FIELD_DESC);
        oprot.writeString(struct.startToken);
        oprot.writeFieldEnd();
      }
      if (struct.endToken != null) {
        oprot.writeFieldBegin(END_TOKEN_FIELD_DESC);
        oprot.writeString(struct.endToken);
        oprot.writeFieldEnd();
      }
      if (struct.temporal != null) {
        oprot.writeFieldBegin(TEMPORAL_FIELD_DESC);
        oprot.writeString(struct.temporal);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TTimeAnnotationTupleSchemeFactory implements SchemeFactory {
    public TTimeAnnotationTupleScheme getScheme() {
      return new TTimeAnnotationTupleScheme();
    }
  }

  private static class TTimeAnnotationTupleScheme extends TupleScheme<TTimeAnnotation> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTimeAnnotation struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.startToken);
      oprot.writeString(struct.endToken);
      oprot.writeString(struct.temporal);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTimeAnnotation struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.startToken = iprot.readString();
      struct.setStartTokenIsSet(true);
      struct.endToken = iprot.readString();
      struct.setEndTokenIsSet(true);
      struct.temporal = iprot.readString();
      struct.setTemporalIsSet(true);
    }
  }

}

