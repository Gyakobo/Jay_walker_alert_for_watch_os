/*
Copyright (C) 1999-2011 Marben Products. All rights reserved.

THIS FILE IS PROPRIETARY MATERIAL OF MARBEN PRODUCTS.
AND MAY BE USED ONLY BY DIRECT LICENSEES OF ASNSDK PRODUCT.
THIS FILE MAY NOT BE DISTRIBUTED.

===========================================================================

/home/itsrc/J2375_2016/src/asncode/dsrc/EmergencyDetails.java: 

Generated by ASNSDK TCE-JAVA ASN.1 Compiler v4.0 - REF_8.55 - REF_8.39

===========================================================================
*/
package j2375.dsrc.asncode.dsrc;

/**
 * Class definition of the EmergencyDetails type of the dsrc module.
 */
public class EmergencyDetails extends fr.marben.asnsdk.japi.spe.ExtSequenceValue
{
  /**
   * value of the typeIndex field for this class.
   */
  public static final int ASNTYPE = 69;

  /**
   * <BR> CERT SSP Privilege Details
   * mandatory field sspRights.
   */
  public j2375.dsrc.asncode.dsrc.SSPindex sspRights;

  /**
   * <BR> index set by CERT
   * mandatory field sirenUse.
   */
  public j2375.dsrc.asncode.dsrc.SirenInUse sirenUse;

  /**
   * mandatory field lightsUse.
   */
  public j2375.dsrc.asncode.dsrc.LightbarInUse lightsUse;

  /**
   * mandatory field multi.
   */
  public j2375.dsrc.asncode.dsrc.MultiVehicleResponse multi;

  /**
   * optional field events.
   */
  public j2375.dsrc.asncode.dsrc.PrivilegedEvents events;

  /**
   * optional field responseType.
   */
  public j2375.dsrc.asncode.dsrc.ResponseType responseType;

  /**
   *  Constructs a newly allocated EmergencyDetails.
   */
  public EmergencyDetails ()
  {
    super();
  };

  /**
   *  Gets the value of a component from this EmergencyDetails.
   *  This method is only for ASNSDK internal use.
   *  @param context a fr.marben.asnsdk.japi.Context.
   *  @param field the named type identifier of the component.
   *  @return the value identified by the named type.
   */
   public fr.marben.asnsdk.japi.vi.IValue asnGetSetSeqValue(
                           fr.marben.asnsdk.japi.Context context,
                           fr.marben.asnsdk.japi.vi.ISetSeqNamedType field)
   {
     switch (field.getFieldNumber(context))
     {
     case 0 :
       return this.sspRights;
     case 1 :
       return this.sirenUse;
     case 2 :
       return this.lightsUse;
     case 3 :
       return this.multi;
     case 4 :
       return this.events;
     case 5 :
       return this.responseType;
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to set field number " + field.getFieldNumber(context));
     }
   }

  /**
   *  Creates a newly allocated component value from this EmergencyDetails.
   *  this value is created for temporary use to solve atNotations
   *  This method is only for ASNSDK internal use.
   *  @param context a fr.marben.asnsdk.japi.Context.
   *  @param field the named type of this EmergencyDetails.
   *  @return a value from a class implementing the IValue interface.
   */
   public fr.marben.asnsdk.japi.vi.IValue asnSetNewTmpSetSeqValue(
                           fr.marben.asnsdk.japi.Context context,
                           fr.marben.asnsdk.japi.vi.ISetSeqNamedType field)
   {
     switch (field.getFieldNumber(context))
     {
     case 0 :
       return new j2375.dsrc.asncode.dsrc.SSPindex();
     case 1 :
       return new j2375.dsrc.asncode.dsrc.SirenInUse();
     case 2 :
       return new j2375.dsrc.asncode.dsrc.LightbarInUse();
     case 3 :
       return new j2375.dsrc.asncode.dsrc.MultiVehicleResponse();
     case 4 :
       return new j2375.dsrc.asncode.dsrc.PrivilegedEvents();
     case 5 :
       return new j2375.dsrc.asncode.dsrc.ResponseType();
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to create field number " + field.getFieldNumber(context));
     }
   }

  /**
   *  Creates and sets a newly allocated component value from this EmergencyDetails.
   *  This method is only for ASNSDK internal use.
   *  @param context a fr.marben.asnsdk.japi.Context.
   *  @param field the named type of this EmergencyDetails.
   *  @return a value from a class implementing the IValue interface.
   */
   public fr.marben.asnsdk.japi.vi.IValue asnSetNewSetSeqValue(
                           fr.marben.asnsdk.japi.Context context,
                           fr.marben.asnsdk.japi.vi.ISetSeqNamedType field)
   {
     switch (field.getFieldNumber(context))
     {
     case 0 :
       this.sspRights = new j2375.dsrc.asncode.dsrc.SSPindex();
       return this.sspRights;
     case 1 :
       this.sirenUse = new j2375.dsrc.asncode.dsrc.SirenInUse();
       return this.sirenUse;
     case 2 :
       this.lightsUse = new j2375.dsrc.asncode.dsrc.LightbarInUse();
       return this.lightsUse;
     case 3 :
       this.multi = new j2375.dsrc.asncode.dsrc.MultiVehicleResponse();
       return this.multi;
     case 4 :
       this.events = new j2375.dsrc.asncode.dsrc.PrivilegedEvents();
       return this.events;
     case 5 :
       this.responseType = new j2375.dsrc.asncode.dsrc.ResponseType();
       return this.responseType;
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to create field number " + field.getFieldNumber(context));
     }
   }

  /**
   *  Gets a group value from the EmergencyDetails.
   *  This method is only for ASNSDK internal use.
   *  @param context a fr.marben.asnsdk.japi.Context.
   *  @param group the extension group.
   *  @param field the named type of the extension group.
   *  @return a value from a class implementing the IValue interface.
   */
   public fr.marben.asnsdk.japi.vi.IValue asnGetSetSeqGroupValue(fr.marben.asnsdk.japi.Context context,
                                fr.marben.asnsdk.japi.vi.ISetSeqExtensionGroup group,
                                fr.marben.asnsdk.japi.vi.ISetSeqNamedType field)
   {
     switch (group.getFieldNumber(context))
     {
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to find the group " + group.getFieldNumber(context));
     }
   }

  /**
   *  Returns whether or not this group is present among the extensions.
   *  @param context a fr.marben.asnsdk.japi.Context.
   *  @param group the extension group.
   *  @return <code>true</code>: when the group is present.
   *          <code>false</code>: when the group is not present.
   */
   public boolean asnIsSetSeqGroupPresent(fr.marben.asnsdk.japi.Context context,
                                fr.marben.asnsdk.japi.vi.ISetSeqExtensionGroup group)
   {
     switch (group.getFieldNumber(context))
     {
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to find the group " + group.getFieldNumber(context));
     }
   }

  /**
   *  Creates a newly allocated group value of the EmergencyDetails.
   *  This group is created for temporary use, in order to solve atNotations.
   *  This method is only for ASNSDK internal use.
   *  @param context a fr.marben.asnsdk.japi.Context.
   *  @param group the extension group.
   *  @param field the named type of the extension group.
   *  @return a value from a class implementing the IValue interface.
   */
   public fr.marben.asnsdk.japi.vi.IValue asnSetNewTmpSetSeqGroupValue(fr.marben.asnsdk.japi.Context context,
                                fr.marben.asnsdk.japi.vi.ISetSeqExtensionGroup group,
                                fr.marben.asnsdk.japi.vi.ISetSeqNamedType field)
   {
     switch (group.getFieldNumber(context))
     {
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to find the group " + group.getFieldNumber(context));
     }
   }

  /**
   *  Creates and sets a newly allocated group value of the EmergencyDetails.
   *  This method is only for ASNSDK internal use.
   *  @param context a fr.marben.asnsdk.japi.Context.
   *  @param group the extension group.
   *  @param field the named type of the extension group.
   *  @return a value from a class implementing the IValue interface.
   */
   public fr.marben.asnsdk.japi.vi.IValue asnSetNewSetSeqGroupValue(fr.marben.asnsdk.japi.Context context,
                                fr.marben.asnsdk.japi.vi.ISetSeqExtensionGroup group,
                                fr.marben.asnsdk.japi.vi.ISetSeqNamedType field)
   {
     switch (group.getFieldNumber(context))
     {
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to find the group " + group.getFieldNumber(context));
     }
   }

  /**
   *  Gets the typeIndex value for this class.
   *  This method is only for ASNSDK internal use. 
   *  @return the type index.
   */
  public int asnGetTypeIndex()
  {
    return 69;
  }

}
