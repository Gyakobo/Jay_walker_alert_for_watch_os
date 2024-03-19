/*
Copyright (C) 1999-2011 Marben Products. All rights reserved.

THIS FILE IS PROPRIETARY MATERIAL OF MARBEN PRODUCTS.
AND MAY BE USED ONLY BY DIRECT LICENSEES OF ASNSDK PRODUCT.
THIS FILE MAY NOT BE DISTRIBUTED.

===========================================================================

/home/itsrc/J2375_2016/src/asncode/dsrc/HumanPropelledType.java: 

Generated by ASNSDK TCE-JAVA ASN.1 Compiler v4.0 - REF_8.55 - REF_8.39

===========================================================================
*/
package j2375.dsrc.asncode.dsrc;

/**
 * <BR> true if ANY Pedestrians or Bicyclists are 
 * <BR> detected crossing the target lane or lanes
 * Class definition of the HumanPropelledType type of the dsrc module.
 */
public class HumanPropelledType extends fr.marben.asnsdk.japi.spe.ExtEnumeratedValue
{
  /**
   * value of the named enumerated unavailable.
   */
  public static final int ASN_unavailable = 0;

  /**
   * value of the named enumerated otherTypes.
   */
  public static final int ASN_otherTypes = 1;

  /**
   * value of the named enumerated onFoot.
   */
  public static final int ASN_onFoot = 2;

  /**
   * value of the named enumerated skateboard.
   */
  public static final int ASN_skateboard = 3;

  /**
   * value of the named enumerated pushOrKickScooter.
   */
  public static final int ASN_pushOrKickScooter = 4;

  /**
   * value of the named enumerated wheelchair.
   */
  public static final int ASN_wheelchair = 5;

  /**
   *  Constructs a newly allocated HumanPropelledType.
   */
  public HumanPropelledType ()
  {
    super();
  };

  /**
   *  Constructs a newly allocated HumanPropelledType that represents the primitive int argument.
   *  @param value the value to be represented by this HumanPropelledType.
   */
  public HumanPropelledType (int value)
  {
    super(value);
  };

  /**
   *  Constructs a newly allocated HumanPropelledType that represents the unknownExt argument.
   *  @param unknownExt the unknown extension value to be represented by this HumanPropelledType.
   */
  public HumanPropelledType (fr.marben.asnsdk.japi.UnknownExtensionValue unknownExt)
  {
    super(unknownExt);
  };
}
