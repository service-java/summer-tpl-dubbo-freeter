package com.freeter.modules.adverts.entity.model;

import com.freeter.modules.adverts.entity.AdvertsEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import com.freeter.common.annotation.OwnerTable;
 

/**
 * 广告位表
 * 接收传参的实体类  
 *（后台接收参数） 
 * 取自ModelAndView 的model名称
 * @author xuchen
 * @email 171998110@qq.com
 * @date 2018-08-21 12:36:59
 */
@OwnerTable(AdvertsEntity.class)
@ApiModel(value = "AdvertsModel")
public class AdvertsModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 	
	/**
	 * 广告位ID
	 */
	
	@ApiModelProperty(value = "广告位ID") 
	private Long advertsId;

	
	/**
	 * 名称
	 */
	
	@ApiModelProperty(value = "名称") 
	private String name;

	
	/**
	 * 宽度
	 */
	
	@ApiModelProperty(value = "宽度") 
	private Integer width;

	
	/**
	 * 高度
	 */
	
	@ApiModelProperty(value = "高度") 
	private Integer height;

	
	/**
	 * 描述
	 */
	
	@ApiModelProperty(value = "描述") 
	private String description;

	
	/**
	 * 模版内容
	 */
	
	@ApiModelProperty(value = "模版内容") 
	private String template;

	
	/**
	 * 默认显示个数
	 */
	
	@ApiModelProperty(value = "默认显示个数") 
	private Integer defultNumber;

	
	/**
	 * 广告数量
	 */
	
	@ApiModelProperty(value = "广告数量") 
	private Integer number;

	
	/**
	 * 创建时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	@ApiModelProperty(value = "创建时间") 
	private Date createTime;

	
	/**
	 * 创建者
	 */
	
	@ApiModelProperty(value = "创建者") 
	private String createBy;

	
	/**
	 * 更新时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	@ApiModelProperty(value = "更新时间") 
	private Date updateTime;

	
	/**
	 * 更新者
	 */
	
	@ApiModelProperty(value = "更新者") 
	private String updateBy;

	
	/**
	 * 启用状态(0:开启，1：关闭)
	 */
	
	@ApiModelProperty(value = "启用状态(0:开启，1：关闭)") 
	private Integer status;

 	
	
	/**
	 * 设置：广告位ID
	 */
	 
	public void setAdvertsId(Long advertsId) {
		this.advertsId = advertsId;
	}
	
	/**
	 * 获取：广告位ID
	 */
	public Long getAdvertsId() {
		return advertsId;
	}
 	 	
	
	/**
	 * 设置：名称
	 */
	 
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 获取：名称
	 */
	public String getName() {
		return name;
	}
 	 	
	
	/**
	 * 设置：宽度
	 */
	 
	public void setWidth(Integer width) {
		this.width = width;
	}
	
	/**
	 * 获取：宽度
	 */
	public Integer getWidth() {
		return width;
	}
 	 	
	
	/**
	 * 设置：高度
	 */
	 
	public void setHeight(Integer height) {
		this.height = height;
	}
	
	/**
	 * 获取：高度
	 */
	public Integer getHeight() {
		return height;
	}
 	 	
	
	/**
	 * 设置：描述
	 */
	 
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * 获取：描述
	 */
	public String getDescription() {
		return description;
	}
 	 	
	
	/**
	 * 设置：模版内容
	 */
	 
	public void setTemplate(String template) {
		this.template = template;
	}
	
	/**
	 * 获取：模版内容
	 */
	public String getTemplate() {
		return template;
	}
 	 	
	
	/**
	 * 设置：默认显示个数
	 */
	 
	public void setDefultNumber(Integer defultNumber) {
		this.defultNumber = defultNumber;
	}
	
	/**
	 * 获取：默认显示个数
	 */
	public Integer getDefultNumber() {
		return defultNumber;
	}
 	 	
	
	/**
	 * 设置：广告数量
	 */
	 
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	/**
	 * 获取：广告数量
	 */
	public Integer getNumber() {
		return number;
	}
 	 	
	
	/**
	 * 设置：创建时间
	 */
	 
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
 	 	
	
	/**
	 * 设置：创建者
	 */
	 
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	
	/**
	 * 获取：创建者
	 */
	public String getCreateBy() {
		return createBy;
	}
 	 	
	
	/**
	 * 设置：更新时间
	 */
	 
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	/**
	 * 获取：更新时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
 	 	
	
	/**
	 * 设置：更新者
	 */
	 
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	
	/**
	 * 获取：更新者
	 */
	public String getUpdateBy() {
		return updateBy;
	}
 	 	
	
	/**
	 * 设置：启用状态(0:开启，1：关闭)
	 */
	 
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	/**
	 * 获取：启用状态(0:开启，1：关闭)
	 */
	public Integer getStatus() {
		return status;
	}
 		
}
