package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 疫苗信息
 *
 * @author 
 * @email
 */
@TableName("yimiao")
public class YimiaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YimiaoEntity() {

	}

	public YimiaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 疫苗名称
     */
    @TableField(value = "yimiao_name")

    private String yimiaoName;


    /**
     * 疫苗类型
     */
    @TableField(value = "yimiao_types")

    private Integer yimiaoTypes;


    /**
     * 疫苗
     */
    @TableField(value = "yimiao_photo")

    private String yimiaoPhoto;


    /**
     * 剩余数量
     */
    @TableField(value = "yimiao_dnumber")

    private Integer yimiaoDnumber;


    /**
     * 疫苗详情
     */
    @TableField(value = "yimiao_content")

    private String yimiaoContent;


    /**
     * 逻辑删除
     */
    @TableField(value = "yimiao_delete")

    private Integer yimiaoDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：疫苗名称
	 */
    public String getYimiaoName() {
        return yimiaoName;
    }
    /**
	 * 获取：疫苗名称
	 */

    public void setYimiaoName(String yimiaoName) {
        this.yimiaoName = yimiaoName;
    }
    /**
	 * 设置：疫苗类型
	 */
    public Integer getYimiaoTypes() {
        return yimiaoTypes;
    }
    /**
	 * 获取：疫苗类型
	 */

    public void setYimiaoTypes(Integer yimiaoTypes) {
        this.yimiaoTypes = yimiaoTypes;
    }
    /**
	 * 设置：疫苗
	 */
    public String getYimiaoPhoto() {
        return yimiaoPhoto;
    }
    /**
	 * 获取：疫苗
	 */

    public void setYimiaoPhoto(String yimiaoPhoto) {
        this.yimiaoPhoto = yimiaoPhoto;
    }
    /**
	 * 设置：剩余数量
	 */
    public Integer getYimiaoDnumber() {
        return yimiaoDnumber;
    }
    /**
	 * 获取：剩余数量
	 */

    public void setYimiaoDnumber(Integer yimiaoDnumber) {
        this.yimiaoDnumber = yimiaoDnumber;
    }
    /**
	 * 设置：疫苗详情
	 */
    public String getYimiaoContent() {
        return yimiaoContent;
    }
    /**
	 * 获取：疫苗详情
	 */

    public void setYimiaoContent(String yimiaoContent) {
        this.yimiaoContent = yimiaoContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getYimiaoDelete() {
        return yimiaoDelete;
    }
    /**
	 * 获取：逻辑删除
	 */

    public void setYimiaoDelete(Integer yimiaoDelete) {
        this.yimiaoDelete = yimiaoDelete;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Yimiao{" +
            "id=" + id +
            ", yimiaoName=" + yimiaoName +
            ", yimiaoTypes=" + yimiaoTypes +
            ", yimiaoPhoto=" + yimiaoPhoto +
            ", yimiaoDnumber=" + yimiaoDnumber +
            ", yimiaoContent=" + yimiaoContent +
            ", yimiaoDelete=" + yimiaoDelete +
            ", createTime=" + createTime +
        "}";
    }
}
