/*
Copyright (C) 1999-2011 Marben Products. All rights reserved.

THIS FILE IS PROPRIETARY MATERIAL OF MARBEN PRODUCTS.
AND MAY BE USED ONLY BY DIRECT LICENSEES OF ASNSDK PRODUCT.
THIS FILE MAY NOT BE DISTRIBUTED.

===========================================================================

/home/itsrc/J2375_2016/src/asncode/dsrc/VehicleStatusDeviceTypeTag.java: 

Generated by ASNSDK TCE-JAVA ASN.1 Compiler v4.0 - REF_8.55 - REF_8.39

===========================================================================
*/
package j2375.dsrc.asncode.dsrc;

/**
 * <BR> Values 000 to 080 in steps of 50kg
 * <BR> Values 081 to 200 in steps of 500kg
 * <BR> Values 201 to 253 in steps of 2000kg
 * <BR> The Value 254 shall be used for weights above 170000 kg
 * <BR> The Value 255 shall be used when the value is unknown or unavailable
 * <BR> Encoded such that the values:
 * <BR>  81 represents   4500 kg
 * <BR> 181 represents  54500 kg
 * <BR> 253 represents 170000 kg
 * Class definition of the VehicleStatusDeviceTypeTag type of the dsrc module.
 */
public class VehicleStatusDeviceTypeTag extends fr.marben.asnsdk.japi.spe.ExtEnumeratedValue
{
  /**
   * value of the named enumerated unknown.
   */
  public static final int ASN_unknown = 0;

  /**
   * value of the named enumerated lights.
   */
  public static final int ASN_lights = 1;

  /**
   * value of the named enumerated wipers.
   */
  public static final int ASN_wipers = 2;

  /**
   * value of the named enumerated brakes.
   */
  public static final int ASN_brakes = 3;

  /**
   * value of the named enumerated stab.
   */
  public static final int ASN_stab = 4;

  /**
   * value of the named enumerated trac.
   */
  public static final int ASN_trac = 5;

  /**
   * value of the named enumerated abs.
   */
  public static final int ASN_abs = 6;

  /**
   * value of the named enumerated sunS.
   */
  public static final int ASN_sunS = 7;

  /**
   * value of the named enumerated rainS.
   */
  public static final int ASN_rainS = 8;

  /**
   * value of the named enumerated airTemp.
   */
  public static final int ASN_airTemp = 9;

  /**
   * value of the named enumerated steering.
   */
  public static final int ASN_steering = 10;

  /**
   * value of the named enumerated vertAccelThres.
   */
  public static final int ASN_vertAccelThres = 11;

  /**
   * value of the named enumerated vertAccel.
   */
  public static final int ASN_vertAccel = 12;

  /**
   * value of the named enumerated hozAccelLong.
   */
  public static final int ASN_hozAccelLong = 13;

  /**
   * value of the named enumerated hozAccelLat.
   */
  public static final int ASN_hozAccelLat = 14;

  /**
   * value of the named enumerated hozAccelCon.
   */
  public static final int ASN_hozAccelCon = 15;

  /**
   * value of the named enumerated accel4way.
   */
  public static final int ASN_accel4way = 16;

  /**
   * value of the named enumerated confidenceSet.
   */
  public static final int ASN_confidenceSet = 17;

  /**
   * value of the named enumerated obDist.
   */
  public static final int ASN_obDist = 18;

  /**
   * value of the named enumerated obDirect.
   */
  public static final int ASN_obDirect = 19;

  /**
   * value of the named enumerated yaw.
   */
  public static final int ASN_yaw = 20;

  /**
   * value of the named enumerated yawRateCon.
   */
  public static final int ASN_yawRateCon = 21;

  /**
   * value of the named enumerated dateTime.
   */
  public static final int ASN_dateTime = 22;

  /**
   * value of the named enumerated fullPos.
   */
  public static final int ASN_fullPos = 23;

  /**
   * value of the named enumerated position2D.
   */
  public static final int ASN_position2D = 24;

  /**
   * value of the named enumerated position3D.
   */
  public static final int ASN_position3D = 25;

  /**
   * value of the named enumerated vehicle.
   */
  public static final int ASN_vehicle = 26;

  /**
   * value of the named enumerated speedHeadC.
   */
  public static final int ASN_speedHeadC = 27;

  /**
   * value of the named enumerated speedC.
   */
  public static final int ASN_speedC = 28;

  /**
   *  Constructs a newly allocated VehicleStatusDeviceTypeTag.
   */
  public VehicleStatusDeviceTypeTag ()
  {
    super();
  };

  /**
   *  Constructs a newly allocated VehicleStatusDeviceTypeTag that represents the primitive int argument.
   *  @param value the value to be represented by this VehicleStatusDeviceTypeTag.
   */
  public VehicleStatusDeviceTypeTag (int value)
  {
    super(value);
  };

  /**
   *  Constructs a newly allocated VehicleStatusDeviceTypeTag that represents the unknownExt argument.
   *  @param unknownExt the unknown extension value to be represented by this VehicleStatusDeviceTypeTag.
   */
  public VehicleStatusDeviceTypeTag (fr.marben.asnsdk.japi.UnknownExtensionValue unknownExt)
  {
    super(unknownExt);
  };
}
