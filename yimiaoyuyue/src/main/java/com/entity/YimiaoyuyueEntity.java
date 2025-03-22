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
 * 预约疫苗
 *
 * @author 
 * @email
 */
@TableName("yimiaoyuyue")
public class YimiaoyuyueEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YimiaoyuyueEntity() {

	}

	public YimiaoyuyueEntity(T t) {
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
     * 疫苗
     */
    @TableField(value = "yimiao_id")

    private Integer yimiaoId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 预约日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "yimiaoyuyue_time")

    private Date yimiaoyuyueTime;


    /**
     * 预约人数
     */
    @TableField(value = "yimiaoyuyue_number")

    private Integer yimiaoyuyueNumber;


    /**
     * 预约时间段
     */
    @TableField(value = "shijianduan_types")

    private Integer shijianduanTypes;


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
	 * 设置：疫苗
	 */
    public Integer getYimiaoId() {
        return yimiaoId;
    }
    /**
	 * 获取：疫苗
	 */

    public void setYimiaoId(Integer yimiaoId) {
        this.yimiaoId = yimiaoId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：预约日期
	 */
    public Date getYimiaoyuyueTime() {
        return yimiaoyuyueTime;
    }
    /**
	 * 获取：预约日期
	 */

    public void setYimiaoyuyueTime(Date yimiaoyuyueTime) {
        this.yimiaoyuyueTime = yimiaoyuyueTime;
    }
    /**
	 * 设置：预约人数
	 */
    public Integer getYimiaoyuyueNumber() {
        return yimiaoyuyueNumber;
    }
    /**
	 * 获取：预约人数
	 */

    public void setYimiaoyuyueNumber(Integer yimiaoyuyueNumber) {
        this.yimiaoyuyueNumber = yimiaoyuyueNumber;
    }
    /**
	 * 设置：预约时间段
	 */
    public Integer getShijianduanTypes() {
        return shijianduanTypes;
    }
    /**
	 * 获取：预约时间段
	 */

    public void setShijianduanTypes(Integer shijianduanTypes) {
        this.shijianduanTypes = shijianduanTypes;
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
        return "Yimiaoyuyue{" +
            "id=" + id +
            ", yimiaoId=" + yimiaoId +
            ", yonghuId=" + yonghuId +
            ", yimiaoyuyueTime=" + yimiaoyuyueTime +
            ", yimiaoyuyueNumber=" + yimiaoyuyueNumber +
            ", shijianduanTypes=" + shijianduanTypes +
            ", createTime=" + createTime +
        "}";
    }
}
