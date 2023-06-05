package com.sankai.st.dto;

/**
 * @author liuyangyang
 * @since 2023-06-05 21:48
 */
public class GenStructFieldDto {
    /**
     * 对应字段的访问修饰符
     */
    private String accessModifier;

    /**
     * 对应字段的类型
     */
    private String fieldType;

    /**
     * 对应字段的名称
     */
    private String fieldName;

    /**
     * 对应字段的注释
     */
    private String fieldComment;


    public String getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(String accessModifier) {
        this.accessModifier = accessModifier;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldComment() {
        return fieldComment;
    }

    public void setFieldComment(String fieldComment) {
        this.fieldComment = fieldComment;
    }
}
