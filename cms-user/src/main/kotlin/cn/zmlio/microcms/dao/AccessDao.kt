package cn.zmlio.microcms.dao

import cn.zmlio.microcms.entity.AccessEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AccessDao : JpaRepository<AccessEntity, Long> {
}