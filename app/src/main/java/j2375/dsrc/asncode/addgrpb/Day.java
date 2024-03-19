/*
Copyright (C) 1999-2011 Marben Products. All rights reserved.

THIS FILE IS PROPRIETARY MATERIAL OF MARBEN PRODUCTS.
AND MAY BE USED ONLY BY DIRECT LICENSEES OF ASNSDK PRODUCT.
THIS FILE MAY NOT BE DISTRIBUTED.

===========================================================================

/home/itsrc/J2375_2016/src/asncode/addgrpb/Day.java: 

Generated by ASNSDK TCE-JAVA ASN.1 Compiler v4.0 - REF_8.55 - REF_8.39

===========================================================================
*/
package j2375.dsrc.asncode.addgrpb;

/**
 * <BR> Unsigned units of 15 degree, in 1 octet
 * <BR> the true north is 0, positive is clockwise
 * <BR> the values 240 to 254 shall not be sent
 * <BR> the value 255 (0xFF) indicates an invalid value
 * Class definition of the Day type of the addgrpb module.
 */
public class Day extends fr.marben.asnsdk.japi.spe.IntIntegerValue
{
  /**
   *  Constructs a newly allocated Day.
   */
  public Day ()
  {
    super();
  };

  /**
   *  Constructs a newly allocated Day that represents the primitive int argument.
   *  @param value the value to be represented by this Day.
   */
  public Day (int value)
  {
    super(value);
  };
}
