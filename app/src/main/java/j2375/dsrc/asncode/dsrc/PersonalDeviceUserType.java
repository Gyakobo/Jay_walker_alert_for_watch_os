/*
Copyright (C) 1999-2011 Marben Products. All rights reserved.

THIS FILE IS PROPRIETARY MATERIAL OF MARBEN PRODUCTS.
AND MAY BE USED ONLY BY DIRECT LICENSEES OF ASNSDK PRODUCT.
THIS FILE MAY NOT BE DISTRIBUTED.

===========================================================================

/home/itsrc/J2375_2016/src/asncode/dsrc/PersonalDeviceUserType.java: 

Generated by ASNSDK TCE-JAVA ASN.1 Compiler v4.0 - REF_8.55 - REF_8.39

===========================================================================
*/
package j2375.dsrc.asncode.dsrc;

/**
 * <BR> All bits shall be set to zero when unknown state
 * Class definition of the PersonalDeviceUserType type of the dsrc module.
 */
public class PersonalDeviceUserType extends fr.marben.asnsdk.japi.spe.ExtEnumeratedValue
{
  /**
   * value of the named enumerated unavailable.
   */
  public static final int ASN_unavailable = 0;

  /**
   * value of the named enumerated aPEDESTRIAN.
   */
  public static final int ASN_aPEDESTRIAN = 1;

  /**
   * value of the named enumerated aPEDALCYCLIST.
   */
  public static final int ASN_aPEDALCYCLIST = 2;

  /**
   * value of the named enumerated aPUBLICSAFETYWORKER.
   */
  public static final int ASN_aPUBLICSAFETYWORKER = 3;

  /**
   * value of the named enumerated anANIMAL.
   */
  public static final int ASN_anANIMAL = 4;

  /**
   *  Constructs a newly allocated PersonalDeviceUserType.
   */
  public PersonalDeviceUserType ()
  {
    super();
  };

  /**
   *  Constructs a newly allocated PersonalDeviceUserType that represents the primitive int argument.
   *  @param value the value to be represented by this PersonalDeviceUserType.
   */
  public PersonalDeviceUserType (int value)
  {
    super(value);
  };

  /**
   *  Constructs a newly allocated PersonalDeviceUserType that represents the unknownExt argument.
   *  @param unknownExt the unknown extension value to be represented by this PersonalDeviceUserType.
   */
  public PersonalDeviceUserType (fr.marben.asnsdk.japi.UnknownExtensionValue unknownExt)
  {
    super(unknownExt);
  };
}
