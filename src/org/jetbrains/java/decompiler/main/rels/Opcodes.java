package org.jetbrains.java.decompiler.main.rels;

public class Opcodes {

	  // ----------------------------------------------------------------------
	  // BYTECODE VERSIONS
	  // ----------------------------------------------------------------------

	  static int BYTECODE_JAVA_LE_4 = 1;
	  static int BYTECODE_JAVA_5 = 2;
	  static int BYTECODE_JAVA_6 = 3;
	  static int BYTECODE_JAVA_7 = 4;
	  static int BYTECODE_JAVA_8 = 5;

	  // ----------------------------------------------------------------------
	  // VARIABLE TYPES
	  // ----------------------------------------------------------------------

	  static int TYPE_BYTE = 0;
	  static int TYPE_CHAR = 1;
	  static int TYPE_DOUBLE = 2;
	  static int TYPE_FLOAT = 3;
	  static int TYPE_int = 4;
	  static int TYPE_LONG = 5;
	  static int TYPE_SHORT = 6;
	  static int TYPE_BOOLEAN = 7;
	  static int TYPE_OBJECT = 8;
	  static int TYPE_ADDRESS = 9;
	  static int TYPE_VOID = 10;
	  static int TYPE_ANY = 11;
	  static int TYPE_GROUP2EMPTY = 12;
	  static int TYPE_NULL = 13;
	  static int TYPE_NOTINITIALIZED = 14;
	  static int TYPE_BYTECHAR = 15;
	  static int TYPE_SHORTCHAR = 16;
	  static int TYPE_UNKNOWN = 17;
	  static int TYPE_GENVAR = 18;

	  // ----------------------------------------------------------------------
	  // VARIABLE TYPE FAMILIES
	  // ----------------------------------------------------------------------

	  static int TYPE_FAMILY_UNKNOWN = 0;
	  static int TYPE_FAMILY_BOOLEAN = 1;
	  static int TYPE_FAMILY_INTEGER = 2;
	  static int TYPE_FAMILY_FLOAT = 3;
	  static int TYPE_FAMILY_LONG = 4;
	  static int TYPE_FAMILY_DOUBLE = 5;
	  static int TYPE_FAMILY_OBJECT = 6;

	  // ----------------------------------------------------------------------
	  // MODULE CONSTANTS
	  // ----------------------------------------------------------------------

	  static int STACKSIZE_SIMPLE = 1;
	  static int STACKSIZE_DOUBLE = 2;

	  static int VAR_LOCAL = 0;
	  static int VAR_STACK = 1;

	  static int VAR_WRITE = 0;
	  static int VAR_READ = 1;


	  // ----------------------------------------------------------------------
	  // ACCESS FLAGS
	  // ----------------------------------------------------------------------

	  static int ACC_PUBLIC = 0x0001;
	  static int ACC_PRIVATE = 0x0002;
	  static int ACC_PROTECTED = 0x0004;
	  static int ACC_STATIC = 0x0008;
	  static int ACC_FINAL = 0x0010;
	  static int ACC_SYNCHRONIZED = 0x0020;
	  static int ACC_NATIVE = 0x0100;
	  static int ACC_ABSTRACT = 0x0400;
	  static int ACC_STRICT = 0x0800;
	  static int ACC_VOLATILE = 0x0040;
	  static int ACC_BRIDGE = 0x0040;
	  static int ACC_TRANSIENT = 0x0080;
	  static int ACC_VARARGS = 0x0080;
	  static int ACC_SYNTHETIC = 0x1000;
	  static int ACC_ANNOTATION = 0x2000;
	  static int ACC_ENUM = 0x4000;

	  // ----------------------------------------------------------------------
	  // CLASS FLAGS
	  // ----------------------------------------------------------------------

	  static int ACC_SUPER = 0x0020;
	  static int ACC_INTERFACE = 0x0200;


	  // ----------------------------------------------------------------------
	  // DEPENDENCY CONSTANTS
	  // ----------------------------------------------------------------------

	  static int DEP_CONSTANT = 0;
	  static int DEP_UNKNOWN = 1;
	  static int DEP_GENERAL = 2;
	  static int DEP_PARAMS = 4;
	  static int DEP_STATIC = 8;

	  // ----------------------------------------------------------------------
	  // INSTRUCTION GROUPS
	  // ----------------------------------------------------------------------

	  static int GROUP_GENERAL = 1;
	  static int GROUP_JUMP = 2;
	  static int GROUP_SWITCH = 3;
	  static int GROUP_INVOCATION = 4;
	  static int GROUP_FIELDACCESS = 5;
	  static int GROUP_RETURN = 6;

	  // ----------------------------------------------------------------------
	  // POOL CONSTANTS
	  // ----------------------------------------------------------------------

	  static int CONSTANT_Utf8 = 1;
	  static int CONSTANT_Integer = 3;
	  static int CONSTANT_Float = 4;
	  static int CONSTANT_Long = 5;
	  static int CONSTANT_Double = 6;
	  static int CONSTANT_Class = 7;
	  static int CONSTANT_String = 8;
	  static int CONSTANT_Fieldref = 9;
	  static int CONSTANT_Methodref = 10;
	  static int CONSTANT_InterfaceMethodref = 11;
	  static int CONSTANT_NameAndType = 12;
	  static int CONSTANT_MethodHandle = 15;
	  static int CONSTANT_MethodType = 16;
	  static int CONSTANT_InvokeDynamic = 18;

	  // ----------------------------------------------------------------------
	  // MethodHandle reference_kind values
	  // ----------------------------------------------------------------------

	  static int CONSTANT_MethodHandle_REF_getField = 1;
	  static int CONSTANT_MethodHandle_REF_getStatic = 2;
	  static int CONSTANT_MethodHandle_REF_putField = 3;
	  static int CONSTANT_MethodHandle_REF_putStatic = 4;
	  static int CONSTANT_MethodHandle_REF_invokeVirtual = 5;
	  static int CONSTANT_MethodHandle_REF_invokeStatic = 6;
	  static int CONSTANT_MethodHandle_REF_invokeSpecial = 7;
	  static int CONSTANT_MethodHandle_REF_newInvokeSpecial = 8;
	  static int CONSTANT_MethodHandle_REF_invokeInterface = 9;

	  // ----------------------------------------------------------------------
	  // VM OPCODES
	  // ----------------------------------------------------------------------

	  static int opc_nop = 0;
	  static int opc_aconst_null = 1;
	  static int opc_iconst_m1 = 2;
	  static int opc_iconst_0 = 3;
	  static int opc_iconst_1 = 4;
	  static int opc_iconst_2 = 5;
	  static int opc_iconst_3 = 6;
	  static int opc_iconst_4 = 7;
	  static int opc_iconst_5 = 8;
	  static int opc_lconst_0 = 9;
	  static int opc_lconst_1 = 10;
	  static int opc_fconst_0 = 11;
	  static int opc_fconst_1 = 12;
	  static int opc_fconst_2 = 13;
	  static int opc_dconst_0 = 14;
	  static int opc_dconst_1 = 15;
	  static int opc_bipush = 16;
	  static int opc_sipush = 17;
	  static int opc_ldc = 18;
	  static int opc_ldc_w = 19;
	  static int opc_ldc2_w = 20;
	  static int opc_iload = 21;
	  static int opc_lload = 22;
	  static int opc_fload = 23;
	  static int opc_dload = 24;
	  static int opc_aload = 25;
	  static int opc_iload_0 = 26;
	  static int opc_iload_1 = 27;
	  static int opc_iload_2 = 28;
	  static int opc_iload_3 = 29;
	  static int opc_lload_0 = 30;
	  static int opc_lload_1 = 31;
	  static int opc_lload_2 = 32;
	  static int opc_lload_3 = 33;
	  static int opc_fload_0 = 34;
	  static int opc_fload_1 = 35;
	  static int opc_fload_2 = 36;
	  static int opc_fload_3 = 37;
	  static int opc_dload_0 = 38;
	  static int opc_dload_1 = 39;
	  static int opc_dload_2 = 40;
	  static int opc_dload_3 = 41;
	  static int opc_aload_0 = 42;
	  static int opc_aload_1 = 43;
	  static int opc_aload_2 = 44;
	  static int opc_aload_3 = 45;
	  static int opc_iaload = 46;
	  static int opc_laload = 47;
	  static int opc_faload = 48;
	  static int opc_daload = 49;
	  static int opc_aaload = 50;
	  static int opc_baload = 51;
	  static int opc_caload = 52;
	  static int opc_saload = 53;
	  static int opc_istore = 54;
	  static int opc_lstore = 55;
	  static int opc_fstore = 56;
	  static int opc_dstore = 57;
	  static int opc_astore = 58;
	  static int opc_istore_0 = 59;
	  static int opc_istore_1 = 60;
	  static int opc_istore_2 = 61;
	  static int opc_istore_3 = 62;
	  static int opc_lstore_0 = 63;
	  static int opc_lstore_1 = 64;
	  static int opc_lstore_2 = 65;
	  static int opc_lstore_3 = 66;
	  static int opc_fstore_0 = 67;
	  static int opc_fstore_1 = 68;
	  static int opc_fstore_2 = 69;
	  static int opc_fstore_3 = 70;
	  static int opc_dstore_0 = 71;
	  static int opc_dstore_1 = 72;
	  static int opc_dstore_2 = 73;
	  static int opc_dstore_3 = 74;
	  static int opc_astore_0 = 75;
	  static int opc_astore_1 = 76;
	  static int opc_astore_2 = 77;
	  static int opc_astore_3 = 78;
	  static int opc_iastore = 79;
	  static int opc_lastore = 80;
	  static int opc_fastore = 81;
	  static int opc_dastore = 82;
	  static int opc_aastore = 83;
	  static int opc_bastore = 84;
	  static int opc_castore = 85;
	  static int opc_sastore = 86;
	  static int opc_pop = 87;
	  static int opc_pop2 = 88;
	  static int opc_dup = 89;
	  static int opc_dup_x1 = 90;
	  static int opc_dup_x2 = 91;
	  static int opc_dup2 = 92;
	  static int opc_dup2_x1 = 93;
	  static int opc_dup2_x2 = 94;
	  static int opc_swap = 95;
	  static int opc_iadd = 96;
	  static int opc_ladd = 97;
	  static int opc_fadd = 98;
	  static int opc_dadd = 99;
	  static int opc_isub = 100;
	  static int opc_lsub = 101;
	  static int opc_fsub = 102;
	  static int opc_dsub = 103;
	  static int opc_imul = 104;
	  static int opc_lmul = 105;
	  static int opc_fmul = 106;
	  static int opc_dmul = 107;
	  static int opc_idiv = 108;
	  static int opc_ldiv = 109;
	  static int opc_fdiv = 110;
	  static int opc_ddiv = 111;
	  static int opc_irem = 112;
	  static int opc_lrem = 113;
	  static int opc_frem = 114;
	  static int opc_drem = 115;
	  static int opc_ineg = 116;
	  static int opc_lneg = 117;
	  static int opc_fneg = 118;
	  static int opc_dneg = 119;
	  static int opc_ishl = 120;
	  static int opc_lshl = 121;
	  static int opc_ishr = 122;
	  static int opc_lshr = 123;
	  static int opc_iushr = 124;
	  static int opc_lushr = 125;
	  static int opc_iand = 126;
	  static int opc_land = 127;
	  static int opc_ior = 128;
	  static int opc_lor = 129;
	  static int opc_ixor = 130;
	  static int opc_lxor = 131;
	  static int opc_iinc = 132;
	  static int opc_i2l = 133;
	  static int opc_i2f = 134;
	  static int opc_i2d = 135;
	  static int opc_l2i = 136;
	  static int opc_l2f = 137;
	  static int opc_l2d = 138;
	  static int opc_f2i = 139;
	  static int opc_f2l = 140;
	  static int opc_f2d = 141;
	  static int opc_d2i = 142;
	  static int opc_d2l = 143;
	  static int opc_d2f = 144;
	  static int opc_i2b = 145;
	  static int opc_i2c = 146;
	  static int opc_i2s = 147;
	  static int opc_lcmp = 148;
	  static int opc_fcmpl = 149;
	  static int opc_fcmpg = 150;
	  static int opc_dcmpl = 151;
	  static int opc_dcmpg = 152;
	  static int opc_ifeq = 153;
	  static int opc_ifne = 154;
	  static int opc_iflt = 155;
	  static int opc_ifge = 156;
	  static int opc_ifgt = 157;
	  static int opc_ifle = 158;
	  static int opc_if_icmpeq = 159;
	  static int opc_if_icmpne = 160;
	  static int opc_if_icmplt = 161;
	  static int opc_if_icmpge = 162;
	  static int opc_if_icmpgt = 163;
	  static int opc_if_icmple = 164;
	  static int opc_if_acmpeq = 165;
	  static int opc_if_acmpne = 166;
	  static int opc_goto = 167;
	  static int opc_jsr = 168;
	  static int opc_ret = 169;
	  static int opc_tableswitch = 170;
	  static int opc_lookupswitch = 171;
	  static int opc_ireturn = 172;
	  static int opc_lreturn = 173;
	  static int opc_freturn = 174;
	  static int opc_dreturn = 175;
	  static int opc_areturn = 176;
	  static int opc_return = 177;
	  static int opc_getstatic = 178;
	  static int opc_putstatic = 179;
	  static int opc_getfield = 180;
	  static int opc_putfield = 181;
	  static int opc_invokevirtual = 182;
	  static int opc_invokespecial = 183;
	  static int opc_invokestatic = 184;
	  static int opc_invokeinterface = 185;
	  static int opc_invokedynamic = 186;
	  static int opc_xxxunusedxxx = 186;
	  static int opc_new = 187;
	  static int opc_newarray = 188;
	  static int opc_anewarray = 189;
	  static int opc_arraylength = 190;
	  static int opc_athrow = 191;
	  static int opc_checkcast = 192;
	  static int opc_instanceof = 193;
	  static int opc_monitorenter = 194;
	  static int opc_monitorexit = 195;
	  static int opc_wide = 196;
	  static int opc_multianewarray = 197;
	  static int opc_ifnull = 198;
	  static int opc_ifnonnull = 199;
	  static int opc_goto_w = 200;
	  static int opc_jsr_w = 201;

}
