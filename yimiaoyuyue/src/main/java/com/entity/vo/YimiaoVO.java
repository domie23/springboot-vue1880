package com.entity.vo;

import com.entity.YimiaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 疫苗信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yimiao")
public class YimiaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
