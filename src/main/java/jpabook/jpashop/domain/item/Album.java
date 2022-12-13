package jpabook.jpashop.domain.item;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A")
@Getter
@Setter
//@SuperBuilder
//@NoArgsConstructor(access = AccessLevel.PRIVATE)
//@AllArgsConstructor
public class Album extends Item{

    private String artist;
    private String etc;
}
