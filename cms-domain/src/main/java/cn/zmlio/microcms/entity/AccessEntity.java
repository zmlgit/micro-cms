package cn.zmlio.microcms.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "t_access")
@Entity
@Data
public class AccessEntity extends BasicEntity {

    private String path;

    private int privilege;

}
