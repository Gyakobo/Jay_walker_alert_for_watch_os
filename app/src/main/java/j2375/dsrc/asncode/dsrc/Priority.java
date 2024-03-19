/*
Copyright (C) 1999-2011 Marben Products. All rights reserved.

THIS FILE IS PROPRIETARY MATERIAL OF MARBEN PRODUCTS.
AND MAY BE USED ONLY BY DIRECT LICENSEES OF ASNSDK PRODUCT.
THIS FILE MAY NOT BE DISTRIBUTED.

===========================================================================

/home/itsrc/J2375_2016/src/asncode/dsrc/Priority.java: 

Generated by ASNSDK TCE-JAVA ASN.1 Compiler v4.0 - REF_8.55 - REF_8.39

===========================================================================
*/
package j2375.dsrc.asncode.dsrc;

/**
 * Class definition of the Priority type of the dsrc module.
 */
public class Priority extends fr.marben.asnsdk.japi.spe.OctetStringValue
{
  /**
   *  Constructs a newly allocated Priority.
   */
  public Priority ()
  {
    super();
  };

  /**
   * Constructor of the Priority.
   */
  public Priority (byte[] value)
  {
    super(value);
  }
  /**
   *  Constructs a newly allocated Priority from a subarray of bytes.
   *  @param value the byte array used to initialize this OctetStringValue
   *  @param offset the index of the first byte to store in this OctetStringValue
   *  @param count the number of bytes to store in this OctetStringValue
   */
  public Priority (byte[] value, int offset, int count)
  {
    super(value, offset, count);
  }
}
