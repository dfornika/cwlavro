package io.cwl.avro;
/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
/** Modify the behavior of CommandLineTool to generate a single string
containing a shell command line.  Each item in the argument list must be
joined into a string separated by single spaces and quoted to prevent
intepretation by the shell, unless `CommandLineBinding` for that argument
contains `shellQuote: false`.  If `shellQuote: false` is specified, the
argument is joined into the command string without quoting, which allows
the use of shell metacharacters such as `|` for pipes.
 */
@org.apache.avro.specific.AvroGenerated
public class ShellCommandRequirement extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5835444625399396136L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ShellCommandRequirement\",\"doc\":\"Modify the behavior of CommandLineTool to generate a single string\\ncontaining a shell command line.  Each item in the argument list must be\\njoined into a string separated by single spaces and quoted to prevent\\nintepretation by the shell, unless `CommandLineBinding` for that argument\\ncontains `shellQuote: false`.  If `shellQuote: false` is specified, the\\nargument is joined into the command string without quoting, which allows\\nthe use of shell metacharacters such as `|` for pipes.\\n\",\"fields\":[{\"name\":\"class\",\"type\":\"string\",\"doc\":\"Always 'ShellCommandRequirement'\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"@type\"}}],\"extends\":\"https://w3id.org/cwl/cwl#ProcessRequirement\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Always 'ShellCommandRequirement' */
  @Deprecated public java.lang.CharSequence class$;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ShellCommandRequirement() {}

  /**
   * All-args constructor.
   * @param class$ Always 'ShellCommandRequirement'
   */
  public ShellCommandRequirement(java.lang.CharSequence class$) {
    this.class$ = class$;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return class$;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: class$ = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'class$' field.
   * @return Always 'ShellCommandRequirement'
   */
  public java.lang.CharSequence getClass$() {
    return class$;
  }

  /**
   * Sets the value of the 'class$' field.
   * Always 'ShellCommandRequirement'
   * @param value the value to set.
   */
  public void setClass$(java.lang.CharSequence value) {
    this.class$ = value;
  }

  /**
   * Creates a new ShellCommandRequirement RecordBuilder.
   * @return A new ShellCommandRequirement RecordBuilder
   */
  public static ShellCommandRequirement.Builder newBuilder() {
    return new ShellCommandRequirement.Builder();
  }

  /**
   * Creates a new ShellCommandRequirement RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ShellCommandRequirement RecordBuilder
   */
  public static ShellCommandRequirement.Builder newBuilder(ShellCommandRequirement.Builder other) {
    return new ShellCommandRequirement.Builder(other);
  }

  /**
   * Creates a new ShellCommandRequirement RecordBuilder by copying an existing ShellCommandRequirement instance.
   * @param other The existing instance to copy.
   * @return A new ShellCommandRequirement RecordBuilder
   */
  public static ShellCommandRequirement.Builder newBuilder(ShellCommandRequirement other) {
    return new ShellCommandRequirement.Builder(other);
  }

  /**
   * RecordBuilder for ShellCommandRequirement instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ShellCommandRequirement>
    implements org.apache.avro.data.RecordBuilder<ShellCommandRequirement> {

    /** Always 'ShellCommandRequirement' */
    private java.lang.CharSequence class$;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(ShellCommandRequirement.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.class$)) {
        this.class$ = data().deepCopy(fields()[0].schema(), other.class$);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing ShellCommandRequirement instance
     * @param other The existing instance to copy.
     */
    private Builder(ShellCommandRequirement other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.class$)) {
        this.class$ = data().deepCopy(fields()[0].schema(), other.class$);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'class$' field.
      * Always 'ShellCommandRequirement'
      * @return The value.
      */
    public java.lang.CharSequence getClass$() {
      return class$;
    }

    /**
      * Sets the value of the 'class$' field.
      * Always 'ShellCommandRequirement'
      * @param value The value of 'class$'.
      * @return This builder.
      */
    public ShellCommandRequirement.Builder setClass$(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.class$ = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'class$' field has been set.
      * Always 'ShellCommandRequirement'
      * @return True if the 'class$' field has been set, false otherwise.
      */
    public boolean hasClass$() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'class$' field.
      * Always 'ShellCommandRequirement'
      * @return This builder.
      */
    public ShellCommandRequirement.Builder clearClass$() {
      class$ = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public ShellCommandRequirement build() {
      try {
        ShellCommandRequirement record = new ShellCommandRequirement();
        record.class$ = fieldSetFlags()[0] ? this.class$ : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
