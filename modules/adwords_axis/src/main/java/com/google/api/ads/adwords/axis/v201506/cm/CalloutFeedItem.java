/**
 * CalloutFeedItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201506.cm;


/**
 * Represents a callout extension.
 */
public class CalloutFeedItem  extends com.google.api.ads.adwords.axis.v201506.cm.ExtensionFeedItem  implements java.io.Serializable {
    /* The callout text.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 25, inclusive.</span> */
    private java.lang.String calloutText;

    public CalloutFeedItem() {
    }

    public CalloutFeedItem(
           java.lang.Long feedId,
           java.lang.Long feedItemId,
           com.google.api.ads.adwords.axis.v201506.cm.FeedItemStatus status,
           com.google.api.ads.adwords.axis.v201506.cm.FeedType feedType,
           java.lang.String startTime,
           java.lang.String endTime,
           com.google.api.ads.adwords.axis.v201506.cm.FeedItemDevicePreference devicePreference,
           com.google.api.ads.adwords.axis.v201506.cm.FeedItemScheduling scheduling,
           com.google.api.ads.adwords.axis.v201506.cm.FeedItemPolicyData[] policyData,
           java.lang.String extensionFeedItemType,
           java.lang.String calloutText) {
        super(
            feedId,
            feedItemId,
            status,
            feedType,
            startTime,
            endTime,
            devicePreference,
            scheduling,
            policyData,
            extensionFeedItemType);
        this.calloutText = calloutText;
    }


    /**
     * Gets the calloutText value for this CalloutFeedItem.
     * 
     * @return calloutText   * The callout text.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 25, inclusive.</span>
     */
    public java.lang.String getCalloutText() {
        return calloutText;
    }


    /**
     * Sets the calloutText value for this CalloutFeedItem.
     * 
     * @param calloutText   * The callout text.
     *                     <span class="constraint StringLength">The length
     * of this string should be between 1 and 25, inclusive.</span>
     */
    public void setCalloutText(java.lang.String calloutText) {
        this.calloutText = calloutText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CalloutFeedItem)) return false;
        CalloutFeedItem other = (CalloutFeedItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.calloutText==null && other.getCalloutText()==null) || 
             (this.calloutText!=null &&
              this.calloutText.equals(other.getCalloutText())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCalloutText() != null) {
            _hashCode += getCalloutText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CalloutFeedItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "CalloutFeedItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calloutText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "calloutText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
