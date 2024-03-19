/*
Copyright (C) 1999-2011 Marben Products. All rights reserved.

THIS FILE IS PROPRIETARY MATERIAL OF MARBEN PRODUCTS.
AND MAY BE USED ONLY BY DIRECT LICENSEES OF ASNSDK PRODUCT.
THIS FILE MAY NOT BE DISTRIBUTED.

===========================================================================

/home/itsrc/J2375_2016/src/asncode/dsrc/BasicVehicleRole.java: 

Generated by ASNSDK TCE-JAVA ASN.1 Compiler v4.0 - REF_8.55 - REF_8.39

===========================================================================
*/
package j2375.dsrc.asncode.dsrc;

/**
 * Class definition of the BasicVehicleRole type of the dsrc module.
 */
public class BasicVehicleRole extends fr.marben.asnsdk.japi.spe.ExtEnumeratedValue
{
  /**
   * value of the named enumerated basicVehicle.
   */
  public static final int ASN_basicVehicle = 0;

  /**
   * value of the named enumerated publicTransport.
   */
  public static final int ASN_publicTransport = 1;

  /**
   * value of the named enumerated specialTransport.
   */
  public static final int ASN_specialTransport = 2;

  /**
   * value of the named enumerated dangerousGoods.
   */
  public static final int ASN_dangerousGoods = 3;

  /**
   * value of the named enumerated roadWork.
   */
  public static final int ASN_roadWork = 4;

  /**
   * value of the named enumerated roadRescue.
   */
  public static final int ASN_roadRescue = 5;

  /**
   * value of the named enumerated emergency.
   */
  public static final int ASN_emergency = 6;

  /**
   * value of the named enumerated safetyCar.
   */
  public static final int ASN_safetyCar = 7;

  /**
   * value of the named enumerated none_unknown.
   */
  public static final int ASN_none_unknown = 8;

  /**
   * value of the named enumerated truck.
   */
  public static final int ASN_truck = 9;

  /**
   * value of the named enumerated motorcycle.
   */
  public static final int ASN_motorcycle = 10;

  /**
   * value of the named enumerated roadSideSource.
   */
  public static final int ASN_roadSideSource = 11;

  /**
   * value of the named enumerated police.
   */
  public static final int ASN_police = 12;

  /**
   * value of the named enumerated fire.
   */
  public static final int ASN_fire = 13;

  /**
   * value of the named enumerated ambulance.
   */
  public static final int ASN_ambulance = 14;

  /**
   * value of the named enumerated dot.
   */
  public static final int ASN_dot = 15;

  /**
   * value of the named enumerated transit.
   */
  public static final int ASN_transit = 16;

  /**
   * value of the named enumerated slowMoving.
   */
  public static final int ASN_slowMoving = 17;

  /**
   * value of the named enumerated stopNgo.
   */
  public static final int ASN_stopNgo = 18;

  /**
   * value of the named enumerated cyclist.
   */
  public static final int ASN_cyclist = 19;

  /**
   * value of the named enumerated pedestrian.
   */
  public static final int ASN_pedestrian = 20;

  /**
   * value of the named enumerated nonMotorized.
   */
  public static final int ASN_nonMotorized = 21;

  /**
   * value of the named enumerated military.
   */
  public static final int ASN_military = 22;

  /**
   *  Constructs a newly allocated BasicVehicleRole.
   */
  public BasicVehicleRole ()
  {
    super();
  };

  /**
   *  Constructs a newly allocated BasicVehicleRole that represents the primitive int argument.
   *  @param value the value to be represented by this BasicVehicleRole.
   */
  public BasicVehicleRole (int value)
  {
    super(value);
  };

  /**
   *  Constructs a newly allocated BasicVehicleRole that represents the unknownExt argument.
   *  @param unknownExt the unknown extension value to be represented by this BasicVehicleRole.
   */
  public BasicVehicleRole (fr.marben.asnsdk.japi.UnknownExtensionValue unknownExt)
  {
    super(unknownExt);
  };
}
