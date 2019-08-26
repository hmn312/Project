package com.cssl.po;

    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableField;
    import com.baomidou.mybatisplus.extension.activerecord.Model;
    import com.baomidou.mybatisplus.annotation.TableId;
    import java.time.LocalDateTime;
    import java.io.Serializable;

/**
* <p>
    * 
    * </p>
*
* @author hmn
* @since 2019-08-03
*/
    public class Student extends Model<Student> {

    private static final long serialVersionUID = 1L;

            @TableId(value = "sid", type = IdType.AUTO)
    private Integer sid;

            @TableField(value = "sname")
    private String sname;

    @TableField(value = "bornDate")
    private LocalDateTime bornDate;

        public Integer getSid() {
        return sid;
        }

            public void setSid(Integer sid) {
        this.sid = sid;
        }
        public String getSname() {
        return sname;
        }

            public void setSname(String sname) {
        this.sname = sname;
        }
        public LocalDateTime getBornDate() {
        return bornDate;
        }

            public void setBornDate(LocalDateTime bornDate) {
        this.bornDate = bornDate;
        }

    @Override
    protected Serializable pkVal() {
        return this.sid;
    }

    @Override
    public String toString() {
    return "Student{" +
            "sid=" + sid +
            ", sname=" + sname +
            ", bornDate=" + bornDate +
    "}";
    }
}
