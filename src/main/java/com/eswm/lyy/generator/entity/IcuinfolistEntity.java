package com.eswm.lyy.generator.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ${comments}
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-01-26 17:21:38
 */
@Data
@TableName("icuInfoList")
public class IcuinfolistEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Date outtime;
	/**
	 * $column.comments
	 */
	private String prn;
	/**
	 * $column.comments
	 */
	private Integer id;
	/**
	 * $column.comments
	 */
	private String icuname;
	/**
	 * $column.comments
	 */
	private Integer times;
	/**
	 * $column.comments
	 */
	private Date opintime;
	/**
	 * $column.comments
	 */
	private String icucode;
	/**
	 * $column.comments
	 */
	private String hospcode;

}
