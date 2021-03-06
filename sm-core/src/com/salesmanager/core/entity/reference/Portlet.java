package com.salesmanager.core.entity.reference;
// Generated Oct 28, 2010 6:11:59 PM by Hibernate Tools 3.2.4.GA



/**
 * Portlet generated by hbm2java
 */
public class Portlet  implements java.io.Serializable {


     private long portletId;
     private int merchantId;
     private long page;
     private String title;
     private String name;
     private Integer portletType;
     private long labelId;
     private Boolean visible;
     private Boolean enabled;
     private Integer sortOrder;
     private String columnId;
     
     private String message = null;//transient
     private DynamicLabel label = null;

    public Portlet() {
    	
    	this.visible = false;
    }

	
    public Portlet(long portletId, int merchantId, long page, String title, long labelId, String columnId) {
        this.portletId = portletId;
        this.merchantId = merchantId;
        this.page = page;
        this.title = title;
        this.labelId = labelId;
        this.columnId = columnId;
    }
    public Portlet(long portletId, int merchantId, long page, String title, String name, Integer portletType, long labelId, Boolean visible, Boolean enabled, Integer sortOrder, String columnId) {
       this.portletId = portletId;
       this.merchantId = merchantId;
       this.page = page;
       this.title = title;
       this.name = name;
       this.portletType = portletType;
       this.labelId = labelId;
       this.visible = visible;
       this.enabled = enabled;
       this.sortOrder = sortOrder;
       this.columnId = columnId;
    }
   
    public long getPortletId() {
        return this.portletId;
    }
    
    public void setPortletId(long portletId) {
        this.portletId = portletId;
    }
    public int getMerchantId() {
        return this.merchantId;
    }
    
    public void setMerchantId(int merchantId) {
        this.merchantId = merchantId;
    }
    public long getPage() {
        return this.page;
    }
    
    public void setPage(long page) {
        this.page = page;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Integer getPortletType() {
        return this.portletType;
    }
    
    public void setPortletType(Integer portletType) {
        this.portletType = portletType;
    }
    public long getLabelId() {
        return this.labelId;
    }
    
    public void setLabelId(long labelId) {
        this.labelId = labelId;
    }
    public Boolean getVisible() {
        return this.visible;
    }
    
    public void setVisible(Boolean visible) {
        this.visible = visible;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    public Integer getSortOrder() {
        return this.sortOrder;
    }
    
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }
    public String getColumnId() {
        return this.columnId;
    }
    
    public void setColumnId(String columnId) {
        this.columnId = columnId;
    }


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public DynamicLabel getLabel() {
		return label;
	}


	public void setLabel(DynamicLabel label) {
		this.label = label;
	}




}


