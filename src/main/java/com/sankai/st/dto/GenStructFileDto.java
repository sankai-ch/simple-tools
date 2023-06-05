package com.sankai.st.dto;

import java.util.List;
import java.util.Map;

/**
 * 生成实体文件对应属性dto
 *
 * @author sankai
 * @since 2023-06-03 13:06:23
 */
public class GenStructFileDto {

    /**
     * 包名,非必须
     */
    private String packageName;

    /**
     * 表名
     */
    private String tableName;

    /**
     * 字段列表
     */
    private List<GenStructFieldDto> fieldList;

    /**
     * 额外的属性
     */
    private Map<String, Object> extra;

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<GenStructFieldDto> getFieldList() {
        return fieldList;
    }

    public void setFieldList(List<GenStructFieldDto> fieldList) {
        this.fieldList = fieldList;
    }

    public Map<String, Object> getExtra() {
        return extra;
    }

    public void setExtra(Map<String, Object> extra) {
        this.extra = extra;
    }
}
