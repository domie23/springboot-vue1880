package com.entity.view;

import com.entity.YimiaoLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 疫苗留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yimiao_liuyan")
public class YimiaoLiuyanView extends YimiaoLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 yimiao
			/**
			* 疫苗名称
			*/
			private String yimiaoName;
			/**
			* 疫苗类型
			*/
			private Integer yimiaoTypes;
				/**
				* 疫苗类型的值
				*/
				private String yimiaoValue;
			/**
			* 疫苗
			*/
			private String yimiaoPhoto;
			/**
			* 剩余数量
			*/
			private Integer yimiaoDnumber;
			/**
			* 疫苗详情
			*/
			private String yimiaoContent;
			/**
			* 逻辑删除
			*/
			private Integer yimiaoDelete;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public YimiaoLiuyanView() {

	}

	public YimiaoLiuyanView(YimiaoLiuyanEntity yimiaoLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, yimiaoLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
















				//级联表的get和set yimiao

					/**
					* 获取： 疫苗名称
					*/
					public String getYimiaoName() {
						return yimiaoName;
					}
					/**
					* 设置： 疫苗名称
					*/
					public void setYimiaoName(String yimiaoName) {
						this.yimiaoName = yimiaoName;
					}

					/**
					* 获取： 疫苗类型
					*/
					public Integer getYimiaoTypes() {
						return yimiaoTypes;
					}
					/**
					* 设置： 疫苗类型
					*/
					public void setYimiaoTypes(Integer yimiaoTypes) {
						this.yimiaoTypes = yimiaoTypes;
					}


						/**
						* 获取： 疫苗类型的值
						*/
						public String getYimiaoValue() {
							return yimiaoValue;
						}
						/**
						* 设置： 疫苗类型的值
						*/
						public void setYimiaoValue(String yimiaoValue) {
							this.yimiaoValue = yimiaoValue;
						}

					/**
					* 获取： 疫苗
					*/
					public String getYimiaoPhoto() {
						return yimiaoPhoto;
					}
					/**
					* 设置： 疫苗
					*/
					public void setYimiaoPhoto(String yimiaoPhoto) {
						this.yimiaoPhoto = yimiaoPhoto;
					}

					/**
					* 获取： 剩余数量
					*/
					public Integer getYimiaoDnumber() {
						return yimiaoDnumber;
					}
					/**
					* 设置： 剩余数量
					*/
					public void setYimiaoDnumber(Integer yimiaoDnumber) {
						this.yimiaoDnumber = yimiaoDnumber;
					}

					/**
					* 获取： 疫苗详情
					*/
					public String getYimiaoContent() {
						return yimiaoContent;
					}
					/**
					* 设置： 疫苗详情
					*/
					public void setYimiaoContent(String yimiaoContent) {
						this.yimiaoContent = yimiaoContent;
					}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getYimiaoDelete() {
						return yimiaoDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setYimiaoDelete(Integer yimiaoDelete) {
						this.yimiaoDelete = yimiaoDelete;
					}










				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
