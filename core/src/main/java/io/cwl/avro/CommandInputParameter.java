package io.cwl.avro;
/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
@SuppressWarnings("all")
/** An input parameter for a CommandLineTool. */
@org.apache.avro.specific.AvroGenerated
public class CommandInputParameter extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CommandInputParameter\",\"doc\":\"An input parameter for a CommandLineTool.\",\"fields\":[{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"CWLType\",\"symbols\":[\"File\"],\"symbol\":[\"https://w3id.org/cwl/salad#null\",\"http://www.w3.org/2001/XMLSchema#boolean\",\"http://www.w3.org/2001/XMLSchema#int\",\"http://www.w3.org/2001/XMLSchema#long\",\"http://www.w3.org/2001/XMLSchema#float\",\"http://www.w3.org/2001/XMLSchema#double\",\"http://www.w3.org/2001/XMLSchema#string\",\"https://w3id.org/cwl/cwl#File\"],\"extends\":\"https://w3id.org/cwl/salad#PrimitiveType\"},{\"type\":\"record\",\"name\":\"CommandInputRecordSchema\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Record_symbol\",\"symbols\":[\"record\"]},\"doc\":\"Must be `record`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#RecordSchema\"},{\"name\":\"fields\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"CommandInputRecordField\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"The name of the field\\n\",\"jsonldPredicate\":\"@id\",\"inherited_from\":\"https://w3id.org/cwl/salad#RecordField\"},{\"name\":\"doc\",\"type\":[\"null\",\"string\"],\"doc\":\"A documentation string for this field\\n\",\"jsonldPredicate\":\"sld:doc\",\"inherited_from\":\"https://w3id.org/cwl/salad#RecordField\"},{\"name\":\"type\",\"type\":[{\"type\":\"enum\",\"name\":\"PrimitiveType\",\"symbols\":[\"null\",\"boolean\",\"int\",\"long\",\"float\",\"double\",\"string\"]},\"CommandInputRecordSchema\",{\"type\":\"record\",\"name\":\"CommandInputEnumSchema\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Enum_symbol\",\"symbols\":[\"enum\"]},\"doc\":\"Must be `enum`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#EnumSchema\"},{\"name\":\"symbols\",\"type\":[{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"Defines the set of valid symbols.\",\"jsonldPredicate\":{\"_type\":\"@id\",\"_id\":\"https://w3id.org/cwl/salad#symbols\",\"identity\":true},\"inherited_from\":\"https://w3id.org/cwl/salad#EnumSchema\"},{\"name\":\"inputBinding\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CommandLineBinding\",\"doc\":\"\\nWhen listed under `inputBinding` in the input schema, the term\\n\\\"value\\\" refers to the the corresponding value in the input object.  For\\nbinding objects listed in `CommandLineTool.arguments`, the term \\\"value\\\"\\nrefers to the effective value after evaluating `valueFrom`.\\n\\nThe binding behavior when building the command line depends on the data\\ntype of the value.  If there is a mismatch between the type described by\\nthe input schema and the effective value, such as resulting from an\\nexpression evaluation, an implementation must use the data type of the\\neffective value.\\n\\n  - **string**: Add `prefix` and the string to the command line.\\n\\n  - **number**: Add `prefix` and decimal representation to command line.\\n\\n  - **boolean**: If true, add `prefix` to the command line.  If false, add\\n      nothing.\\n\\n  - **File**: Add `prefix` and the value of\\n    [`File.path`](#File) to the command line.\\n\\n  - **array**: If `itemSeparator` is specified, add `prefix` and the join\\n      the array into a single string with `itemSeparator` separating the\\n      items.  Otherwise first add `prefix`, then recursively process\\n      individual elements.\\n\\n  - **object**: Add `prefix` only, and recursively add object fields for\\n      which `inputBinding` is specified.\\n\\n  - **null**: Add nothing.\\n\",\"fields\":[{\"name\":\"loadContents\",\"type\":[\"null\",\"boolean\"],\"doc\":\"Only applies when `type` is `File`.  Read up to the first 64 KiB of text from the file and place it in the\\n\\\"contents\\\" field of the file object for manipulation by expressions.\\n\",\"inherited_from\":\"https://w3id.org/cwl/cwl#Binding\"},{\"name\":\"secondaryFiles\",\"type\":[\"null\",\"string\",{\"type\":\"enum\",\"name\":\"Expression\",\"doc\":\"Not a real type.  Indicates that a field must allow expressions.\\n\",\"symbols\":[\"ExpressionPlaceholder\"]},{\"type\":\"array\",\"items\":[\"string\",\"Expression\"]}],\"doc\":\"Only applies when `type` is `File`.  Describes files that must be\\nincluded alongside the primary file.\\n\\nIf the value is an expression, the context of the expression is the input\\nor output File parameter to which this binding applies.\\n\\nIf the value is a string, it specifies that the following pattern\\nshould be applied to the primary file:\\n\\n  1. If string begins with one or more caret `^` characters, for each\\n    caret, remove the last file extension from the path (the last\\n    period `.` and all following characters).  If there are no file\\n    extensions, the path is unchanged.\\n  2. Append the remainder of the string to the end of the file path.\\n\",\"jsonldPredicate\":\"cwl:secondaryFiles\",\"inherited_from\":\"https://w3id.org/cwl/cwl#Binding\"},{\"name\":\"position\",\"type\":[\"null\",\"int\"],\"doc\":\"The sorting key.  Default position is 0.\"},{\"name\":\"prefix\",\"type\":[\"null\",\"string\"],\"doc\":\"Command line prefix to add before the value.\"},{\"name\":\"separate\",\"type\":[\"null\",\"boolean\"],\"doc\":\"If true (default), then the prefix and value must be added as separate\\ncommand line arguments; if false, prefix and value must be concatenated\\ninto a single command line argument.\\n\"},{\"name\":\"itemSeparator\",\"type\":[\"null\",\"string\"],\"doc\":\"Join the array elements into a single string with the elements\\nseparated by by `itemSeparator`.\\n\"},{\"name\":\"valueFrom\",\"type\":[\"null\",\"string\",\"Expression\"],\"doc\":\"If `valueFrom` is a constant string value, use this as the value and\\napply the binding rules above.\\n\\nIf `valueFrom` is an expression, evaluate the expression to yield the\\nactual value to use to build the command line and apply the binding\\nrules above.  If the inputBinding is associated with an input\\nparameter, the \\\"context\\\" of the expression will be the value of the\\ninput parameter.\\n\\nWhen a binding is part of the `CommandLineTool.arguments` field,\\nthe `valueFrom` field is required.\\n\",\"jsonldPredicate\":\"cwl:valueFrom\"},{\"name\":\"shellQuote\",\"type\":[\"null\",\"boolean\"],\"doc\":\"If `ShellCommandRequirement` is in the requirements for the current command,\\nthis controls whether the value is quoted on the command line (default is true).\\nUse `shellQuote: false` to inject metacharacters for operations such as pipes.\\n\"}],\"extends\":\"https://w3id.org/cwl/cwl#Binding\"}],\"jsonldPredicate\":\"cwl:inputBinding\",\"inherited_from\":\"https://w3id.org/cwl/cwl#InputEnumSchema\"}],\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/cwl#Binding\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandLineBinding\"}],\"extends\":\"https://w3id.org/cwl/cwl#InputEnumSchema\"},{\"type\":\"record\",\"name\":\"CommandInputArraySchema\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Array_symbol\",\"symbols\":[\"array\"]},\"doc\":\"Must be `array`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#ArraySchema\"},{\"name\":\"items\",\"type\":[\"PrimitiveType\",\"CommandInputRecordSchema\",\"CommandInputEnumSchema\",\"CommandInputArraySchema\",\"string\",{\"type\":\"array\",\"items\":[\"PrimitiveType\",\"CommandInputRecordSchema\",\"CommandInputEnumSchema\",\"CommandInputArraySchema\",\"string\"]}],\"doc\":\"Defines the type of the array elements.\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#items\"},\"inherited_from\":\"https://w3id.org/cwl/salad#ArraySchema\"},{\"name\":\"inputBinding\",\"type\":[\"null\",\"CommandLineBinding\"],\"jsonldPredicate\":\"cwl:inputBinding\",\"inherited_from\":\"https://w3id.org/cwl/cwl#InputArraySchema\"}],\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputRecordSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandInputRecordSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputEnumSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandInputEnumSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputArraySchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandInputArraySchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#Binding\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandLineBinding\"}],\"extends\":\"https://w3id.org/cwl/cwl#InputArraySchema\"},\"string\",{\"type\":\"array\",\"items\":[\"PrimitiveType\",\"CommandInputRecordSchema\",\"CommandInputEnumSchema\",\"CommandInputArraySchema\",\"string\"]}],\"doc\":\"The field type\\n\",\"json","ldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#RecordField\"},{\"name\":\"inputBinding\",\"type\":[\"null\",\"CommandLineBinding\"],\"jsonldPredicate\":\"cwl:inputBinding\",\"inherited_from\":\"https://w3id.org/cwl/cwl#InputRecordField\"}],\"extends\":\"https://w3id.org/cwl/cwl#InputRecordField\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputRecordSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandInputRecordSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputEnumSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandInputEnumSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputArraySchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandInputArraySchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#Binding\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandLineBinding\"}]}}],\"doc\":\"Defines the fields of the record.\",\"jsonldPredicate\":\"sld:fields\",\"inherited_from\":\"https://w3id.org/cwl/salad#RecordSchema\"}],\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputRecordField\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandInputRecordField\"}],\"extends\":\"https://w3id.org/cwl/cwl#InputRecordSchema\"},\"CommandInputEnumSchema\",\"CommandInputArraySchema\",\"string\",{\"type\":\"array\",\"items\":[\"CWLType\",\"CommandInputRecordSchema\",\"CommandInputEnumSchema\",\"CommandInputArraySchema\",\"string\"]}],\"doc\":\"Specify valid types of data that may be assigned to this parameter.\\n\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/cwl#Parameter\"},{\"name\":\"label\",\"type\":[\"null\",\"string\"],\"doc\":\"A short, human-readable label of this parameter object.\",\"jsonldPredicate\":\"rdfs:label\",\"inherited_from\":\"https://w3id.org/cwl/cwl#Parameter\"},{\"name\":\"description\",\"type\":[\"null\",\"string\"],\"doc\":\"A long, human-readable description of this parameter object.\",\"jsonldPredicate\":\"rdfs:comment\",\"inherited_from\":\"https://w3id.org/cwl/cwl#Parameter\"},{\"name\":\"streamable\",\"type\":[\"null\",\"boolean\"],\"doc\":\"Currently only applies if `type` is `File`.  A value of `true`\\nindicates that the file is read or written sequentially without\\nseeking.  An implementation may use this flag to indicate whether it is\\nvalid to stream file contents using a named pipe.  Default: `false`.\\n\",\"inherited_from\":\"https://w3id.org/cwl/cwl#Parameter\"},{\"name\":\"default\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"Any\",\"doc\":\"The **Any** type validates for any non-null value.\\n\",\"symbols\":[\"Any\"]}],\"doc\":\"The default value for this parameter if not provided in the input\\nobject.\\n\",\"jsonldPredicate\":\"cwl:default\",\"inherited_from\":\"https://w3id.org/cwl/cwl#Parameter\"},{\"name\":\"format\",\"type\":[\"null\",\"string\",{\"type\":\"array\",\"items\":\"string\"},\"Expression\"],\"doc\":\"Only applies if `type` is `File` or array of `File`.\\n\\nFor input parameters, this must be one or more URIs of a concept nodes\\nthat represents file formats which are allowed as input to this\\nparameter, preferrably defined within an ontology.  If no ontology is\\navailable, file formats may be tested by exact match.  See\\n(FormatOntologyRequirement)[#formatontologyrequirement] for more\\ninformation.\\n\\nFor output parameters, this is the file format that will be assigned to\\nthe output parameter.\\n\",\"jsonldPredicate\":{\"_type\":\"@id\",\"_id\":\"https://w3id.org/cwl/cwl#format\",\"identity\":true},\"inherited_from\":\"https://w3id.org/cwl/cwl#Parameter\"},{\"name\":\"id\",\"type\":\"string\",\"doc\":\"The unique identifier for this parameter object.\",\"jsonldPredicate\":\"@id\",\"inherited_from\":\"https://w3id.org/cwl/cwl#InputParameter\"},{\"name\":\"inputBinding\",\"type\":[\"null\",\"CommandLineBinding\"],\"doc\":\"Describes how to handle the inputs of a process and convert them\\ninto a concrete form for execution, such as command line parameters.\\n\",\"jsonldPredicate\":\"cwl:inputBinding\",\"inherited_from\":\"https://w3id.org/cwl/cwl#InputParameter\"}],\"extends\":\"https://w3id.org/cwl/cwl#InputParameter\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputRecordSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandInputRecordSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputEnumSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandInputEnumSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputArraySchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandInputArraySchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#Binding\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandLineBinding\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Specify valid types of data that may be assigned to this parameter.
 */
  @Deprecated public java.lang.Object type;
  /** A short, human-readable label of this parameter object. */
  @Deprecated public java.lang.CharSequence label;
  /** A long, human-readable description of this parameter object. */
  @Deprecated public java.lang.CharSequence description;
  /** Currently only applies if `type` is `File`.  A value of `true`
indicates that the file is read or written sequentially without
seeking.  An implementation may use this flag to indicate whether it is
valid to stream file contents using a named pipe.  Default: `false`.
 */
  @Deprecated public java.lang.Boolean streamable;
  /** The default value for this parameter if not provided in the input
object.
 */
  @Deprecated public Any default$;
  /** Only applies if `type` is `File` or array of `File`.

For input parameters, this must be one or more URIs of a concept nodes
that represents file formats which are allowed as input to this
parameter, preferrably defined within an ontology.  If no ontology is
available, file formats may be tested by exact match.  See
(FormatOntologyRequirement)[#formatontologyrequirement] for more
information.

For output parameters, this is the file format that will be assigned to
the output parameter.
 */
  @Deprecated public java.lang.Object format;
  /** The unique identifier for this parameter object. */
  @Deprecated public java.lang.CharSequence id;
  /** Describes how to handle the inputs of a process and convert them
into a concrete form for execution, such as command line parameters.
 */
  @Deprecated public CommandLineBinding inputBinding;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public CommandInputParameter() {}

  /**
   * All-args constructor.
   */
  public CommandInputParameter(java.lang.Object type, java.lang.CharSequence label, java.lang.CharSequence description, java.lang.Boolean streamable, Any default$, java.lang.Object format, java.lang.CharSequence id, CommandLineBinding inputBinding) {
    this.type = type;
    this.label = label;
    this.description = description;
    this.streamable = streamable;
    this.default$ = default$;
    this.format = format;
    this.id = id;
    this.inputBinding = inputBinding;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return label;
    case 2: return description;
    case 3: return streamable;
    case 4: return default$;
    case 5: return format;
    case 6: return id;
    case 7: return inputBinding;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: type = (java.lang.Object)value$; break;
    case 1: label = (java.lang.CharSequence)value$; break;
    case 2: description = (java.lang.CharSequence)value$; break;
    case 3: streamable = (java.lang.Boolean)value$; break;
    case 4: default$ = (Any)value$; break;
    case 5: format = (java.lang.Object)value$; break;
    case 6: id = (java.lang.CharSequence)value$; break;
    case 7: inputBinding = (CommandLineBinding)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'type' field.
   * Specify valid types of data that may be assigned to this parameter.
   */
  public java.lang.Object getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * Specify valid types of data that may be assigned to this parameter.
   * @param value the value to set.
   */
  public void setType(java.lang.Object value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'label' field.
   * A short, human-readable label of this parameter object.   */
  public java.lang.CharSequence getLabel() {
    return label;
  }

  /**
   * Sets the value of the 'label' field.
   * A short, human-readable label of this parameter object.   * @param value the value to set.
   */
  public void setLabel(java.lang.CharSequence value) {
    this.label = value;
  }

  /**
   * Gets the value of the 'description' field.
   * A long, human-readable description of this parameter object.   */
  public java.lang.CharSequence getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * A long, human-readable description of this parameter object.   * @param value the value to set.
   */
  public void setDescription(java.lang.CharSequence value) {
    this.description = value;
  }

  /**
   * Gets the value of the 'streamable' field.
   * Currently only applies if `type` is `File`.  A value of `true`
indicates that the file is read or written sequentially without
seeking.  An implementation may use this flag to indicate whether it is
valid to stream file contents using a named pipe.  Default: `false`.
   */
  public java.lang.Boolean getStreamable() {
    return streamable;
  }

  /**
   * Sets the value of the 'streamable' field.
   * Currently only applies if `type` is `File`.  A value of `true`
indicates that the file is read or written sequentially without
seeking.  An implementation may use this flag to indicate whether it is
valid to stream file contents using a named pipe.  Default: `false`.
   * @param value the value to set.
   */
  public void setStreamable(java.lang.Boolean value) {
    this.streamable = value;
  }

  /**
   * Gets the value of the 'default$' field.
   * The default value for this parameter if not provided in the input
object.
   */
  public Any getDefault$() {
    return default$;
  }

  /**
   * Sets the value of the 'default$' field.
   * The default value for this parameter if not provided in the input
object.
   * @param value the value to set.
   */
  public void setDefault$(Any value) {
    this.default$ = value;
  }

  /**
   * Gets the value of the 'format' field.
   * Only applies if `type` is `File` or array of `File`.

For input parameters, this must be one or more URIs of a concept nodes
that represents file formats which are allowed as input to this
parameter, preferrably defined within an ontology.  If no ontology is
available, file formats may be tested by exact match.  See
(FormatOntologyRequirement)[#formatontologyrequirement] for more
information.

For output parameters, this is the file format that will be assigned to
the output parameter.
   */
  public java.lang.Object getFormat() {
    return format;
  }

  /**
   * Sets the value of the 'format' field.
   * Only applies if `type` is `File` or array of `File`.

For input parameters, this must be one or more URIs of a concept nodes
that represents file formats which are allowed as input to this
parameter, preferrably defined within an ontology.  If no ontology is
available, file formats may be tested by exact match.  See
(FormatOntologyRequirement)[#formatontologyrequirement] for more
information.

For output parameters, this is the file format that will be assigned to
the output parameter.
   * @param value the value to set.
   */
  public void setFormat(java.lang.Object value) {
    this.format = value;
  }

  /**
   * Gets the value of the 'id' field.
   * The unique identifier for this parameter object.   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * The unique identifier for this parameter object.   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'inputBinding' field.
   * Describes how to handle the inputs of a process and convert them
into a concrete form for execution, such as command line parameters.
   */
  public CommandLineBinding getInputBinding() {
    return inputBinding;
  }

  /**
   * Sets the value of the 'inputBinding' field.
   * Describes how to handle the inputs of a process and convert them
into a concrete form for execution, such as command line parameters.
   * @param value the value to set.
   */
  public void setInputBinding(CommandLineBinding value) {
    this.inputBinding = value;
  }

  /** Creates a new CommandInputParameter RecordBuilder */
  public static CommandInputParameter.Builder newBuilder() {
    return new CommandInputParameter.Builder();
  }
  
  /** Creates a new CommandInputParameter RecordBuilder by copying an existing Builder */
  public static CommandInputParameter.Builder newBuilder(CommandInputParameter.Builder other) {
    return new CommandInputParameter.Builder(other);
  }
  
  /** Creates a new CommandInputParameter RecordBuilder by copying an existing CommandInputParameter instance */
  public static CommandInputParameter.Builder newBuilder(CommandInputParameter other) {
    return new CommandInputParameter.Builder(other);
  }
  
  /**
   * RecordBuilder for CommandInputParameter instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CommandInputParameter>
    implements org.apache.avro.data.RecordBuilder<CommandInputParameter> {

    private java.lang.Object type;
    private java.lang.CharSequence label;
    private java.lang.CharSequence description;
    private java.lang.Boolean streamable;
    private Any default$;
    private java.lang.Object format;
    private java.lang.CharSequence id;
    private CommandLineBinding inputBinding;

    /** Creates a new Builder */
    private Builder() {
      super(CommandInputParameter.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(CommandInputParameter.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.label)) {
        this.label = data().deepCopy(fields()[1].schema(), other.label);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.description)) {
        this.description = data().deepCopy(fields()[2].schema(), other.description);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.streamable)) {
        this.streamable = data().deepCopy(fields()[3].schema(), other.streamable);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.default$)) {
        this.default$ = data().deepCopy(fields()[4].schema(), other.default$);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.format)) {
        this.format = data().deepCopy(fields()[5].schema(), other.format);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.id)) {
        this.id = data().deepCopy(fields()[6].schema(), other.id);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.inputBinding)) {
        this.inputBinding = data().deepCopy(fields()[7].schema(), other.inputBinding);
        fieldSetFlags()[7] = true;
      }
    }
    
    /** Creates a Builder by copying an existing CommandInputParameter instance */
    private Builder(CommandInputParameter other) {
            super(CommandInputParameter.SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.label)) {
        this.label = data().deepCopy(fields()[1].schema(), other.label);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.description)) {
        this.description = data().deepCopy(fields()[2].schema(), other.description);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.streamable)) {
        this.streamable = data().deepCopy(fields()[3].schema(), other.streamable);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.default$)) {
        this.default$ = data().deepCopy(fields()[4].schema(), other.default$);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.format)) {
        this.format = data().deepCopy(fields()[5].schema(), other.format);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.id)) {
        this.id = data().deepCopy(fields()[6].schema(), other.id);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.inputBinding)) {
        this.inputBinding = data().deepCopy(fields()[7].schema(), other.inputBinding);
        fieldSetFlags()[7] = true;
      }
    }

    /** Gets the value of the 'type' field */
    public java.lang.Object getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public CommandInputParameter.Builder setType(java.lang.Object value) {
      validate(fields()[0], value);
      this.type = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'type' field has been set */
    public boolean hasType() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'type' field */
    public CommandInputParameter.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'label' field */
    public java.lang.CharSequence getLabel() {
      return label;
    }
    
    /** Sets the value of the 'label' field */
    public CommandInputParameter.Builder setLabel(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.label = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'label' field has been set */
    public boolean hasLabel() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'label' field */
    public CommandInputParameter.Builder clearLabel() {
      label = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'description' field */
    public java.lang.CharSequence getDescription() {
      return description;
    }
    
    /** Sets the value of the 'description' field */
    public CommandInputParameter.Builder setDescription(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.description = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'description' field has been set */
    public boolean hasDescription() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'description' field */
    public CommandInputParameter.Builder clearDescription() {
      description = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'streamable' field */
    public java.lang.Boolean getStreamable() {
      return streamable;
    }
    
    /** Sets the value of the 'streamable' field */
    public CommandInputParameter.Builder setStreamable(java.lang.Boolean value) {
      validate(fields()[3], value);
      this.streamable = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'streamable' field has been set */
    public boolean hasStreamable() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'streamable' field */
    public CommandInputParameter.Builder clearStreamable() {
      streamable = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'default$' field */
    public Any getDefault$() {
      return default$;
    }
    
    /** Sets the value of the 'default$' field */
    public CommandInputParameter.Builder setDefault$(Any value) {
      validate(fields()[4], value);
      this.default$ = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'default$' field has been set */
    public boolean hasDefault$() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'default$' field */
    public CommandInputParameter.Builder clearDefault$() {
      default$ = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'format' field */
    public java.lang.Object getFormat() {
      return format;
    }
    
    /** Sets the value of the 'format' field */
    public CommandInputParameter.Builder setFormat(java.lang.Object value) {
      validate(fields()[5], value);
      this.format = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'format' field has been set */
    public boolean hasFormat() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'format' field */
    public CommandInputParameter.Builder clearFormat() {
      format = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public CommandInputParameter.Builder setId(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.id = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'id' field */
    public CommandInputParameter.Builder clearId() {
      id = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'inputBinding' field */
    public CommandLineBinding getInputBinding() {
      return inputBinding;
    }
    
    /** Sets the value of the 'inputBinding' field */
    public CommandInputParameter.Builder setInputBinding(CommandLineBinding value) {
      validate(fields()[7], value);
      this.inputBinding = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'inputBinding' field has been set */
    public boolean hasInputBinding() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'inputBinding' field */
    public CommandInputParameter.Builder clearInputBinding() {
      inputBinding = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    public CommandInputParameter build() {
      try {
        CommandInputParameter record = new CommandInputParameter();
        record.type = fieldSetFlags()[0] ? this.type : (java.lang.Object) defaultValue(fields()[0]);
        record.label = fieldSetFlags()[1] ? this.label : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.description = fieldSetFlags()[2] ? this.description : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.streamable = fieldSetFlags()[3] ? this.streamable : (java.lang.Boolean) defaultValue(fields()[3]);
        record.default$ = fieldSetFlags()[4] ? this.default$ : (Any) defaultValue(fields()[4]);
        record.format = fieldSetFlags()[5] ? this.format : (java.lang.Object) defaultValue(fields()[5]);
        record.id = fieldSetFlags()[6] ? this.id : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.inputBinding = fieldSetFlags()[7] ? this.inputBinding : (CommandLineBinding) defaultValue(fields()[7]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}