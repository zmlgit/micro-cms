package cn.zmlio.microcms.entity;

import lombok.ToString;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@ToString
@Where(clause = "is_deleted = 0")
public class BasicEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, name = "create_time")
    private Date createTime = new Date();
    @Column(nullable = false, name = "update_time")
    private Date updateTime = new Date();

    @Column(nullable = false, name = "is_deleted")
    private boolean deleted = false;
    @Column(nullable = false, name = "sys_version")
    private int sysVersion = 1;
    @Column(nullable = false, name = "ts")
    private Timestamp timeStamp = new Timestamp(System.currentTimeMillis());

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public int getSysVersion() {
        return sysVersion;
    }

    public void setSysVersion(int sysVersion) {
        this.sysVersion = sysVersion;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    public BasicEntity(Date createTime, Date updateTime, boolean deleted, int sysVersion, Timestamp timeStamp) {
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.deleted = deleted;
        this.sysVersion = sysVersion;
        this.timeStamp = timeStamp;
    }

    public BasicEntity() {
    }

}
