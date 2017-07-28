package cn.zmlio.microcms.dao

import cn.zmlio.microcms.entity.RoleEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RoleDao : JpaRepository<RoleEntity, Long> {
}