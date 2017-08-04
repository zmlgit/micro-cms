package cn.zmlio.microcms.entity

import org.hibernate.annotations.Where
import java.sql.Timestamp
import java.util.*
import javax.persistence.*

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Where(clause = "is_deleted = 0")
open class BasicEntity(@Id
                       @GeneratedValue(strategy = GenerationType.IDENTITY)
                       var id: Long) {

    @Column(nullable = false, name = "create_time")
    var createTime = Date()
    @Column(nullable = false, name = "update_time")
    var updateTime = Date()

    @Column(nullable = false, name = "is_deleted")
    var isDeleted = false
    @Column(nullable = false, name = "sys_version")
    var sysVersion = 1
    @Column(nullable = false, name = "ts")
    var timeStamp = Timestamp(System.currentTimeMillis())

    constructor() : this(0)



    override fun toString(): String {
        return "BasicEntity{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", deleted=" + isDeleted +
                ", sysVersion=" + sysVersion +
                ", timeStamp=" + timeStamp +
                '}'
    }
}
