/*
Copyright (C) 1999-2011 Marben Products. All rights reserved.

THIS FILE IS PROPRIETARY MATERIAL OF MARBEN PRODUCTS.
AND MAY BE USED ONLY BY DIRECT LICENSEES OF ASNSDK PRODUCT.
THIS FILE MAY NOT BE DISTRIBUTED.

===========================================================================

/home/itsrc/J2375_2016/src/asncode/dsrc/VerticalAccelerationThreshold.java: 

Generated by ASNSDK TCE-JAVA ASN.1 Compiler v4.0 - REF_8.55 - REF_8.39

===========================================================================
*/
package j2375.dsrc.asncode.dsrc;

/**
 * <BR> Units of 002 m/s
 * <BR> The value 8191 indicates that 
 * <BR> velocity is unavailable
 * Class definition of the VerticalAccelerationThreshold type of the dsrc module.
 */
public class VerticalAccelerationThreshold extends fr.marben.asnsdk.japi.spe.BitStringValue
{
  /**
   * value of the named bit notEquipped.
   */
  public static final int ASN_notEquipped = 0;

  /**
   * value of the named bit leftFront.
   */
  public static final int ASN_leftFront = 1;

  /**
   * value of the named bit leftRear.
   */
  public static final int ASN_leftRear = 2;

  /**
   * value of the named bit rightFront.
   */
  public static final int ASN_rightFront = 3;

  /**
   * value of the named bit rightRear.
   */
  public static final int ASN_rightRear = 4;

  /**
   *  Constructs a newly allocated VerticalAccelerationThreshold.
   */
  public VerticalAccelerationThreshold ()
  {
    super();
  };

  /**
   *  Constructs a newly allocated VerticalAccelerationThreshold.
   *  Sets the number of used bits using the int parameter
   *  and sets the internal value using the bytes array parameter.
   *  @param value the value to be represented by this VerticalAccelerationThreshold.
   *  @param bitCount the number of used bits to be represented by this VerticalAccelerationThreshold.
   *  @throws IllegalArgumentException if the bitCount is not consistent with the length of the value.
   */
  public VerticalAccelerationThreshold (byte[] value, int bitCount)
  {
    super(value, bitCount);
  }

  /**
   *  Constructs a newly allocated VerticalAccelerationThreshold.
   *  Sets the number of used bits using the int parameter
   *  and sets the internal value using the subarray of bytes.
   *  @param value the array containing the value to be represented by this VerticalAccelerationThreshold.
   *  @param bitOffset  the index of the first bit to be represented by this VerticalAccelerationThreshold.
   *  @param bitCount the number of used bits to be represented by this VerticalAccelerationThreshold.
   *  @throws IllegalArgumentException if the bitCount and bitOffset are not consistent with the length of the value.
   */
  public VerticalAccelerationThreshold (byte[] value, int bitOffset, int bitCount)
  {
    super(value, bitOffset, bitCount);
  }
}
