package com.zhss.oa.flow.model;

/**
 * @Description 授权实体类
 * @Classname Authorization
 * @Author yahui.li
 * @Date 2020-08-20 22:41
 * @Version V1.0
 */
public class Application {

    private Long id;
    private Long employeeId;
    private Integer days;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }
}
